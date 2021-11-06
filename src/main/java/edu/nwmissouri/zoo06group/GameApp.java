/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;
import java.util.Scanner;
/**
 *
 * @author Himaja Reddy Maddi
 */
public class GameApp {
    private static final String GREETING_MESSAGE = "Welcome to our 542 Zoo!";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";

    // specify number of  animal types available 
    private static final int NUMBER_ANIMAL_TYPES = 6;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

        // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape 
        System.out.println(ESCAPE_MESSAGE);

        // construct Scanner and begin interaction
        var scanner = new Scanner(System.in);

        // Prompt for topic: ask if they want to see animals
        System.out.println("Do you want to see animals (y/n)?");
        var animalInterestInput = scanner.next();

        // if yes, show list
        if (animalInterestInput.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                System.out.println();
                System.out.println("What animals would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");
                System.out.println(" 1.Giraffe            ");
                System.out.println(" 2.Hippopotamus            ");
                System.out.println(" 3.Lion            ");
                System.out.println(" 4.RelayHorse            ");
                System.out.println(" 5.Cheetah            ");
                System.out.println(" 6.Liger            ");
                

                
                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                // set isValid if >= 1 and <= number of animal types
                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_ANIMAL_TYPES;

                // switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput) {
                   case 1 -> {
                        GiraffeGroup.create();
                        GiraffeGroup.run();
                    }
                   case 2 -> {
                        HippopotamusGroup.create();
                        HippopotamusGroup.run();
                    }
                   case 3 -> {
                        LionGroup.create();
                        LionGroup.run();
                    }
                   case 4 -> {
                        RelayHorseGroup.create();
                        RelayHorseGroup.run();
                    }
                   case 5 -> {
                        CheetahGroup.create();
                        CheetahGroup.run();
                    }
                   case 6 -> {
                        LigerGroup.create();
                        LigerGroup.run();
                    }
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (!isValid);

            // close the if loop
        } // Prompt for adventures: ask if they want to try an adventure
        //        System.out.println("Do you want to go on an adventure (y/n)?");
        //        var adventureInterestInput = scanner.next();
        //        if (adventureInterestInput.toUpperCase().startsWith("Y")) {
        //            System.out.println("Sorry - this option is not yet available.");
        //        }
        // output goodbye
        System.out.println("Do you want to see games (y/n)?");
        var rideInterest = scanner.next();
         if (rideInterest.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                System.out.println();
                System.out.println("What games would you like to play?");
                System.out.println("Enter a number to choose, 0 to exit.");
                System.out.println(" 1.Adventure Rides            ");
                System.out.println(" 2.Water Rides            ");

                
                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                // set isValid if >= 1 and <= number of animal types
                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_ANIMAL_TYPES;
                
                // switch by animal type - autogenerate with ZooBuildSwitch.java
                AdventureRides ad= new AdventureRides();
                WaterRide wd= new WaterRide();
                
                switch (typeNumberInput) {
                   case 1 -> {
                        ad.resultOfGame();
                        ad.onlineBooking();
                   }
                   case 2 -> {
                        wd.resultOfGame();
                        wd.onlineBooking();
                       
                   }
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (!isValid);
            
            if(typeNumberInput==1){
                System.out.println("Do you want to see Adventure Rides (y/n)?");
        var gameInterest = scanner.next();
         if (gameInterest.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput1;

            // declare a boolean for isValid
            boolean isValid1;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                System.out.println();
                System.out.println("What type of adventure games would you like to play?");
                System.out.println("Enter a number to choose, 0 to exit.");
                System.out.println(" 1.RollerCoaster            ");
                System.out.println(" 2.RockClimbing            ");
                System.out.println(" 3.ShootingArcade            ");
                System.out.println(" 4.PanicRoom            ");
                System.out.println(" 5.SkeeBallGame            ");
               

                
                try {
                    typeNumberInput1 = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput1 = 0;
                }

                // set isValid if >= 1 and <= number of animal types
                isValid1 = typeNumberInput1 >= 1 && typeNumberInput1 <= NUMBER_ANIMAL_TYPES;
                
                // switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput1) {
                   case 1 -> {
                        RollerCoaster.rotations();
                                           }
                   case 2 -> {
                 
                        RockClimbing.climb();
                   }
                   case 3 -> {
                 
                        ShootingArcade.speed();
                   }
                   case 4 -> {
                 
                        PanicRoom.darkRoom();
                   }
                   case 5 -> {
                 
                        SkeeBallGame.goal();
                   }
                   
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (!isValid1);
            
            

            // close the if loop
        }
            }
            if(typeNumberInput==2){
                System.out.println("Do you want to see Water Rides (y/n)?");
        var gameInterest = scanner.next();
         if (gameInterest.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput1;

            // declare a boolean for isValid
            boolean isValid1;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                System.out.println();
                System.out.println("What type of water games would you like to play?");
                System.out.println("Enter a number to choose, 0 to exit.");
                System.out.println(" 1.SplashMountain            ");
                System.out.println(" 2.JungleCruze            ");
                 System.out.println(" 3.KnockingGame            ");
                  System.out.println(" 4.JungleRiveBattle            ");

                
                try {
                    typeNumberInput1 = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput1 = 0;
                }

                // set isValid if >= 1 and <= number of animal types
                isValid1 = typeNumberInput1 >= 1 && typeNumberInput1 <= NUMBER_ANIMAL_TYPES;
                
                // switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput1) {
                   case 1 -> {
                        SplashMountain.speed();
                                           }
                   case 2 -> {
                 
                        JungleCruze.speed();
                   }
                   case 3 -> {
                 
                        KnockingGame.hit();
                   }
                   
                   
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (!isValid1);
            
            

            // close the if loop
        }
            }

            // close the if loop
        }
        
         
        System.out.println(GOODBYE_MESSAGE);

    }
}
