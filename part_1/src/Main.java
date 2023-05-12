import java.util.*;

public class Main {
    public static void main(String[] args) {

        //for countOccurrence method
        String[] array = {"Word", "wood", "Name", "Earth", "Car", "WOOD", "Wood", "Dog", "Girl", "space", "WorD", "YouTube", "wood wood", "Andrew", "woodwood"};
        String word = "wood";

        System.out.println(countOccurrence(array, word));

        //for toList method
        System.out.println(toList(array));

        // for findUnique method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);

        System.out.println(findUnique(numbers));

        //for calcOccurrence method
        System.out.println(calcOccurrence(array));

        //for findOccurrence method
        System.out.println(Arrays.deepToString(findOccurrence(array)));

    }

    public static int countOccurrence(String[] list, String word) {
        int counter = 0;
        for (String target : list) {
            if (target.equalsIgnoreCase(word)) {
                counter++;
            }
        }
        return counter;
    }

    public static List<String> toList(String[] array) {

        return new ArrayList<>(Arrays.asList(array));

    }

    public static ArrayList<Integer> findUnique(ArrayList<Integer> list) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (int hand : list) {
            if (!unique.contains(hand)) {
                unique.add(hand);
            }
        }
        return unique;
    }

    public static String calcOccurrence(String[] words) {
        int[] counterArray = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(words[i].equalsIgnoreCase(words[j]) && i != j) {
                    counterArray[i]++;
                }
            }
        }
        String message = "";

        for (int i = 0; i < words.length; i++) {
            message = message + words[i] + ": " + counterArray[i] + "\n";
        }
        return message;
    }

    public static String[][] findOccurrence (String[] words) {
        String[][] occurrence = new String[words.length][1];
        int[] counterArray = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(words[i].equalsIgnoreCase(words[j]) && i != j) {
                    counterArray[i]++;
                }
                occurrence[i][0] = "name: " + words[i] + ", occurrence: " + counterArray[i];
            }
        }
        return occurrence;
    }
}