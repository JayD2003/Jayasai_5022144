package exercise_11;

public class CustomerRepositoryImplementation implements CustomerRepository {
    public Customer findCustomerById(int id) {
        return new Customer(id, "Jayasai");
    }
}