package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase {
    private static Intake instance;  

    private TalonSRX intakeMaster;
    private TalonSRX intakeFollower;
    private DoubleSolenoid intakePiston;

    private boolean intaking; 



    private Intake() {
        intakeMaster = new TalonSRX(RobotMap.Intake.INTAKE_MASTER_ID);
        intakeFollower = new TalonSRX(RobotMap.Intake.INTAKE_FOLLOWER_ID);
    
        intakeMaster.setInverted(RobotMap.Intake.INTAKE_MASTER_INVERT);
        intakeFollower.setInverted(RobotMap.Intake.INTAKE_FOLLOWER_INVERT);
    
        intakeFollower.follow(intakeMaster); 
        
        intakePiston = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.Intake.INTAKE_PISTON_FORWARD, RobotMap.Intake.INTAKE_PISTON_REVERSE);
    
    } 
    public void setOutput(double power) {
        intakeMaster.set(ControlMode.PercentOutput, power);
        if(power > 0.1) {
            intaking = true;
        }else {
            intaking = false;
        }
    }
    public boolean isIntaking() {
        return intaking;
    }
    public void toggleState(){
        if(intakePiston.get() == DoubleSolenoid.Value.kOff) {
        intakePiston.set(DoubleSolenoid.Value.kReverse);
        }
        else {
            intakePiston.toggle();
        }
    }
    public static Intake getInstance() {
        if(instance == null){
            instance = new Intake();
        }
        return instance;
    }
   
}
