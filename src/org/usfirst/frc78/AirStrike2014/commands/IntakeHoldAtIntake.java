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
package org.usfirst.frc78.AirStrike2014.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc78.AirStrike2014.Robot;
/**
 *
 */
public class  IntakeHoldAtIntake extends Command {
    
    private static final double HOLD_SETPOINT = 1.620;
    
    public IntakeHoldAtIntake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.intake);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    protected void initialize() {
        Robot.intake.setSetpoint(HOLD_SETPOINT);
        Robot.intake.enable();
    }
    protected void execute() {
    }
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
        Robot.intake.disable();
    }
    protected void interrupted() {
        end();
    }
}