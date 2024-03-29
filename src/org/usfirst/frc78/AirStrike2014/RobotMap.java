
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
package org.usfirst.frc78.AirStrike2014;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController chassisLeftFriveFront;
    public static SpeedController chassisLeftDriveRear;
    public static SpeedController chassisRightDriveFromt;
    public static SpeedController chassisRightDriveRear;
    public static RobotDrive chassisRobotDrive41;
    public static DigitalOutput chassisBrake1;
    public static DigitalOutput chassisBrake2;
    public static DigitalOutput chassisBrake3;
    public static DigitalOutput chassisBrake4;
    public static SpeedController shooterChooChooMotor;
    public static AnalogChannel shooterMagneticEncoder;
    public static DigitalInput shooterChooChooLimit;
    public static DigitalInput shooterShooterSafetySwitch;
    public static DigitalInput shooterChooChooSecondLimit;
    public static AnalogChannel intakeArmPot;
    public static SpeedController intakeShoulderMotor;
    public static DigitalInput intakeArmHighLimit;
    public static DigitalInput intakeArmLowLimit;
    public static SpeedController intakeIntakeWheels;
    public static DigitalInput intakePhotoSwitch;
    public static DigitalInput intakeShooterLimit;
    public static Relay visionLed;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisLeftFriveFront = new Victor(1, 1);
	LiveWindow.addActuator("Chassis", "LeftFriveFront", (Victor) chassisLeftFriveFront);
        
        chassisLeftDriveRear = new Victor(1, 2);
	LiveWindow.addActuator("Chassis", "LeftDriveRear", (Victor) chassisLeftDriveRear);
        
        chassisRightDriveFromt = new Victor(1, 3);
	LiveWindow.addActuator("Chassis", "RightDriveFromt", (Victor) chassisRightDriveFromt);
        
        chassisRightDriveRear = new Victor(1, 4);
	LiveWindow.addActuator("Chassis", "RightDriveRear", (Victor) chassisRightDriveRear);
        
        chassisRobotDrive41 = new RobotDrive(chassisLeftFriveFront, chassisLeftDriveRear,
              chassisRightDriveFromt, chassisRightDriveRear);
	
        chassisRobotDrive41.setSafetyEnabled(false);
        chassisRobotDrive41.setExpiration(0.1);
        chassisRobotDrive41.setSensitivity(0.5);
        chassisRobotDrive41.setMaxOutput(1.0);
        chassisBrake1 = new DigitalOutput(1, 6);
	
        
        chassisBrake2 = new DigitalOutput(1, 7);
	
        
        chassisBrake3 = new DigitalOutput(1, 8);
	
        
        chassisBrake4 = new DigitalOutput(1, 9);
	
        
        shooterChooChooMotor = new Victor(1, 6);
	LiveWindow.addActuator("Shooter", "ChooChooMotor", (Victor) shooterChooChooMotor);
        
        shooterMagneticEncoder = new AnalogChannel(1, 2);
	LiveWindow.addSensor("Shooter", "MagneticEncoder", shooterMagneticEncoder);
        
        shooterChooChooLimit = new DigitalInput(1, 12);
	LiveWindow.addSensor("Shooter", "ChooChooLimit", shooterChooChooLimit);
        
        shooterShooterSafetySwitch = new DigitalInput(1, 14);
	LiveWindow.addSensor("Shooter", "ShooterSafetySwitch", shooterShooterSafetySwitch);
        
        shooterChooChooSecondLimit = new DigitalInput(1, 13);
	LiveWindow.addSensor("Shooter", "ChooChooSecondLimit", shooterChooChooSecondLimit);
        
        intakeArmPot = new AnalogChannel(1, 1);
	LiveWindow.addSensor("Intake", "ArmPot", intakeArmPot);
        
        intakeShoulderMotor = new Victor(1, 5);
	LiveWindow.addActuator("Intake", "ShoulderMotor", (Victor) intakeShoulderMotor);
        
        intakeArmHighLimit = new DigitalInput(1, 1);
	LiveWindow.addSensor("Intake", "ArmHighLimit", intakeArmHighLimit);
        
        intakeArmLowLimit = new DigitalInput(1, 4);
	LiveWindow.addSensor("Intake", "ArmLowLimit", intakeArmLowLimit);
        
        intakeIntakeWheels = new Victor(1, 7);
	LiveWindow.addActuator("Intake", "IntakeWheels", (Victor) intakeIntakeWheels);
        
        intakePhotoSwitch = new DigitalInput(1, 2);
	LiveWindow.addSensor("Intake", "PhotoSwitch", intakePhotoSwitch);
        
        intakeShooterLimit = new DigitalInput(1, 5);
	LiveWindow.addSensor("Intake", "ShooterLimit", intakeShooterLimit);
        
        visionLed = new Relay(1, 1);
	LiveWindow.addActuator("Vision", "Led", visionLed);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
