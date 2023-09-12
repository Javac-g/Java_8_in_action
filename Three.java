import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Three {
    public static String getNum(int...arr){
        if (arr.length != 10){
            throw new IllegalArgumentException(" Number must contain 10 digits");
        }
        String ans = IntStream.of(arr).mapToObj(String::valueOf).collect(Collectors.joining());

        return String.format("+38 (%s) %s-%s-%s" , ans.substring(0,3) ,ans.substring(3,6) ,ans.substring(6,8),ans.substring(8));
    }
    public static String getArr(int[] arr){
        String[] str = IntStream.of(arr).mapToObj(String::valueOf).toArray(String[]::new);
        return String.join("", str);
    }

    public static void main(String...args){
        System.out.println(getNum(0,9,7,0,3,2,0,9,8,5));
    }
}
