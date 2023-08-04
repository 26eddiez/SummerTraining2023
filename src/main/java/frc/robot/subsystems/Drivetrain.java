package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import harkerrobolib.wrappers.HSTalon;

public class Drivetrain extends SubsystemBase {
    private static Drivetrain instance;

    private HSTalon leftMaster, rightMaster;
    private HSTalon leftFollower, rightFollower;

    private Drivetrain() {
        rightMaster = new HSTalon(RobotMap.Drivetrain.RIGHT_MASTER_ID);
        leftMaster = new HSTalon(RobotMap.Drivetrain.LEFT_MASTER_ID);
        rightFollower = new HSTalon(RobotMap.Drivetrain.RIGHT_FOLLOWER_ID);
        leftFollower = new HSTalon(RobotMap.Drivetrain.LEFT_FOLLOWER_ID);

        rightMaster.setInverted(RobotMap.Drivetrain.RIGHT_MASTER_INVERT);
        leftMaster.setInverted(RobotMap.Drivetrain.LEFT_MASTER_INVERT);
        rightFollower.setInverted(RobotMap.Drivetrain.RIGHT_FOLLOWER_INVERT);
        leftFollower.setInverted(RobotMap.Drivetrain.LEFT_FOLLOWER_INVERT);

        rightFollower.follow(rightMaster);
        leftFollower.follow(leftMaster);

    }

    public void setAngleAndDrive(double speed, double turn) {
        rightMaster.set(ControlMode.PercentOutput, speed - turn);
        leftMaster.set(ControlMode.PercentOutput, speed + turn);
    }

    public static Drivetrain getInstance() {
        if(instance == null) {
            instance = new Drivetrain();
        }
        return instance;
    }

}