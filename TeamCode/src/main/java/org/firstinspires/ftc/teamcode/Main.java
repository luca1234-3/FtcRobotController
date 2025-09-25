package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.robotcore.external.navigation.CurrentUnit;

@TeleOp(name="tureta_roti")
public class Main extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        // dupa apasarea butonului init
        DcMotor motorDreaptaFata = hardwareMap.get(DcMotor.class, "0");
        DcMotor motorStangaFata = hardwareMap.get(DcMotor.class, "2");
        DcMotor motorDreaptaSpate = hardwareMap.get(DcMotor.class, "1");
        DcMotor motorStangaSpate = hardwareMap.get(DcMotor.class, "3");
        DcMotorEx motor0 = hardwareMap.get(DcMotorEx.class, "t0");
        DcMotorEx motor1 = hardwareMap.get(DcMotorEx.class, "t1");
        CRServo servo = hardwareMap.get (CRServo.class, "s0");

        boolean motorsOn = false;
        boolean lastAState = false;

        // motorul din stanga spate e inversat
        //motorStangaSpate.setDirection(DcMotorSimple.Direction.REVERSE); //era pentru robotul mare 

        while(opModeIsActive()){
            double curr0 = motor0.getCurrent(CurrentUnit.AMPS);
            double curr1 = motor1.getCurrent(CurrentUnit.AMPS);

            telemetry.addData("Curent motor port 3 (A)", curr0);
            telemetry.addData("Curent motor port 4 (A)", curr1);
            telemetry.update();

            boolean currentAState = gamepad1.a;

            if (currentAState && !lastAState) {
                motorsOn = !motorsOn;
            }

            motor0.setPower(motorsOn ? 1.0 : 0.0);
            motor1.setPower(motorsOn ? 1.0 : 0.0);

            lastAState = currentAState;


            double y = -gamepad1.left_stick_y; // stick y este invers!!!!
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            servo.setPower(gamepad1.right_trigger - gamepad1.left_trigger); /// cat timp trigger dreapta este activ merge dreapta si daca este apast stanga merge stanga

            motorStangaFata.setPower(y + x + rx);
            motorStangaSpate.setPower(y - x + rx);
            motorDreaptaFata.setPower(y - x - rx);
            motorDreaptaSpate.setPower(y + x - rx);
        }
    }
}

