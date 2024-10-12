// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public class Constants {
    public static final int drivetrainLeftFalconID = 0;
    public static final int drivetrainRightFalconID = 1;
    public static final int drivetrainLeftSparkID = 1;
    public static final int drivetrainLeftFollowSparkID = 2;
    public static final int drivetrainRightSparkID = 3;
    public static final int drivetrainRightFollowSparkID = 4;

    public static final Mode currentMode = Mode.REAL;
    public static final ControlMode currentControl = ControlMode.Controller;

    public static enum Mode {
        REAL,
        SIM,
        REPLAY
    }
    public static enum ControlMode {
        Keyboard,
        Controller,
        cursedController
    }
}
