public class StatusZamowenia {
    public static void main(String[] args) {
        char status = 'N';

        String opisZamowienia = switch (status) {

            case 'N' -> "Nowe";
            case 'W' -> "Wysłane";
            case 'Z' -> "Zrealizowane";
            default -> "Nieznany status";
        };
        System.out.println("Status zamówienia: " + opisZamowienia);
    }
}