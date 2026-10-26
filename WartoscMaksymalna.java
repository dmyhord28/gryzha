public class WartoscMaksymalna {
    public static void main(String[] args) {

        int[] liczby = {15, 67, 43, 12, 10, 56};

        int max = liczby[0];


        for (int liczba : liczby) {
            if (liczba > max) {
                max = liczba;
            }
        }

        System.out.println("Największa liczba w tablicy to: " + max);
    }
}