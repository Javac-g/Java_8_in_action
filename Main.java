import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int sum = Arrays.stream(new int[]{1,2,3,4,5,6,7})
                .limit(3)
                .filter(i -> i <3)
                .map(i -> i * i)
                .sum();

        System.out.println(sum);
        int[] res = Arrays.stream(new int[]{1,2,3,4,5,6,7})
                .limit(3)
                .toArray();

        IntStream.of(res).forEach(System.out::println);
    }
}