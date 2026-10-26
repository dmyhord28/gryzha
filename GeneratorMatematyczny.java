public class GeneratorMatematyczny {
    public void wyswietlTabliczke(int liczba) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(liczba + " x " + i + " = " + (liczba * i));
        }
    }
    public static void main(String[] args) {
        GeneratorMatematyczny generator = new GeneratorMatematyczny();
        generator.wyswietlTabliczke(5);
    }
}