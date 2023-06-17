// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class DefaultDrive extends CommandBase {
  DriveTrain driveTrain;
  DoubleSupplier xvalue;
  DoubleSupplier yvalue;
  /** Creates a new DefaultDrive. */
  public DefaultDrive(DriveTrain subsystem,DoubleSupplier x,DoubleSupplier y) {
    driveTrain=subsystem;
    xvalue=x;
    yvalue=y;
    addRequirements(driveTrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveTrain.turnanddrive(xvalue.getAsDouble(), yvalue.getAsDouble());

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrain.turnanddrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
