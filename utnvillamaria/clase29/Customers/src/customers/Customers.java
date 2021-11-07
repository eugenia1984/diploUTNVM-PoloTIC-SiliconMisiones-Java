package customers;

import customers.domain.Customer;


public class Customers {


    public static void main(String[] args) {
        //instancio un Customer para quechear que funciona bien
        Customer myCustomer = new Customer();
        //le seteo lso atributos
        myCustomer.setFirstname("Ana");
        myCustomer.setLastname("Lopez");
        myCustomer.setNationalId("93478529");
        //lo muestro por consula
        System.out.println(myCustomer); 
    }
  
}