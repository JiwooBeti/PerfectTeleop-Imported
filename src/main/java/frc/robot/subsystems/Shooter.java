package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private MotorController shooterLeft, shooterRight;

    public Shooter(MotorController shooterLeft, MotorController shooterRight) {
        this.shooterLeft = shooterLeft;
        this.shooterRight = shooterRight;
    }

    public void moveShooter(double leftSpeed, double rightSpeed) {
        shooterLeft.set(leftSpeed);
        shooterRight.set(-1*rightSpeed);
    }

    public void stopShooter() {
        shooterLeft.stopMotor();
        shooterRight.stopMotor();
    }
    
}
