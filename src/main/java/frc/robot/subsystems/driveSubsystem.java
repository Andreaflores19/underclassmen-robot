// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class driveSubsystem extends SubsystemBase {
  /** Creates a new driveSubsystem. */

    Victor leftFrontMotor = new Victor(2);
    Victor leftRearMotor = new Victor(4);
    Victor rightFrontMotor = new Victor(3);
    Victor rightRearMotor = new Victor(5);
    
  public driveSubsystem() {

  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  //programing sucks lolololololol
  }
}
