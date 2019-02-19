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
}
