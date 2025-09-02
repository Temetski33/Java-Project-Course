public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("Id is " + customer.getId());

        customer.setStartTime(System.currentTimeMillis());
        customer.setEndTime(System.currentTimeMillis());

        System.out.println(customer.getStartTime());
        System.out.println(customer.getTimeSpent());

        Customer customer2 = new Customer();
        System.out.println("Id is " +customer2.getId());
    }
}
