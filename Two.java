import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Two {
    public static void main(String...args){
        List<List<String>> table = new ArrayList<>();
        table.add(Arrays.asList("Hello","My", "Friend"));
        table.add(Arrays.asList("its","a", "magic"));
        table.add(Arrays.asList("Can","You", "see?"));
        table.add(Arrays.asList("Dont","be", "stupid"));

       List<String> result = table.stream().flatMap(Collection::stream)
                .skip(1)
                .limit(8)
                .toList();

        System.out.println(result);
    }
}
