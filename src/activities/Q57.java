package activities;
import java.util.Arrays;
import java.util.HashSet;
public class Q57 {
	public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
        String[] array2 = {"cherry", "date", "fig", "grape", "kiwi"};

        String[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements:");
        for (String element : commonElements) {
            System.out.println(element);
        }
    }

    public static String[] findCommonElements(String[] array1, String[] array2) {
        // Create a HashSet to store elements from the first array.
        HashSet<String> set1 = new HashSet<>();
        for (String str : array1) {
            set1.add(str);
        }

        // Create a HashSet to store common elements.
        HashSet<String> commonSet = new HashSet<>();

        // Check elements in the second array for common elements with the first array.
        for (String str : array2) {
            if (set1.contains(str)) {
                commonSet.add(str);
            }
        }

        // Convert the HashSet of common elements to an array.
        String[] commonElements = new String[commonSet.size()];
        commonSet.toArray(commonElements);

        return commonElements;
    }
}

