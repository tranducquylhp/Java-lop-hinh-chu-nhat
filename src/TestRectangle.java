import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu cao: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new  Rectangle(width,height);
        System.out.println(rectangle.display());
    }
}
