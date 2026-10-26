public class ManipulatorTekstu {

    public String odwroc(String tekst) {
        if (tekst == null) {
            return null;
        }

        StringBuilder odwroconyTekst = new StringBuilder();

        for (int i = tekst.length() - 1; i >= 0; i--) {
            odwroconyTekst.append(tekst.charAt(i));
        }

        return odwroconyTekst.toString();
    }

    public static void main(String[] args) {
        ManipulatorTekstu manipulator = new ManipulatorTekstu();

        String tekst = "Programowanie";
        String wynik = manipulator.odwroc(tekst);
        System.out.println("Oryginalny tekst: " + tekst);
        System.out.println("Odwrócony tekst:  " + wynik);
    }
}