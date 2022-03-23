/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author User
 */
public class GoTooFar {
    public static void Run(){
        int[] fiveArray = {1,2,3,4,5};
        int a = 0;
        
        try{
            while (true){
                System.out.println(fiveArray[a]);
                a+=1;
            }
        }
        
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Now you've gone too far");
        }
    }
}
