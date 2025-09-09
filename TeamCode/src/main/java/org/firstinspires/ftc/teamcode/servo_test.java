package org.firstinspires.ftc.teamcode;


import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.acmerobotics.dashboard.FtcDashboard; //asta am pus


@Config
@TeleOp(name="servo_test")
public class servo_test extends LinearOpMode {
    // Aceasta variabila poate fi modificata in Dashboard
    public static double servoPosition = 0.5;

    private Servo myServo;

    @Override
    public void runOpMode() {
        Servo myServo = hardwareMap.get(Servo.class, "servo1");

        FtcDashboard dashboard = FtcDashboard.getInstance();

        waitForStart();

        while(opModeIsActive()) {
            myServo.setPosition(servoPosition);

            telemetry.addData("Servo Position", servoPosition);
            telemetry.update();
        }
    }
}
