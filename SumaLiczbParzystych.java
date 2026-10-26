public class SumaLiczbParzystych {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("Suma liczb parzystych od 1 do 20 wynosi: " + suma);
    }
}