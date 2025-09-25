/*package org.firstinspires.ftc.teamcode;



/// program cu explicati



// biblioteci ⬇️
import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.acmerobotics.dashboard.FtcDashboard;
@Config // obligatoriu pentru FtcDashbord
@TeleOp(name="catapulta")
public class catapulta extends LinearOpMode {
   FtcDashboard dashboard;  // important din punct de vedere necunoscut

  // daca vrei sa schimbi variabilele in FtcDashbord ele trebuie sa fie publice

    public void runOpMode() throws InterruptedException {

        // dupa apasarea butonului init
        // "Dcmotor/Servo" - data type, ca si "int" in c++;   "motor1"-este denumiria portului (motorului)
        //          ⬇️
        DcMotor motorDreapta = hardwareMap.get(DcMotor.class, "motor1");
        DcMotor motorStanga = hardwareMap.get(DcMotor.class, "motor2");
        Servo motorServo1 = hardwareMap.get(Servo.class, "servo1");
        Servo motorServo2 = hardwareMap.get(Servo.class, "servo2");
        motorServo1.setDirection(Servo.Direction.REVERSE);

        waitForStart();// ii spui programului sa astepte sa ii dai play
        while (opModeIsActive()) {

            // "gamepad1" si "gamepad2" butoane/... de pe cela doua manete

            boolean butonx = gamepad1.x;
            boolean bababuia = false;
            double puteremotor = gamepad1.right_trigger;
            double oprestmotor = gamepad1.left_trigger;
            boolean puteremotorinvers = gamepad1.right_bumper;
            boolean oprestmotorinvers = gamepad1.left_bumper;


            if(puteremotor>0.2) {
                motorDreapta.setPower(1);
                motorStanga.setPower(-0.95);
            }
            if(oprestmotor>0.5) {
                motorDreapta.setPower(0);
                motorStanga.setPower(0);
            }
            if(puteremotorinvers) {
                motorDreapta.setPower(-1);
                motorStanga.setPower(0.95);
            }
            if(oprestmotorinvers) {
                motorDreapta.setPower(0);
                motorStanga.setPower(0);
            }
            if (butonx || bababuia) {
                bababuia = true;
                motorServo1.setPosition(1);

                bababuia = false;
            } else {
                motorServo1.setPosition(0);

            }

          ///  !!!! Motoarele Servo nu are -1 (in cazul in care pui el se va returna la pozitia 0)

        }
    }
}
*/