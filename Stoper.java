public class Stoper {
    private int sekundy;

    public Stoper(int sekundy) {
        this.sekundy = sekundy;
    }

    public void odliczaj() {
        for (int i = sekundy; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Stoper stoper = new Stoper(10);
        stoper.odliczaj();
    }
}