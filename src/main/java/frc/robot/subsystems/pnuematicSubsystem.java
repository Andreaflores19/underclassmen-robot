// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.ejml.equation.Variable;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class pnuematicSubsystem extends SubsystemBase {

  Solenoid leftRocket = new Solenoid(Constants.leftRocket);
  Solenoid rightRocket = new Solenoid(Constants.rightRocket);
  Solenoid spider = new Solenoid(Constants.spider);

  Compressor compressor = new Compressor(Constants.compressor);

  public void leftShoot(boolean b){

  leftRocket.set(b);
  }
  public void rightShoot(boolean b){
    rightRocket.set(b);
  }

  public void spider(boolean b){
    spider.set(b);
  }

  /** Creates a new pnuematicSubsystem. */
  public pnuematicSubsystem() {}
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
