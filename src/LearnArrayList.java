import java.util.ArrayList;

/**
 * ArrayList = a resizable array.
 *          Elements can be added and removed after compilation phase
 *          store reference data types
 */
public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }

}
