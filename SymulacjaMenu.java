public class SymulacjaMenu {
    public static void main(String[] args) {

        int opcja = 1;

        do {
            System.out.println("Symulacja: Użytkownik wybrał opcję " + opcja);
            opcja++;
        } while(opcja != 3);

        System.out.println("Symulacja: Użytkownik wybrał opcję 3");
        System.out.println("Koniec programu (wyjście z menu).");
    }
}