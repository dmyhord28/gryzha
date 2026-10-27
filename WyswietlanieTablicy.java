public class WyswietlanieTablicy {
    public static void main(String[] args) {
        int[] d = new int[10];

        for(int i=0;i < d.length;i++){
        d[i] =  (i + 1) * 5;}

        System.out.println("Elementy tablicy: ");
        for(int i = 0; i < d.length; i++){
            System.out.print(d[i] + " ");
        }

    }
}
