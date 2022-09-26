import java.util.*;

public class ArrayList_Implementation{
    static Scanner input = new Scanner(System.in);


    public static void main (String[] args) throws InterruptedException{
        // ArrayList<Integer> arrList = new ArrayList<Integer>(1); //declaring an arraylist
        selection();



    }
    

    public static void menu(){
                System.out.println("""
                SELECT FROM THE FOLLOWING CHOICES:
                A. ADD NUMBER
                B. REMOVE NUMBER
                C. DISPLAY NUMBER
                D. CLEAR NUMBERS
                E. EXIT
                """);
            }

    public static void selection() throws InterruptedException{
        menu();
        String response = input.nextLine();
        System.out.println(response);
        if(response.equals("a")){
            System.out.println("Ahaha");
            Thread.sleep(1000);
            menu();
        }
    }
    
}