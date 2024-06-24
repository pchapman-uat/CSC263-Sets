import java.util.HashSet;

public class Main {
    public static HashSet<Integer> set = new HashSet<Integer>();
    public static void main(String[] args) {
       randomHashSet(5);
       printHashSet();
    }

    private static void randomHashSet(int len){
        for (int i = 0; i < len; i++) {
            set.add((int)(Math.random()*100));
        }
    }

    private static void printHashSet(){
        for (Integer i:set) {
            System.out.println(i);
        }
    }
}