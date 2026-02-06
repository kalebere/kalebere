import java.util.Scanner;

class Area {
    int length;
    int breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

public class AreaTest {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        int l = sc.nextInt();

        System.out.println("Enter breadth of rectangle:");
        int b = sc.nextInt();

        Area a = new Area();
        a.setDim(l, b);

        System.out.println("Area of Rectangle is: " + a.getArea());

        sc.close();
    }
}