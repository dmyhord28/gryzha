import java.util.Scanner;
class Osoba {
    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    public void wyswietlPowitanie() {
        System.out.println("Cześć, mam na imię " + imie + " i mam " + wiek + " lat.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int wiek = scanner.nextInt();

        Osoba osoba = new Osoba(imie, wiek);
        osoba.wyswietlPowitanie();
        scanner.close();
    }

}


