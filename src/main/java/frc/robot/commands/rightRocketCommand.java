// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.pnuematicSubsystem;

public class rightRocketCommand extends CommandBase {

private final pnuematicSubsystem subsystems;
  /** Creates a new rightRocketCommand. */
  public rightRocketCommand(pnuematicSubsystem pnuematics) {

    subsystems = pnuematics;
    addRequirements(subsystems);

   

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    //subsystems.rightShoot(true); 
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    subsystems.rightShoot(true);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    subsystems.rightShoot(false);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
