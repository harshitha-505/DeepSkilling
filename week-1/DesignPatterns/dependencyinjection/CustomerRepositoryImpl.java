package dependencyinjection;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Harshitha";
        }

        return "Customer Not Found";
    }
}
