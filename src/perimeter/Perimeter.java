package perimeter;

import java.util.Scanner;

/*@author dalla
 */
public class Perimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Area and Perimeter Calculator");
        
        System.out.print("Please enter the length of the rectangle:  ");
        double length = Double.parseDouble(sc.nextLine());
        
        System.out.print("Please enter the width of the rectangle:  ");
        double width = Double.parseDouble(sc.nextLine());
        
        double area  = length * width;
        double perimeter = 2*(length +width);
        
        System.out.println("Area:  " + area);
        System.out.println("Perimeter:  " + perimeter);
        
        
        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            
        System.out.println("Would you like to continue?");
        choice = sc.nextLine();
        System.out.println();
        }
             
        System.out.println("Bye!");
    }
        
    
}
