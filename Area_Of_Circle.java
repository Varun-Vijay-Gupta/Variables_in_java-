import java.util.Scanner;

class Area_Of_Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int r = sc.nextInt();
        double a = 3.14 * r * r;
        System.out.print("Area of circle is: ");
        System.out.println(a);
    }
}