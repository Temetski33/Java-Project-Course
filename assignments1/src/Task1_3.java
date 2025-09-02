import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("Id is " + customer.getId());

        customer.setStartTime(System.currentTimeMillis());

        System.out.println("Input something: ");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();

        customer.setEndTime(System.currentTimeMillis());

        System.out.println("Start time is " + customer.getStartTime());
        System.out.println(customer.getTimeSpent() + " milliseconds");

        Customer customer2 = new Customer();
        System.out.println("Id is " +customer2.getId());
    }
}
