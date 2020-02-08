/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.XboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final int m_MasterLeftID = 1;
  public static final int m_MasterRightID = 2;
  public static final int m_SlaveLeftID = 3;
  public static final int m_SlaveRightID = 4;

  public static XboxController m_xbox = new XboxController(1);

  public static final I2C.Port i2cPort = I2C.Port.kOnboard;
  public static final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);
    
}
