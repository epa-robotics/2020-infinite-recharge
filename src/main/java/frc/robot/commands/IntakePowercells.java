/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Tuner;
import frc.robot.subsystems.PowerCellHandler;

public class IntakePowercells extends CommandBase {
  /**
   * Creates a new IntakePowercells.
   */
  PowerCellHandler powerCellHandler;

  public IntakePowercells(PowerCellHandler p) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(p);
    powerCellHandler = p;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    powerCellHandler.runPowercellMotor(Tuner.getPowerToIntakePowercells());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    powerCellHandler.runPowercellMotor(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
