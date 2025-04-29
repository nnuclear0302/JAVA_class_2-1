import javax.swing.*;
import java.util.Scanner;

public class CIrcleEX {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("반지름을 입력하시오: ");
        double radius = keyboard.nextDouble();
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("원의 넓이: " + String.format("%.2f", area));
        System.out.println("원의 둘레: " + String.format("%.2f", perimeter));
    }
}

