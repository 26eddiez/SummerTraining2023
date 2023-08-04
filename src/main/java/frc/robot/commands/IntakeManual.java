package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Intake;
import harkerrobolib.commands.IndefiniteCommand;

public class IntakeManual extends IndefiniteCommand {
    public IntakeManual() {
        addRequirements(Intake.getInstance());
    }
    public void execute() {
        double speed = OI.getInstance().getDriver().getRightTrigger();
        if(speed > 0.5){
            Intake.getInstance().setOutput(0.3);
        }else {
        Intake.getInstance().setOutput(0);
        }
    }
    public void end(boolean interrupted) {
        Intake.getInstance().setOutput(0);
    }
}
