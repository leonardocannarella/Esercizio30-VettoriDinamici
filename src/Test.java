import java.util.Collections;
import java.util.Vector;

public class Test
{
    public static void main(String[] args) {
        Vector<String> colors = new Vector<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Vector Elements: " + colors);
        Collections.sort(colors);
        System.out.println("Vector Sorted Elements: " + colors);
        colors.remove(4);
        System.out.println("Vector without 4th element: " + colors);
    }
}
