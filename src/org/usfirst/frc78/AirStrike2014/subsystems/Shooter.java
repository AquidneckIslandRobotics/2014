// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
/**@author Tyler Fleig
 */
package org.usfirst.frc78.AirStrike2014.subsystems;
import org.usfirst.frc78.AirStrike2014.RobotMap;
import org.usfirst.frc78.AirStrike2014.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc78.AirStrike2014.Robot;
/**
 *
 */
public class Shooter extends Subsystem {
    final double SHOOTER_SPEED = 1.0;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController chooChooMotor = RobotMap.shooterChooChooMotor;
    AnalogChannel magneticEncoder = RobotMap.shooterMagneticEncoder;
    DigitalInput chooChooLimit = RobotMap.shooterChooChooLimit;
    DigitalInput shooterSafetySwitch = RobotMap.shooterShooterSafetySwitch;
    DigitalInput chooChooSecondLimit = RobotMap.shooterChooChooSecondLimit;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public boolean readyToShoot = true;
    public boolean encoderIsValid = true;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void startChooChoo(){
        if(shooterSafetySwitch.get()) //carribeaner safety
        chooChooMotor.set(SHOOTER_SPEED);
        
        //SmartDashboard.putBoolean("Ready To Intake", readyToShoot);
        
    }
    public void stopChooChoo(){
        chooChooMotor.set(0.0);
        readyToShoot = true;
    }
   // public void chooChooWithJoystick(){
   //     chooChooMotor.set(-1*Math.abs(Robot.oi.manipulatorStick.getY()));
   // }
    public double getChooChooEncoder(){
        return magneticEncoder.getAverageVoltage();
    }
    public boolean getChooChooLimit(){
        return !chooChooLimit.get();
    }
    public boolean getChooChooSecondLimit(){
        return !chooChooSecondLimit.get();
    }
    public boolean getShooterSafetyLimit(){
        return shooterSafetySwitch.get();
    }
}
