/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author User
 */
public class InputMismatch {
    public double Run() throws InputMismatchException{
        double sqrRoot;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a integer: ");
        try{
            int num = input.nextInt();
            sqrRoot = Math.sqrt(num);
            input.close();
            return sqrRoot;
        }
        catch(InputMismatchException e){
            System.out.println("You need to enter an integer.");
            input.close();
            return 0;
        } 
    }
}
