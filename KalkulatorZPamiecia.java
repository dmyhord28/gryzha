public class KalkulatorZPamiecia {
    private double ostatniWynik;

    public KalkulatorZPamiecia() {
        this.ostatniWynik = 0.0;
    }
    public void dodaj(double x) {
        this.ostatniWynik += x;
    }
    public void odejmij(double x) {
        this.ostatniWynik -= x;
    }
    public double getOstatniWynik() {
        return ostatniWynik;
    }

    public static void main(String[] args) {
        KalkulatorZPamiecia kalkulator = new KalkulatorZPamiecia();

        kalkulator.dodaj(10.5);
        kalkulator.dodaj(4.5);
        kalkulator.odejmij(3.0);

        System.out.println("Ostatni wynik: " + kalkulator.getOstatniWynik());
    }
}