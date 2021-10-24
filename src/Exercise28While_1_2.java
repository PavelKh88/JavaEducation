public class Exercise28While_1_2 {
    public static void main(String[] args) {
        int a = 1;

        do{
            System.out.print(" " + a + " ");
            a++;

        }
        while (a <= 9);
        a = 9;
        System.out.println();
        do{
            System.out.print(" " + a + " ");
            a--;
        }
        while (a >= 1);
    }
}
