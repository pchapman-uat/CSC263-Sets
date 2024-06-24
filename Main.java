import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static HashSet<Integer> set = new HashSet<Integer>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        userGenerateSet();
        System.out.println("-".repeat(20));
        printHashSet(set);
        System.out.println("-".repeat(20));
        userInHashSet();
        System.out.println("-".repeat(20));
        userRemoveInHashSet();
        System.out.println("-".repeat(20));
        printHashSet(set);
        System.out.println("-".repeat(20));
        Integer[] array = {2,4,1,2,3,4,5,1,4,6};
        System.out.print("Push enter to continue");
        scanner.nextLine();
        scanner.nextLine();
        System.out.println("Unique elements: ");
        System.out.println("Before: ");
        System.out.println("-".repeat(20));
        printArray(array);
        System.out.println("After: ");
        System.out.println("-".repeat(20));
        printHashSet(uniqueElements(array));
    }

    private static <T> void printArray(T[] values){
        for (T value : values) {
            System.out.println(value);
        }
    }

    private static void userRemoveInHashSet(){
        System.out.println("What number do you want to remove?");
        int num = scanner.nextInt();
        if(removeHashSet(num)) System.out.println("Number " + num + " was removed");
        else System.out.println("Number " + num + " was not removed as it is not in the set");
    }
    private static void userInHashSet(){
        System.out.println("What number do you want to look for?");
        int num = scanner.nextInt();
        if(isInHashSet(num)) System.out.println("Number " + num + " is in the set");
        else System.out.println("Number " + num + " is not in the set");
    }
    private static void userGenerateSet(){
        System.out.println("Enter the number of elements in the set:");
        int len = scanner.nextInt();
        System.out.println("Enter the maximum value of the set:");
        int max = scanner.nextInt();
        randomHashSet(len, max);
    }

    private static <T> Set<T> uniqueElements(T[] values){
        Set<T> set = new HashSet<T>();
        for (T t : values) {
            set.add(t);
        }
        return set;
    }
    private static boolean removeHashSet(int num){
        return set.remove(num);
    }

    private static boolean isInHashSet(int num){
        return set.contains(num);
    }
    private static void randomHashSet(int len, int max){
        for (int i = 0; i < len; i++) {
            set.add((int)(Math.random()*max));
        }
    }

    private static <T> void printHashSet(Set<T> set){
        for (T val:set) {
            System.out.println(val);
        }
    }
}