import java.util.LinkedList;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();

        Customer customer = new Customer();

        System.out.println("Welcome to queue simulator.");
        System.out.println();
        System.out.println("Input action \"queue\", \"dequeue\" or \"exit\": ");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        System.out.println();
        

        while (!input.equals("exit")) {
            if (input.equals("queue")) {

                // add customer to LinkedList
                queue.addFirst(customer);
                // set start time for the customer
                queue.getFirst().setStartTime(System.currentTimeMillis());
                // create a new customer who would be the next to get added to queue
                customer = new Customer();

                System.out.println("Input action \"queue\", \"dequeue\" or \"exit\": ");
                input = reader.nextLine();
                System.out.println();

            } else if (input.equals("dequeue")) {
                // error handling
                if (queue.isEmpty()) {
                    System.out.println("Cannot dequeue empty queue");
                    break;
                }
                // set end time for the customer about to be removed
                queue.getLast().setEndTime(System.currentTimeMillis());
                // count time spent
                System.out.println("Customer " + queue.getLast().getId() + " Id time spent: " + queue.getLast().getTimeSpent() + " milliseconds.");
                // remove the customer from queue
                queue.removeLast();

                System.out.println("Input action \"queue\", \"dequeue\" or \"exit\": ");
                input = reader.nextLine();
                System.out.println();
            }
            else {
                // error handling
                System.out.println("Error! Invalid input.");
                break;
            }
        }


    }
}
