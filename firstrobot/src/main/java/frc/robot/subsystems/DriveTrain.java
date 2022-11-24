// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;



public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  WPI_TalonSRX frontRight;
  WPI_TalonSRX rearRight;
  WPI_TalonSRX frontLeft;
  WPI_TalonSRX rearLeft;

  MotorControllerGroup leftMotors;
  MotorControllerGroup rightMotors;

  DifferentialDrive differentialDrive;

  public DriveTrain() {
    //assuming we don't need to invert motors on right side

    frontLeft = new WPI_TalonSRX(Constants.DRIVETRAIN_FL_TALON);
    rearLeft = new WPI_TalonSRX(Constants.DRIVETRAIN_RL_TALON);
    frontRight = new WPI_TalonSRX(Constants.DRIVETRAIN_FR_TALON);
    rearRight = new WPI_TalonSRX(Constants.DRIVETRAIN_RR_TALON);

    leftMotors = new MotorControllerGroup(frontLeft, rearLeft);
    rightMotors = new MotorControllerGroup(frontRight, rearRight);

    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double left, double right) {
    differentialDrive.tankDrive(left, right);
  }


}
