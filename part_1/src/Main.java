import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //for countOccurrence method
        String[] array = {"Word", "wood", "Name", "Earth", "Car", "WOOD", "Wood", "Dog", "Girl", "space", "WorD", "YouTube", "wood wood", "Andrew", "woodwood"};
        String word = "wood";
        //System.out.println(countOccurrence(array, word));

        //for toList method
        System.out.println(toList(array));

    }
    public  static int countOccurrence(String[] list, String word) {
        int counter = 0;
        for (String target: list) {
            if (target.equalsIgnoreCase(word)) {
                counter++;
            }
        }
        return counter;
    }

    public static List<String> toList (String[] array) {

        return new ArrayList<>(Arrays.asList(array));

    }


}