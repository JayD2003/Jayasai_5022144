package exercise_11;

public class DependencyInjection {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImplementation();
        CustomerService customerService = new CustomerService(customerRepository);
        Customer customer = customerService.getCustomerById(32);
        System.out.println("Name: " + customer.getName());
        System.out.println("Customer ID: " + customer.getId());   
    }
}
