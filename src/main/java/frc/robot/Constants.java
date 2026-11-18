package frc.robot;

import edu.wpi.first.math.util.Units;

public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    
    public static final class climberConstants{
      public static final int CLIMBER_MOTOR_ID = 24;
      public static final int CLIMBER_CURRENT_LIMIT = 40;
      public static final double CLIMB_VALUE = 0.7;
      public static final double CLIMB_ROTATION = -126.0;
      public static final double CLIMB_SETPOINT = -210.0;
      public static final double MIN_ANGLE = Units.degreesToRadians(0);
      public static final double MAX_Angle = Units.degreesToRadians(90);
      public static final double START_ANGLE = MIN_ANGLE;
      public static final double ZERO_ANGLE = MAX_Angle;
    }
  }
}
