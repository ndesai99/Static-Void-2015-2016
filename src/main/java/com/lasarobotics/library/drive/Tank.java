package com.lasarobotics.library.drive;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Methods for the Tank drive train.
 */
public final class Tank {
    /**
     * Implements the Tank drive train with two motors
     *
     * @param left       Left motor
     * @param right      Right motor
     * @param leftValue  Left motor target value
     * @param rightValue Right motor target value
     */
    public static void Motor2(DcMotor left, DcMotor right, double leftValue, double rightValue) {
        left.setPower(leftValue);
        right.setPower(rightValue);
    }

    /**
     * Implements the Tank drive train with four motors
     *
     * @param leftFront  The motor on the front left
     * @param rightFront The motor on the front right
     * @param leftBack   The motor on the back left
     * @param rightBack  The motor on the back right
     * @param leftValue  Left motors target value
     * @param rightValue Right motors target value
     */
    public static void Motor4(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack, double leftValue, double rightValue) {
        leftFront.setPower(leftValue);
        rightFront.setPower(rightValue);
        leftBack.setPower(leftValue);
        rightBack.setPower(rightValue);
    }
}
