import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Homework h = new Homework();
        System.out.println(h.countEvens(new int[]{2, 4, 6, 1, 2}));
        System.out.println(h.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
        System.out.println(h.squareUp(3));
        System.out.println(Arrays.toString(h.fix45(new int[]{5, 4, 5, 4, 1})));

    }


}