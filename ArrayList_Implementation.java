import java.util.*;

public class ArrayList_Implementation{
    static Scanner input = new Scanner(System.in);



    public static void main (String[] args) throws InterruptedException{
        ArrayList<Integer> arrList = new ArrayList<Integer>(1); //declaring an arraylist
        selection(arrList);
       
      

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

    public static void selection(ArrayList<Integer> list) throws InterruptedException{
       while(true){
        menu();
        String response = input.nextLine();


       
        if(response.equals("a")){
            System.out.println("Add a number to the list: ");
            int num = input.nextInt();
            list.add(num);
            Thread.sleep(1000);

            System.out.println("You added a number to the list.");

            Thread.sleep(1000);
            
        } else if(response.equals("b")){

            Thread.sleep(1000);
            menu();

        } else if(response.equals("c")){

            Thread.sleep(1000);
            menu();

        } else if(response.equals("d")){

            Thread.sleep(1000);
            menu();

        } else if(response.equals("e")){

            Thread.sleep(1000);
            menu();

        }
       }
    }


  
    
}