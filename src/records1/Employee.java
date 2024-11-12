package records1;
///mutable : deiğiştirelbilir
public class Employee {

    private String firstname;

    private String lastname;

    private String email;

    //paramli const

    public Employee(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }


    //getter-setter

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //toString


    //toString
    @Override
    public String toString() {
        return  "isim='" + firstname + '\'' +
                ", soyisim='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}