/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

   private static final int m_MasterLeftID = Constants.m_MasterLeftID;
   private static final int m_MasterRightID = Constants.m_MasterRightID;
   private static final int m_SlaveLeftID = Constants.m_SlaveLeftID;
   private static final int m_SlaveRightID = Constants.m_SlaveRightID;

   private CANSparkMax m_MasterLeft = new CANSparkMax(m_MasterLeftID, MotorType.kBrushless);
   private CANSparkMax m_MasterRight = new CANSparkMax(m_MasterRightID, MotorType.kBrushless);
   private CANSparkMax m_SlaveLeft = new CANSparkMax(m_SlaveLeftID, MotorType.kBrushless);
   private CANSparkMax m_SlaveRight = new CANSparkMax(m_SlaveRightID, MotorType.kBrushless);

   private SpeedControllerGroup Left = new SpeedControllerGroup(m_MasterLeft, m_SlaveLeft);
   private SpeedControllerGroup Right = new SpeedControllerGroup(m_MasterRight, m_SlaveRight);

   private final DifferentialDrive m_drive = new DifferentialDrive(Left, Right);

  public DriveTrain() {

  }


  public void arcadedrive(double movevalue, double rotatevalue){
    m_drive.arcadeDrive(movevalue, rotatevalue);
  }
  @Override
  public void periodic() {  
    

    
    // This method will be called once per scheduler run
  }
}
