/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PowerCellHandler extends SubsystemBase {

  PWMVictorSPX intakeMotor = new PWMVictorSPX(Constants.intakeMotorPWM);

  public void runPowercellMotor(double speed) {
    intakeMotor.set(speed);
  }
}
