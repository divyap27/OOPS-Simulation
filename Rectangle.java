import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

        Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

        void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        Rectangle rect = new Rectangle(length, breadth);

        rect.area();
    }
}
