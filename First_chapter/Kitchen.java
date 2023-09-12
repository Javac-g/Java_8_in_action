package First_chapter;
import java.util.*;
import java.util.stream.*;

public class Kitchen {

    public static void first(List<Dish> dishes){
        List<Dish> lightDishes = new ArrayList<>();
        for (Dish dish: dishes){
            if (dish.getCalories() < 300){
                lightDishes.add(dish);
            }
        }
        lightDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });
         List<String> names = new ArrayList<>();
         for (Dish dish:lightDishes){
             names.add(dish.getName());
         }
        System.out.println(names);
    }

    public static void second(List<Dish> list){
        List<String> names =  list.parallelStream()
                .filter(dish -> dish.getCalories() < 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(names);
    }
    public static void main(String... args){
        List<Dish> dishes = List.of(
                new Dish(900,true,Type.MEAT,"Chiken"),
                new Dish(220,true,Type.MEAT,"Pork"),
                new Dish(150,true,Type.VEGETARIAN,"Orange"),
                new Dish(180,true,Type.VEGETARIAN,"Apple"),
                new Dish(300,true,Type.VEGETARIAN,"Banana"),
                new Dish(120,true,Type.OTHER,"Mushrooms"),
                new Dish(500,true,Type.MEAT,"Steak"),
                new Dish(200,true,Type.OTHER,"Pizza"),
                new Dish(150,true,Type.OTHER,"Soup")

        );
        first(dishes);
        second(dishes);

    }
}
