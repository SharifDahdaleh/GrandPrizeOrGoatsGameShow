/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;
/**
 *
 * @author SharifDahdaleh
 */
public class GameShow {
    public static int i = 1;
    public static int loopBreak = 0;
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("WELCOME TO THE GAME OF THE CENTURY");
        System.out.println("------- GRAND PRIZE OR GOATS -------");
        System.out.println();
        
        System.out.println("**********      **********      **********");
        System.out.println("*   **   *      *  *  *  *      *  ***   *");
        System.out.println("*    *   *      * *    * *      *     *  *");
        System.out.println("*    *   *      *     *  *      *  ***** *");
        System.out.println("*    *   *      *    *   *      *     *  *");
        System.out.println("*   ***  *      * ****** *      *  ***   *");
        System.out.println("**********      **********      **********");
        System.out.println();
        
        System.out.println("Enter the ONE DOOR number you'd like to open "
                + "- 1, 2 or 3:");
        int input = userInput.nextInt();
        while (loopBreak == 0){
            switch (input){
            case 1:
                option1();
                loopBreak++;
                break;
            case 2:
                option2();
                loopBreak++;
                break;
            case 3:
                System.out.println("Enter a number between 1 and 5 to find out your reward");
                input = userInput.nextInt();
                option3(input);
                loopBreak++;
                break;
            default:
                defaultOption(i);
                i++;
                input = userInput.nextInt();
                break;
            
            }//end switch
        }//end loop
        break;
    }//end main
    public static void option1() {
        System.out.println("I'm sorry all you got is a goat figurine");
        System.out.println("Hope you enjoy it!");
    }//end option1
    
    public static void option2() {
        Random r = new Random();
        
        BigInteger bigInt = new BigInteger(100, r);
        
        System.out.println("Jackpot! Jackpot! You just won $" + bigInt);
        
    }//end option2
    
    public static void option3(int input) {
        switch (input) {
            case 1:
                System.out.println("Congrats! You just won a life time supply of goats!");
                System.out.println("Please contact 1-800-GOAT to claim your reward.");
                break;
            case 2:
                System.out.println("Congrats! You won 1 goat");
                System.out.println("Please contact 1-800-GOAT to claim your reward.");
                break;
            case 3:
                System.out.println("Unfortunate! You're not getting any goats, "
                        + "but you won a second try!");
                main(null);
                break;
            case 4:
                System.out.println("Congrats! You won a life time supply of goat food!");
                System.out.println("Please contact 1-800-GOAT to claim your reward.");
                break;
            case 5:
                System.out.println("Congrats! You won 3 goats, "
                        + "one for yourself and 2 to give away!");
                System.out.println("Please contact 1-800-GOAT to claim your reward.");
                break;
            default:
                defaultOption(i);
                break;
        }
        
    }//end option3
    
    public static void defaultOption(int i) {
        
        
        System.out.println("Please select one of the options");
        if (i == 1) {
            System.out.println("You only have 1 more try or you lose everything");
        } else {
            System.out.println("Haha! I knew you would fall for the trap");
            System.out.println("Help yourself to one of our goat keychains on your way out");
            loopBreak++;
        }//end if
    }//end defaultOption
} //end class
