import java.util.Scanner;
import java.util.*;
import java.lang.Math;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static double calculateRadians(double angleDegrees) {
        double radians;
        radians = Math.toRadians(angleDegrees);
        return radians;
    }
    public static double tangentOfA(double radians, double distance, double userHeight) {
        double buildingHeight;
        buildingHeight = distance * Math.tan(radians);
        return buildingHeight + userHeight;
    }

    public static double feetToMeters(double bHeight) {
        return bHeight * 0.3048;
    }


    public static void main(String[] args) {
        int distance;
        double userHeight;
        double bHeight;
        Scanner scan = new Scanner(System.in);

        // Gather input from the user via Scanner object
        System.out.println("Welcome! Let's convert a temperature from Fahrenheit to Celsius");
        System.out.print("Enter the temperature in Fahrenheit: ");
        String tempIn = scan.next();

        // convert tempIn from String to Float
        float tempF = Float.parseFloat(tempIn);

        // Use the conversion formula to find the equivalent in Celsius
        float tempC = (tempF - 32) * 5/9;

        // round tempC to hundredths place for output in string
        float finalValue = (float) (Math.round(tempC * 100.0)/100.0);

        //print output
        System.out.print("That is " + finalValue + " degrees Celsius." + "\n\n");

        //***Now find the height of a building****
        System.out.println("Lets approximate the height of a building");
        System.out.print("Enter the distance from the building to where you are standing: ");

        // ask the user for their distance from the building and assign the next scanned integer
        distance = input.nextInt();
        // ask user for height and assign to userHeight
        System.out.print("How tall are you? Enter the number in feet with a decimal: ");
        userHeight = input.nextDouble();
        // Ask for angle of elevation and assign to double angleOfElevation
        System.out.print("What is the angle of elevation from the top of your head to the building (in degrees)? ");
        double angleOfElevationDegs = input.nextDouble();
        //call the method calculateRadians and determine the angle of elevation in radians
        double angleOfElevationRads = calculateRadians(angleOfElevationDegs);
       // Call method tangentOfA and determine the building height bheight
        bHeight = tangentOfA(angleOfElevationRads, distance, userHeight);
       // print the building height formatted to two decimal places in feet and meters
        System.out.print("The building is roughly " + String.format("%.2f", bHeight) +  "ft (");
        System.out.print(String.format("%.2f", feetToMeters(bHeight)) + "m) tall");
        }

    }
