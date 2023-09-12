package Iterate_Generate;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void first(){
        List<Integer> infinite = Stream.iterate(0,i-> i+3).limit(10).toList();
        System.out.println(infinite);
    }
    public static void second(){
        Supplier<UUID> randomSupplier = UUID::randomUUID;
        Stream<UUID> infiniteStream = Stream.generate(randomSupplier);
        List<UUID> uuidList = infiniteStream
                .skip(10)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(uuidList);
    }
    public static void main(String...args){
        first();
        second();
    }
}
