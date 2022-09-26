import java.util.*;

public class ArrayList_Implementation {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrList = new ArrayList<Integer>(1); // declaring an arraylist
        selection(arrList);
    }

    public static void menu() {
        System.out.println("""
                SELECT FROM THE FOLLOWING CHOICES:
                A. ADD NUMBER
                B. REMOVE NUMBER
                C. DISPLAY NUMBER
                D. CLEAR NUMBERS
                E. EXIT
                """);
    }

    public static void selection(ArrayList<Integer> list) throws InterruptedException {
        while (true) {
            menu();
            String response = input.nextLine();
            if (response.equals("a")) {
                System.out.println("Add a number to the list: ");
                int num = input.nextInt();
                if (num < 0) {
                    Thread.sleep(1000);
                    System.out.println("Sorry, number must be greater than or equal to zero.");
                    Thread.sleep(2000);
                } else {
                    list.add(num);
                    Thread.sleep(1000);
                    System.out.println("You added " + num + " to the list.");
                    Thread.sleep(1000);
                }
            } else if (response.equals("b")) {
                System.out.println("Input the number you want to remove: ");
                int num = input.nextInt();
                if (list.indexOf(num) == -1) {
                    System.out.println("Sorry, the number you want to remove is not present in the list.");
                    Thread.sleep(1000);
                } else {
                    list.remove(Integer.valueOf(num));
                    Thread.sleep(1000);
                    System.out.println("You removed " + num + " from the list");
                    Thread.sleep(1000);
                }
            } else if (response.equals("c")) {
                System.out.println("Display the list: " + list);
                Thread.sleep(1000);
                System.out.println("\n");
            } else if (response.equals("d")) {
                list.clear();
                System.out.println("You cleared the list");
                Thread.sleep(1000);
            } else if (response.equals("e")) {
                System.out.println("Exiting...");
                Thread.sleep(1000);
                System.exit(0);
            }
        }
    }

}