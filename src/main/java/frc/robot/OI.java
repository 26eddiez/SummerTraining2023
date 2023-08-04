package frc.robot;

import harkerrobolib.joysticks.XboxGamepad;

public class OI {
    private static OI instance; 
    private XboxGamepad driver;
    private static final int gamepadID = 0;
    private OI(){
        driver = new XboxGamepad(gamepadID);
    }
    public XboxGamepad getDriver(){
        return driver;
     }
     public static OI getInstance(){
         if(instance == null){
           instance = new OI();  
         }
         return instance;
     }
}
