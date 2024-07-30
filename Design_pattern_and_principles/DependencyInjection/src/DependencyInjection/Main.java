package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        // Create the repository implementation
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Create the service with the repository injected
        CustomerService customerService = new CustomerService(customerRepository);

        // Find and display customer details
        Customer customer = customerService.getCustomerById(1);
        if (customer != null) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}