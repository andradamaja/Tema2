import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers (int) to find out their product: ");

        int x = scan.nextInt();

        int y = scan.nextInt();

        System.out.println("The product of " + x + " and " + y + " is: " + product(x,y));

        printJava();

        System.out.print("Enter three numbers to find out their average: ");

        float n1 = scan.nextFloat();

        float n2 = scan.nextFloat();

        float n3 = scan.nextFloat();

        System.out.println("The average of the numbers you entered is: " + average(n1, n2, n3));

        printPattern();

        System.out.print("Enter two numbers (int) to find out their sum, subtraction, product, division, and remainder: ");

        int nr1 = scan.nextInt();

        int nr2 = scan.nextInt();

        System.out.println(nr1 + " + " + nr2 + " = " + sum(nr1, nr2) + "\n" +
                nr1 + " - " + nr2 + " = " + subtract(nr1, nr2) + "\n" +
                nr1 + " * " + nr2 + " = " + product(nr1, nr2) + "\n" +
                nr1 + " / " + nr2 + " = " + divide(nr1, nr2) + "\n" +
                nr1 + " mod " + nr2 + " = " + remainder(nr1, nr2));

        System.out.print("Degrees Fahrenheit: ");

        float degrees = scan.nextFloat();

        System.out.println(degrees + " Fahrenheit is " + convertFToC(degrees) + " Celsius");

        System.out.print("Inches: ");

        float inches = scan.nextFloat();

        System.out.println(inches + "inches = " + convertInchToM(inches) + " meters");

        System.out.print("Distance in meters: ");

        float distance = scan.nextInt();

        System.out.print("Time (hours, minutes, seconds): ");

        float hours = scan.nextInt();

        float minutes = scan.nextInt();

        float seconds = scan.nextInt();

        float min = convertHoursToMin(hours) + minutes;

        float sec = convertMinToSec(min) + seconds;

        System.out.println("Speed: \n" + speed(distance, sec) + " m/s");

        float d = convertMToKm(distance);

        min = minutes + convertSecToMin(seconds);

        float h = convertMinToHours(min) + hours;

        System.out.println(speed(d, h) + " km/h");

        d = convertMToMiles(distance);

        System.out.println(speed(d, h) + " mi/h");

    }

    //1.Write a Java program that takes two numbers as input and display the product of two numbers.

    public static int product (int x, int y) {
        return x * y;
    }

    //2.Write a Java program to display the following pattern:

    public static void printJava(){
        System.out.print("   J   a  v     v  a\n" +
                         "   J  a a  v   v  a a\n" +
                         "J  J aaaaa  V V  aaaaa\n" +
                         " JJ a     a  V  a     a\n");
    }

    //3.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

    public static float average(float x, float y, float z){
        float sum = x + y + z;
        return (sum / 3);
    }

    //4.Write a Java program to display the following pattern:

    public static void printPattern(){
        System.out.print("  +\"\"\"\"\"+\n" +
                         "[ | o o | ]\n" +
                         "  |  ^  |  \n" +
                         "  | '_' |  \n" +
                         "  +-----+\n");
    }

    //5.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

    public static int sum(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int divide(int x, int y){
        return x / y;
    }

    public static int remainder(int x, int y){
        int div = divide(x, y);
        int prod = product(div, y);
        return subtract(x, prod);
    }

    //6.Write a Java program to convert temperature from Fahrenheit to Celsius degree, using this formula: C = 5/9 * (F-32)

    public static float convertFToC(float x){
        return 5f / 9f * (x - 32);
    }

    //7.Write a Java program that reads a number in inches, converts it to meters. ( one inch is 0.0254 meters)

    public static float convertInchToM(float x){
        return x * 0.0254f;
    }

//    8.Write a Java program to takes the user for a distance (in meters)and the time was taken
//    (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers
//    per hour and miles per hour (hint: 1 mile = 1609 meters).

    public static float convertMinToSec(float x){
        return x * 60f;
    }

    public static float convertSecToMin(float x){
        return x / 60f;
    }

    public static float convertHoursToMin(float x){
        return x * 60f;
    }

    public static float convertMinToHours(float x){
        return x / 60f;
    }

    public static float convertMToKm(float x){
        return x * 0.001f;
    }

    public static float convertMToMiles(float x){
        return x / 1609f;
    }

    public static float speed(float d, float t){
        return d / t;
    }
}
