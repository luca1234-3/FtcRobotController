/*package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="invatam")
public class Main extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        // dupa apasarea butonului init
        DcMotor motorDreaptaFata = hardwareMap.get(DcMotor.class, "0");
        DcMotor motorStangaFata = hardwareMap.get(DcMotor.class, "2");
        DcMotor motorDreaptaSpate = hardwareMap.get(DcMotor.class, "1");
        DcMotor motorStangaSpate = hardwareMap.get(DcMotor.class, "3");

        // motorul din stanga spate e inversat
        motorStangaSpate.setDirection(DcMotorSimple.Direction.REVERSE);

        while(opModeIsActive()){
            double y = -gamepad1.left_stick_y; // stick y este invers!!!!
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            motorStangaFata.setPower(y + x + rx);
            motorStangaSpate.setPower(y - x + rx);
            motorDreaptaFata.setPower(y - x - rx);
            motorDreaptaSpate.setPower(y + x - rx);
        }
    }
}

 */