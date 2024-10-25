// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public class Constants {
    // Drive Train Constants

    // Falcon?
    public static final int drivetrainLeftFalconID = 0;
    public static final int drivetrainRightFalconID = 1;

    // Sparks
    public static final int drivetrainLeftSparkID = 1;
    public static final int drivetrainLeftFollowSparkID = 2;
    public static final int drivetrainRightSparkID = 3;
    public static final int drivetrainRightFollowSparkID = 4;

    //Talon SRX
    public static final int drivetrainLFTalonSRXID = 1;
    public static final int drivetrainLBTalonSRXID = 2;
    public static final int drivetrainRFTalonSRXID = 3;
    public static final int drivetrainRBTalonSRXID = 4;

    public static final Mode currentMode = Mode.REAL;
    public static final ControlMode currentControl = ControlMode.Controller;
    public static final MotorController currentMotor = MotorController.SparkMax;

    public static final double DriveTrainForce = 12;

    public static enum Mode {
        REAL,
        SIM,
        REPLAY
    }

    public static enum MotorController {
        SparkMax,
        TalonFX,
        TalonSRX
    }
    
    public static enum ControlMode {
        Keyboard,
        Controller,
        cursedController
    }

    //Shooter Constants
    public static final int FeedID = 11;
    public static final int LaunchID = 12;
}
