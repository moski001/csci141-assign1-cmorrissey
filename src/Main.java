import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare variables
        float tempC, tempF;
        Scanner scan = new Scanner(System.in);

        // Gather input from the user via Scanner object
        System.out.println("Welcome! Let's convert a temperature from Fahrenheit to Celsius");
        System.out.print("Enter the temperature in Fahrenheit: ");
        String tempIn = scan.next();
        // convert tempIn from String to Float
        tempF = Float.parseFloat(tempIn);
        // Use the conversion formula to find the equivalent in Celsius
        tempC = (tempF - 32) * 5/9;
        // round tempC to hundredths place for output in string
        double finalValue = Math.round(tempC * 100.0)/100.0;

        //print output
        System.out.print("That is " + finalValue + " degrees Celsius.");
}
}