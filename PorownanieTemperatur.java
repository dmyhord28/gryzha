public class PorownanieTemperatur {
    public static void main(String[] args) {

        int temperatura = 18;

        if (temperatura < 0) {
            System.out.println("Mróz");
        } else if (temperatura >= 18 && temperatura <= 22) {
            System.out.println("Temperatura pokojowa");
        } else {
            System.out.println("Inna temperatura");
        }
    }
}