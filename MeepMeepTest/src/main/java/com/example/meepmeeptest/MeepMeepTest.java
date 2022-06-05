package com.example.meepmeeptest;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;

public class MeepMeepTest {
    public static void main(String[] args) {
        // TODO: If you experience poor performance, enable this flag
        // System.setProperty("sun.java2d.opengl", "true");

        // Declare a MeepMeep instance
        // With a field size of 800 pixels
        MeepMeep mm = new MeepMeep(1000)
                // Set field image
                .setBackground(MeepMeep.Background.FIELD_FREIGHT_FRENZY)
                // Set theme
                .setTheme(new ColorSchemeRedDark())
                // Background opacity from 0-1
                .setBackgroundAlpha(1f)
                // Set constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70.85053948813895, 70.85053948813895, Math.toRadians(85), Math.toRadians(85), 10.1)
                        .followTrajectorySequence(drive ->
                                //red side warehouse side
                              //  drive.trajectorySequenceBuilder(new Pose2d(8, -62, Math.toRadians(90)))
                                      /*  .lineToLinearHeading(new Pose2d(0, -42, Math.toRadians(120))) //drop off preload freight
                                        //.lineToConstantHeading(new Vector2d(-11,-44)) //deposit preload freight
                                        .lineToLinearHeading(new Pose2d(8, -62, Math.toRadians(180))) //turn 180 to prepare to enter warehouse
                                        .lineToConstantHeading(new Vector2d(50, -62)) //enter warehouse and pick up freight
                                        .lineToConstantHeading(new Vector2d(8, -62)) //leave warehouse
                                        .lineToLinearHeading(new Pose2d(0, -42, Math.toRadians(120))) //drop off freight
                                        .lineToLinearHeading(new Pose2d(8, -62, Math.toRadians(180))) //turn 180 to prepare to enter warehouse
                                        .lineToConstantHeading(new Vector2d(50, -62)) //pick up freight
                                        .lineToConstantHeading(new Vector2d(8, -62)) // leave warehouse
                                        .lineToLinearHeading(new Pose2d(0, -42, Math.toRadians(120))) //drop off freight
                                        .lineToLinearHeading(new Pose2d(8, -62, Math.toRadians(180)))  //turn 180 to prepare to enter warehouse
                                        .lineToConstantHeading(new Vector2d(50, -62))  //park in warehouse */

                                        //blue side warehouse side
                                        drive.trajectorySequenceBuilder(new Pose2d(8, 62, Math.toRadians(90)))
                                        .lineToConstantHeading(new Vector2d(-11,44)) //deposit preload freight
                                        .lineToLinearHeading(new Pose2d(8, 62, Math.toRadians(180))) //turn 180 to prepare to enter warehouse
                                        .lineToConstantHeading(new Vector2d(50, 62)) //enter warehouse and pick up freight
                                        .lineToConstantHeading(new Vector2d(8, 62)) //leave warehouse
                                        .lineToLinearHeading(new Pose2d(-11, 44, Math.toRadians(90))) //drop at shipping hub
                                        .lineToLinearHeading(new Pose2d(8, 62, Math.toRadians(180))) //turn 180 to prepare to enter warehouse
                                        .lineToConstantHeading(new Vector2d(50, 62)) //pick up freight
                                        .lineToConstantHeading(new Vector2d(8, 62)) // leave warehouse
                                        .lineToLinearHeading(new Pose2d(-11, 44, Math.toRadians(90))) //drop off freight
                                        .lineToLinearHeading(new Pose2d(8, 62, Math.toRadians(180)))  //turn 180 to prepare to enter warehouse
                                        .lineToConstantHeading(new Vector2d(50, 62))  //park in warehouse

                                        .build()

                        )
                        .start();
    }
}


