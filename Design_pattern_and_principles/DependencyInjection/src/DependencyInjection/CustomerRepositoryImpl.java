package DependencyInjection;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    // In-memory database simulation
    private Map<Integer, Customer> database = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Sample data
        database.put(1, new Customer(1, "Alice Smith"));
        database.put(2, new Customer(2, "Bob Johnson"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return database.get(id);
    }
}
