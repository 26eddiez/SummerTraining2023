package frc.robot;

import frc.robot.commands.ToggleIntake;
import harkerrobolib.joysticks.XboxGamepad;

public class OI {
    private static OI instance; 
    private XboxGamepad driver;
    private static final int gamepadID = 0;
    private OI(){
        driver = new XboxGamepad(gamepadID);
        initBindings();
    }
    public XboxGamepad getDriver(){
        return driver;
     }

     private void initBindings() {
        driver.getButtonX().whileTrue(new ToggleIntake());
     } 
     public static OI getInstance(){
         if(instance == null){
           instance = new OI();  
         }
         return instance;
     }
}
