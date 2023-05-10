public class Main {
    public static void main(String[] args) {

        String[] array = {"Word", "wood", "Name", "Earth", "Car", "WOOD", "Wood", "Dog", "Girl", "space", "WorD", "YouTube", "wood wood", "Andrew", "woodwood"};
        String word = "wood";
        System.out.println(countOccurrence(array, word));
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
}