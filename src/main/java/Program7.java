package src.main.java;
//import stuff here
import java.util.Scanner;
//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**
    final double old = 240;
    final double newR= 100;

    public static void main(String[] args){
        //Make you own test code here
        Program7 converter = new Program7();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter schrute-bucks: ");
        int b = scan.nextInt();
        System.out.print("Enter klevins: ");
        int k = scan.nextInt();
        System.out.print("Enter stanley-nickels: ");
        int st = scan.nextInt();
        System.out.print("Decimal schrute-bucks = " + converter.convertMoney(b,st,k));
        
        
    }
    
    
    
    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format
        double nickels = stanleyNickels + 12*klevins + old*schruteBucks;
        nickels *= (double)10/24;
        
        double bucks = (nickels - nickels%newR)/newR;
        nickels = nickels%newR;
        System.out.println(nickels);
        return bucks + (double)Math.round(nickels)/100;
    }
    
    
}
/* Program Output
Enter schrute-bucks: 7
Enter klevins: 17
Enter stanley-nickels: 9
88.75
Decimal schrute-bucks = 7.89 */
