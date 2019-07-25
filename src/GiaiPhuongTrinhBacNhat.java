import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("giải phương trình");
        System.out.println("cho 'a * x + b = 0', nhap hang so:");
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x1 = -b / a;
            System.out.printf("nghiem 1 cua phuong trinh la :x= %f!\n", x1);
        }
        if (a != 0) {
            double x2 = (c - b) / a;
            System.out.printf("nghiem 2 cua phuong trinh la : x = %f!", x2);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!\n");
            } else {
                System.out.print("phuong trinh vo nghiem ");
            }
        }
    }
}
