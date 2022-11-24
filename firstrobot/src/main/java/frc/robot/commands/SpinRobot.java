// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;


public class SpinRobot extends CommandBase {
  /** Creates a new SpinRobot. */
  private final DriveTrain m_driveTrain;
  double dist;

  public SpinRobot() {
    m_driveTrain = RobotContainer.m_driveTrain; //...
    addRequirements(m_driveTrain);
  
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrain.drive(0.9, -0.9);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.drive(0.0,0.0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
