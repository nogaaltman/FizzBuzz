import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {
        int sum = 0;
        int i = 100;
        while (i != 0) {
            if (i % 2 == 0) {
                i = i / 2;
                sum++;
            }
            else {
                i = i - 1;
                sum++;

            }
        }
        System.out.println(sum);
    }
}
