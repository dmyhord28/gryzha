import java.util.Scanner;
public class Biletomat {
    private double cenaBiletu;

    public Biletomat(double cenaBiletu) {
        this.cenaBiletu = cenaBiletu;
    }

    public void kupBilet(double wplaconaKwota) {
        if (wplaconaKwota >= cenaBiletu) {
            double reszta = wplaconaKwota - cenaBiletu;
            System.out.println("Wydano bilet!");
            System.out.println("Reszta: " + reszta + " zł");
        } else {
            double brakujacaKwota = cenaBiletu - wplaconaKwota;
            System.out.println("Brak środków! Brakuje jeszcze: " + brakujacaKwota + " zł");
        }
    }

    public static void main(String[] args) {
        Biletomat biletomat = new Biletomat(5.50);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cena biletu wynosi: 5.50 zł");
        System.out.print("Wprowadź kwotę (w zł): ");
        
        double wplaconaKwota = scanner.nextDouble();
        biletomat.kupBilet(wplaconaKwota);
        scanner.close();
    }
}