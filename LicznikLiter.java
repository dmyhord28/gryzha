public class LicznikLiter {
    public int policzSamogloski(String tekst) {
        if (tekst == null) {
            return 0;
        }
        tekst = tekst.toLowerCase();
        int licznik = 0;

        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                licznik++;
            }
        }
        return licznik;
    }
    public static void main(String[] args) {
        LicznikLiter licznikLiter = new LicznikLiter();
        System.out.println(licznikLiter.policzSamogloski("Programowanie"));
    }
}
