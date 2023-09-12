import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public class One {

    public static void main(String...args){
        List<List<String>> table = new ArrayList<>();
        table.add(Arrays.asList("First","Second","Third"));
        table.add(Arrays.asList("Max","Ann","Ivan"));
        table.add(Arrays.asList("Green","Blue","Yellow"));

        table.stream()
                .map(Collection::stream)
                .skip(1)
                .forEach(stream->stream.forEach(System.out::println));
    }
}
