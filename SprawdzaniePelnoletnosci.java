import java.util.Scanner;
public class SprawdzaniePelnoletnosci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój wiek: ");
        int wiek = scanner.nextInt();

        if (wiek >= 18) {
            System.out.println("Jesteś pełnoletni!");
        }

        scanner.close();
    }
}