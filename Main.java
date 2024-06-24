// Imports
// Import set and has set from java utilities
import java.util.HashSet;
import java.util.Set;
// Import scanner to recive user input
import java.util.Scanner;

public class Main {
    // Create a public variable for the set that will be used
    public static HashSet<Integer> set = new HashSet<Integer>();
    // Create the scanner object
    private static Scanner scanner = new Scanner(System.in);
    // Main function that runs on start
    public static void main(String[] args) {
        // Generate a set based on user input
        userGenerateSet();
        // Seperator
        System.out.println("-".repeat(20));
        // Print values in set
        printHashSet(set);
        System.out.println("-".repeat(20));
        // Check if value is in set based on user input
        userInHashSet();
        System.out.println("-".repeat(20));
        // Remove from set based on user input
        userRemoveInHashSet();
        System.out.println("-".repeat(20));
        // Print updated set
        printHashSet(set);
        System.out.println("-".repeat(20));
        // Create array of integers
        Integer[] array = {2,4,1,2,3,4,5,1,4,6};
        System.out.print("Push enter to continue");
        // Advance scanner twice to request for the enter key
        scanner.nextLine();
        scanner.nextLine();
        System.out.println("Unique elements: ");
        // Print before conversion to set
        System.out.println("Before: ");
        System.out.println("-".repeat(20));
        printArray(array);
        // Print after conversion
        System.out.println("After: ");
        System.out.println("-".repeat(20));
        printHashSet(uniqueElements(array));
    }

    // Any object type is allowed here for the array
    private static <T> void printArray(T[] values){
        // For each value print it
        for (T value : values) {
            System.out.println(value);
        }
    }

    // Remove based on user input
    private static void userRemoveInHashSet(){
        // Ask for value to remove
        System.out.println("What number do you want to remove?");
        int num = scanner.nextInt();
        // If value was removed inform user, else inform user none was removed
        if(removeHashSet(num)) System.out.println("Number " + num + " was removed");
        else System.out.println("Number " + num + " was not removed as it is not in the set");
    }
    // With user input check if in hash set
    private static void userInHashSet(){
        // Ask for number to look for
        System.out.println("What number do you want to look for?");
        int num = scanner.nextInt();
        // If the value is in the set display, else inform user it was not in the set
        if(isInHashSet(num)) System.out.println("Number " + num + " is in the set");
        else System.out.println("Number " + num + " is not in the set");
    }
    // Generate set based on user input
    private static void userGenerateSet(){
        // Ask for lenght of set
        System.out.println("Enter the number of elements in the set:");
        int len = scanner.nextInt();
        // Ask for maximum value for the set
        System.out.println("Enter the maximum value of the set:");
        int max = scanner.nextInt();
        // Create a random set based on values
        randomHashSet(len, max);
    }

    // Unique elements from array
    private static <T> HashSet<T> uniqueElements(T[] values){
        // Create a new set
        HashSet<T> set = new HashSet<T>();
        // For each value add to set
        for (T t : values) {
            set.add(t);
        }
        // return the set
        return set;
    }
    // Remove from hash set
    private static boolean removeHashSet(int num){
        // Remove from list, return true if removed
        return set.remove(num);
    }

    // return boolean if in set
    private static boolean isInHashSet(int num){
        return set.contains(num);
    }
    // Generate random set from length and maximum
    private static void randomHashSet(int len, int max){
        // For each value...
        for (int i = 0; i < len; i++) {
            // Add to set by making a random number between 0-max
            // Convert to int and add to set
            set.add((int)(Math.random()*max));
        }
    }

    // Print set of any type
    private static <T> void printHashSet(Set<T> set){
        // For each value print new line
        for (T val:set) {
            System.out.println(val);
        }
    }
}