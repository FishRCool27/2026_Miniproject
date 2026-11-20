package frc.robot.subsystems;

import com.ctre.phoenix6.configs.CurrentLimitsConfigs;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.OperatorConstants.climberConstants.*;

public class Climber extends SubsystemBase {


 private final TalonFX climberMotor = new TalonFX(7); //assigns "climberMotor" to a port on the PDH.
 
 public Climber() {
 
 CurrentLimitsConfigs currentConfig = new CurrentLimitsConfigs();
 currentConfig.StatorCurrentLimit = CLIMBER_CURRENT_LIMIT;
 currentConfig.StatorCurrentLimitEnable = true;
 climberMotor.getConfigurator().apply(currentConfig);
 } 
 
  public Command deploy() {// deploys the climber, runs until the button is released
    return this.runEnd(
      ()-> climberMotor.set(0.8),
      ()->climberMotor.set(0.0)
    );
  }
  public Command stow() {//stows the climber, runs until the button is released
    return this.runEnd(
      ()-> climberMotor.set(-0.8),
      ()->climberMotor.set(0.0)
    );
    }
 
}
