public class DzieleniePrzezDwojke {
    public static void main(String[] args) {

        int wartosc = 100;

        while (wartosc > 1) {
            System.out.println("Aktualna wartość: " + wartosc);
            wartosc /= 2;
        }

        System.out.println("Koniec pętli. Ostatnia wartość: " + wartosc);
    }
}