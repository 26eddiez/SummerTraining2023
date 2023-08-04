package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;
import harkerrobolib.commands.IndefiniteCommand;

public class DriveManual extends IndefiniteCommand {
    public DriveManual() {
        addRequirements(Drivetrain.getInstance());
    }

    public void execute() {
        double speed = OI.getInstance().getDriver().getLeftY();
        double turn = OI.getInstance().getDriver().getLeftX();
        Drivetrain.getInstance().setAngleAndDrive(speed, turn);
    }
    public void end(boolean interrupted) {
        Drivetrain.getInstance().setAngleAndDrive(0, 0);
    }
}
