package practical;

import java.util.Scanner;

public class L1_1Area_of_triangle{
    public static void main(String[] args) {
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hight and Base");
        l = sc.nextInt();
        b = sc.nextInt();
        double Area = (0.5*l*b);
        System.out.println(Area);
    }
} 