package frc.robot.Subsystems.Drivetrain;

import java.lang.Cloneable;
import java.lang.Override;
import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

public class DrivetrainIOInputsAutoLogged extends DrivetrainIO.DrivetrainIOInputs implements LoggableInputs, Cloneable {
  @Override
  public void toLog(LogTable table) {
    table.put("LeftOutputVolts", leftOutputVolts);
    table.put("RightOutputVolts", rightOutputVolts);
    table.put("LeftVelocityMetersPerSecond", leftVelocityMetersPerSecond);
    table.put("RightVelocityMetersPerSecond", rightVelocityMetersPerSecond);
    table.put("LeftPositionMeters", leftPositionMeters);
    table.put("RightPositionMeters", rightPositionMeters);
    table.put("LeftCurrentAmps", leftCurrentAmps);
    table.put("LeftTempCelsius", leftTempCelsius);
    table.put("RightCurrentAmps", rightCurrentAmps);
    table.put("RightTempCelsius", rightTempCelsius);
  }

  @Override
  public void fromLog(LogTable table) {
    leftOutputVolts = table.get("LeftOutputVolts", leftOutputVolts);
    rightOutputVolts = table.get("RightOutputVolts", rightOutputVolts);
    leftVelocityMetersPerSecond = table.get("LeftVelocityMetersPerSecond", leftVelocityMetersPerSecond);
    rightVelocityMetersPerSecond = table.get("RightVelocityMetersPerSecond", rightVelocityMetersPerSecond);
    leftPositionMeters = table.get("LeftPositionMeters", leftPositionMeters);
    rightPositionMeters = table.get("RightPositionMeters", rightPositionMeters);
    leftCurrentAmps = table.get("LeftCurrentAmps", leftCurrentAmps);
    leftTempCelsius = table.get("LeftTempCelsius", leftTempCelsius);
    rightCurrentAmps = table.get("RightCurrentAmps", rightCurrentAmps);
    rightTempCelsius = table.get("RightTempCelsius", rightTempCelsius);
  }

  public DrivetrainIOInputsAutoLogged clone() {
    DrivetrainIOInputsAutoLogged copy = new DrivetrainIOInputsAutoLogged();
    copy.leftOutputVolts = this.leftOutputVolts;
    copy.rightOutputVolts = this.rightOutputVolts;
    copy.leftVelocityMetersPerSecond = this.leftVelocityMetersPerSecond;
    copy.rightVelocityMetersPerSecond = this.rightVelocityMetersPerSecond;
    copy.leftPositionMeters = this.leftPositionMeters;
    copy.rightPositionMeters = this.rightPositionMeters;
    copy.leftCurrentAmps = this.leftCurrentAmps.clone();
    copy.leftTempCelsius = this.leftTempCelsius.clone();
    copy.rightCurrentAmps = this.rightCurrentAmps.clone();
    copy.rightTempCelsius = this.rightTempCelsius.clone();
    return copy;
  }
}
