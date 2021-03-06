/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  public static final int MOTOR_DRIVE_L1 = 2;
  public static final int MOTOR_DRIVE_L2 = 5;
  public static final int MOTOR_DRIVE_R1 = 7;
  public static final int MOTOR_DRIVE_R2 = 6;

  public static final int AXIS_RIGHT_TRIGGER = 3;
  public static final int AXIS_LEFT_TRIGGER = 2;
  public static final int AXIS_LEFT_X = 0;
  public static final double SCALE_STEERING = 0.7;

}
