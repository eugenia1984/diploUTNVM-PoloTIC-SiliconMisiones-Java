package customers.controller;

import customers.domain.Customer;
import java.util.List;
import java.util.ArrayList;


public class CustomerController {
    private List<Customer> customerList = new ArrayList<>();
    
    //metodo para CREATE
    public void createCustomer(String firstName, String lastName, String nationalId) {
        //crea el customer
        Customer customer = new Customer(); 
        //setea los datos
        customer.setFirstname(firstName);
        customer.setLastname(lastName);
        customer.setNationalId(nationalId);
        //lo agrega al ArrayList
        customerList.add(customer);
    }
    
    //metodo para el READ
    public List<Customer> getAllCustomers(){
        return customerList;
    }
    
}
