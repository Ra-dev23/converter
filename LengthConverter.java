package futurevalue;

import java.util.Scanner;

public class LengthConverter {

	public static void main(String[] args) {
		System.out.println();		
		System.out.println("Welcome to length converter");
                
		Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name;
        name = sc.nextLine();
        String length;
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))  {
            System.out.println("Enter measurement format : \n"
            		+ " m (for meter), ft (for foot), in (for inch) ");
            length = sc.nextLine();       
            if (length.equalsIgnoreCase("m")) {     
                System.out.print("Enter length in meters: ");
                double m = sc.nextDouble();
                double feet = m * 3.2808;
                double in = m / 0.0254;
                feet = (double) Math.round(feet * 100) / 100;
                in = (double) Math.round(in * 100) / 100;
                 System.out.println("               Feet =  " + feet);
                 System.out.println("               Inch =  " + in);
                    } else {
                    	    if (length.equalsIgnoreCase("ft")) {
                    		System.out.print("Enter length in feet: ");
                    		double feet = sc.nextDouble();
                    		double m = feet / 3.2808;
                    		double in = feet * 12;
                    		m = (double) Math.round(m * 100) / 100;
                            in = (double) Math.round(in * 100) / 100;
                   System.out.println("               Meter =  " + m);
                   System.out.println("               Inch  =  " + in);
                    	} else {                 		
             System.out.print("Enter length in inches: ");
            double in = sc.nextDouble();
            double m = in * 0.0254;
            double feet = in / 12;
            m = (double) Math.round(m * 100) / 100;
            feet = (double) Math.round(feet * 100) / 100;
            System.out.println("               In meters = " + m);
            System.out.println("               In feet   = " + feet);
                    	}
                             }
        System.out.print("Continue? (y/n) : ");
        choice = sc.next();
        sc.nextLine();
       System.out.println();
                }
                System.out.println("Thank you " + name + " for using converter! ");
	System.out.println();
	sc.close();
	}
}
