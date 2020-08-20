package exercises;

public class MilerPerGallon {

    public static void main(String[] args) {
        java.util.Scanner input;

        input = new java.util.Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter the gallons of gas consumed: ");
        double gas = input.nextDouble();

        double mpg = gas/miles;
        System.out.println("Your miles per gallon: " + mpg);

    }
}
