// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4949.WarehouseBot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Solenoid pneumaticsExtendFork;
    public static Solenoid pneumaticsExtendGrips;
    public static Compressor pneumaticsCompressor;
    public static Relay pneumaticsPneumaticSpike;
    public static Encoder driveTrainRightEncoder;
    public static Encoder driveTrainLeftEncoder;
    public static SpeedController driveTrainLeftFront;
    public static SpeedController driveTrainLeftRear;
    public static SpeedController driveTrainRightFront;
    public static SpeedController driveTrainRightRear;
    public static RobotDrive driveTrainRobotDrive41;
    public static Encoder liftLiftEncoder;
    public static AnalogPotentiometer liftLiftAngle;
    public static SpeedController liftLiftController1;
    public static SpeedController liftLiftController2;
    public static Encoder turretTurretEncoder;
    public static SpeedController turretTurretController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        pneumaticsExtendFork = new Solenoid(0, 1);
        LiveWindow.addActuator("Pneumatics", "Extend Fork", pneumaticsExtendFork);
        
        pneumaticsExtendGrips = new Solenoid(0, 0);
        LiveWindow.addActuator("Pneumatics", "Extend Grips", pneumaticsExtendGrips);
        
        pneumaticsCompressor = new Compressor(0);
        
        
        pneumaticsPneumaticSpike = new Relay(0);
        LiveWindow.addActuator("Pneumatics", "Pneumatic Spike", pneumaticsPneumaticSpike);
        
        driveTrainRightEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive Train", "RightEncoder", driveTrainRightEncoder);
        driveTrainRightEncoder.setDistancePerPulse(1.0);
        driveTrainRightEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainLeftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive Train", "LeftEncoder", driveTrainLeftEncoder);
        driveTrainLeftEncoder.setDistancePerPulse(1.0);
        driveTrainLeftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainLeftFront = new Victor(0);
        LiveWindow.addActuator("Drive Train", "LeftFront", (Victor) driveTrainLeftFront);
        
        driveTrainLeftRear = new Victor(1);
        LiveWindow.addActuator("Drive Train", "LeftRear", (Victor) driveTrainLeftRear);
        
        driveTrainRightFront = new Victor(2);
        LiveWindow.addActuator("Drive Train", "RightFront", (Victor) driveTrainRightFront);
        
        driveTrainRightRear = new Victor(3);
        LiveWindow.addActuator("Drive Train", "RightRear", (Victor) driveTrainRightRear);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainLeftFront, driveTrainLeftRear,
              driveTrainRightFront, driveTrainRightRear);
        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);

        liftLiftEncoder = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Lift", "LiftEncoder", liftLiftEncoder);
        liftLiftEncoder.setDistancePerPulse(1.0);
        liftLiftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        liftLiftAngle = new AnalogPotentiometer(0, 1.0, 0.0);
        LiveWindow.addSensor("Lift", "LiftAngle", liftLiftAngle);
        
        liftLiftController1 = new Talon(4);
        LiveWindow.addActuator("Lift", "LiftController1", (Talon) liftLiftController1);
        
        liftLiftController2 = new Talon(5);
        LiveWindow.addActuator("Lift", "LiftController2", (Talon) liftLiftController2);
        
        turretTurretEncoder = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("Turret", "TurretEncoder", turretTurretEncoder);
        turretTurretEncoder.setDistancePerPulse(1.0);
        turretTurretEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        turretTurretController = new Talon(6);
        LiveWindow.addActuator("Turret", "TurretController", (Talon) turretTurretController);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}