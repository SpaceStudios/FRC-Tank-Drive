package frc.robot.Subsystems.Drivetrain;

import com.ctre.phoenix6.hardware.TalonSRX;

import frc.robot.Constants;

public class DriveTrainIOTalonSRX implements DrivetrainIO{

    TalonSRX LeftFront = new TalonSRX(Constants.drivetrainLFTalonSRXID);
    TalonSRX LeftBack = new TalonSRX(Constants.drivetrainLBTalonSRXID);
    TalonSRX RightFront = new TalonSRX(Constants.drivetrainRFTalonSRXID);
    TalonSRX RightBack = new TalonSRX(Constants.drivetrainRBTalonSRXID);
    
    public DriveTrainIOTalonSRX() {

    }

    @Override
    public void updateInputs(DrivetrainIOInputs inputs) {

    }

    @Override
    public void setVolts(double left, double right) {

    }
}
