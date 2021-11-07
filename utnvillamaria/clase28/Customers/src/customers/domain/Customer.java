package customers.domain;

public class Customer {
    //Atributos
    private String firstname;
    private String lastname;
    private String nationalId;
    //getters y setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    //toString
    @Override
    public String toString() {
        return "first name = " + firstname + ", last name = " + 
                lastname + ", ID nacional = " + nationalId;
    }
    
    
}
