package exercises;


public class RectangleArea {
    public static void main(String[] args) {
        java.util.Scanner input;

        input = new java.util.Scanner(System.in);
        System.out.println("Enter height: ");
        double height = input.nextDouble();
        System.out.println("Enter width: ");
        double width = input.nextDouble();

        double area = height*width;
        System.out.println("Area of rectangle is: " + area);

    }


}
