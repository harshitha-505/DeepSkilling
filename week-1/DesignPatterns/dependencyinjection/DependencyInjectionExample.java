package dependencyinjection;

public class DependencyInjectionExample {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        String customer = service.getCustomer(101);

        System.out.println("Customer Name: " + customer);
    }
}