// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  Spark left1;
  Spark right1;
  Spark left2;
  Spark right2;
  /** Creates a new DriveTrain. */
  public DriveTrain() {
    left1=new Spark(0);
    right1=new Spark(1);
    left2=new Spark(3);
    right2=new Spark(2);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void turnanddrive(double xAxis, double yAxis){
    if (xAxis<-0.85 || xAxis>0.85 ){
      if (xAxis>0.3){
        xAxis=0.4;
      }
      if (xAxis<-0.3){
        xAxis=-0.4;
      }
      left1.set(xAxis);
      right1.set(xAxis);
      left2.set(xAxis);
      right2.set(xAxis);
    }
    else{
      
      if (yAxis>0.1 || yAxis<-0.1){
      left1.set(yAxis);
      left2.set(yAxis);
      right1.set(-yAxis);
      right2.set(-yAxis);
      }
      else{
        left1.set(0);
        right1.set(0);
        left2.set(0);
        right2.set(0);
      }
    }
}
}
