public class OcenaSzkolna {
    public static void main(String[] args) {
        int punkty = 78;

        if (punkty >= 90) {
            System.out.println("Ocena: bardzo dobry");
        } else if (punkty >= 70) {
            System.out.println("Ocena: dobry");
        } else if (punkty >= 50) {
            System.out.println("Ocena: dostateczny");
        } else {
            System.out.println("Ocena: niedostateczny");
        }
    }
}