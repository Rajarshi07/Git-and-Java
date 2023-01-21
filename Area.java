import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length=in.nextDouble();
        // Width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width=in.nextDouble();
        // Area of the rectangle
        double area=length*width;
        System.out.println("The area of the rectangle is: "+area);
        in.close();
    }
}
