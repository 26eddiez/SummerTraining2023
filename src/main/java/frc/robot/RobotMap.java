package frc.robot;

public class RobotMap {
    public static final class Drivetrain {
        public static final int RIGHT_MASTER_ID = 0;
        public static final int LEFT_MASTER_ID = 0;
        public static final int RIGHT_FOLLOWER_ID = 0;
        public static final int LEFT_FOLLOWER_ID = 0;
    
        public static final boolean RIGHT_MASTER_INVERT = false;
        public static final boolean LEFT_MASTER_INVERT = false;
        public static final boolean RIGHT_FOLLOWER_INVERT = false;
        public static final boolean LEFT_FOLLOWER_INVERT = false;
    }
    public static final class Elevator {
        public static final int MASTER_MOTOR_ID=0;
        public static final int FOLLOWER1_MOTOR_ID=0;
        public static final int FOLLOWER2_MOTOR_ID=0;
        public static final int FOLLOWER3_MOTOR_ID=0;
    
        public static final boolean MASTER_MOTOR_INVERT = false;
        public static final boolean FOLLOWER1_MOTOR_INVERT =false;
        public static final boolean FOLLOWER2_MOTOR_INVERT = false;
        public static final boolean FOLLOWER3_MOTOR_INVERT = false;
    }   

    public static final class Intake {
        public static final int INTAKE_MASTER_ID = 6;
        public static final int INTAKE_FOLLOWER_ID = 18;

        public static final boolean INTAKE_MASTER_INVERT = false;
        public static final boolean INTAKE_FOLLOWER_INVERT = true;
    
        public static final int INTAKE_PISTON_FORWARD = 0;
        public static final int INTAKE_PISTON_REVERSE = 2;


    }
}
