import java.util.LinkedList;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        LinkedList<Object> queue = new LinkedList<>();

        Customer customer = new Customer();

        System.out.println("Welcome to queue simulator. \n");
        System.out.println("Input action \"queue\", \"dequeue\" or \"exit\": ");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        

        while (!input.equals("exit")) {
            if (input.equals("queue")) {
                
                queue.addFirst(customer);
                customer = new Customer();

                System.out.println("Input action \"queue\", \"dequeue\" or \"exit\": ");
                input = reader.nextLine();

            } else if (input.equals("dequeue")) {

                queue.removeLast();

                System.out.println("Input action \"queue\", \"dequeue\" or \"exit\": ");
                input = reader.nextLine();
            }
        }

        System.out.println(queue);


    }
}
