/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeloan;

/**
 *
 * @author charuni
 */import java.util.Scanner;
public class ComputeLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the loan in RS");
        double loan=input.nextDouble();
        System.out.println("Enter the percentage in decimal");
        double percentage=input.nextDouble();
        System.out.println("Enter the months");
        int month=input.nextInt();
        double interest=loan*percentage*month;
        System.out.println("Payment interest for "+month+" is RS1000 "+interest);
    }
    
}
