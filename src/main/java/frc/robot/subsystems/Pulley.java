package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pulley extends SubsystemBase {
    private MotorController pulleySpeedController;

    public Pulley(MotorController pulleySpeedController) {
        this.pulleySpeedController = pulleySpeedController;

    }

    public void movePulley(double speed) {
        pulleySpeedController.set(speed);
    }

    public void stopPulley() {
        pulleySpeedController.stopMotor();
    }
}
