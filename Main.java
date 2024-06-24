import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static HashSet<Integer> set = new HashSet<Integer>();
    public static void main(String[] args) {
        userGenerateSet();
        printHashSet();
        System.out.println(isInHashSet(5));
        if(removeHashSet(4)) System.out.println("Number 4 was removed");
        printHashSet();
        System.out.println(uniqueElements(2,4,1,2,3,4,5,1,4,6));
    }

    private static void userGenerateSet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the set:");
        int len = scanner.nextInt();
        System.out.println("Enter the maximum value of the set:");
        int max = scanner.nextInt();
        randomHashSet(len, max);
        scanner.close();
    }

    private static <T> Set<T> uniqueElements(T... values){
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


    private static void randomHashSet(int len){
        randomHashSet(len, 10);
    }
    private static void randomHashSet(int len, int max){
        for (int i = 0; i < len; i++) {
            set.add((int)(Math.random()*max));
        }
    }

    private static void printHashSet(){
        for (Integer i:set) {
            System.out.println(i);
        }
    }
}