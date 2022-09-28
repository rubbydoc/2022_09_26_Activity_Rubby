import java.util.*;
import java.util.Map.Entry;
public class HashMap_Implementation {
    static Scanner input = new Scanner(System.in);
    static HashMap<Integer, Integer> map = new HashMap<>();
    static int key=0;


    public static void main(String[] args) throws InterruptedException {
        select();
    }

    public static void select() throws InterruptedException {
        while (true) {
            System.out.println("""
                    SELECT FROM THE FOLLOWING CHOICES:
                    A. ADD NUMBER
                    B. REMOVE NUMBER
                    C. DISPLAY NUMBER
                    D. CLEAR NUMBERS
                    E. EXIT
                    """);
            String choice = input.nextLine();
            Thread.sleep(1000);
            switch (choice) {
                case "A": case "a":
                    System.out.println("Add a number to the map: ");
                    add(input.nextInt());
                    Thread.sleep(1000);
                    break;
                case "B": case "b":
                    System.out.println("Input number you want to remove from the map: ");
                    remove(input.nextInt());
                    Thread.sleep(1000);
                    break;
                case "C": case "c":
                    display();
                    Thread.sleep(1000);
                    break;
                case "D": case "d":
                    clear();
                    Thread.sleep(1000);
                    break;
                case "E": case "e":
                    System.exit(0);
                    break;
                
                
                
            }
        }
    }

  
    public static void add(int num) throws InterruptedException{
        key++;
            map.put(key,num);
            Thread.sleep(1000);
            System.out.println("You added " + num + " to the map.");
        
        
        
    }

    public static void remove(int num) throws InterruptedException {
        int key=0;
        for(Entry<Integer, Integer>entry : map.entrySet()){
            if(entry.getValue()==num){
             key = entry.getKey();
            }
        }
        map.remove(key);
        Thread.sleep(1000);
        System.out.println("You removed " + num + " from the map.");
       
    }

    public static void display()throws InterruptedException {
        System.out.println(map);
    }

    public static void clear() throws InterruptedException{
        map.clear();
        Thread.sleep(1000);
        System.out.println("The map has been cleared.");
    }
}
