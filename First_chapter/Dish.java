package First_chapter;

import java.util.Objects;

enum Type{VEGETARIAN,MEAT,OTHER}
public class Dish {
    private final int calories;
    private final boolean ready;
    private final Type type;
    private final String name;

    public Dish(int calories, boolean ready, Type type, String name) {
        this.calories = calories;
        this.ready = ready;
        this.type = type;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isReady() {
        return ready;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "\nName:" + name + "\nCalories: " + calories ;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dish dish = (Dish)obj;
        return Objects.equals(getCalories(),dish.getCalories()) && Objects.equals(getName(),dish.getName());
    }
    @Override
    public int hashCode(){
        int hash = 9;
        hash+= hash * 5 + Objects.hashCode(getCalories());
        hash+= hash * 5 + Objects.hashCode(getName());
        return hash;
    }
}
