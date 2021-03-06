package main.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import main.OI;
import main.Robot;

public class DriveMechanum extends Command {

    public DriveMechanum() {
    	requires(Robot.dt);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.dt.driveMechanum(-OI.getXbox().getSmoothedMainY(), -OI.getXbox().getSmoothedMainX(), -OI.getXbox().getSmoothedAltX());
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}