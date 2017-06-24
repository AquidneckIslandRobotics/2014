

/**@author Tyler Fleig
 */

package org.usfirst.frc78.AirStrike2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc78.AirStrike2014.Robot;



public class DriveStraight extends Command {
    double m_speed;
    public DriveStraight(double speed, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        setTimeout(time);
        m_speed = speed;
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.chassis.driveStraightAtSpeed(m_speed);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.chassis.driveStraightAtSpeed(m_speed);
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.chassis.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
