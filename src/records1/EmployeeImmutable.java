package records1;
///immutable: değiştirilebilir
import java.util.Objects;
/**
Bazı durumlarda thread güvenliği(thread-safe), cachede veri tutarlılığı,
test kolaylığı vb sebeplerle immutable(değiştirilemez) classlar tanımlamak isteyebiliriz.
 */
public class EmployeeImmutable {///bu classı aynen record ile yapalım

    private final String firstname;

    private final String lastname;

    private final String email;

    //paramli const
    public EmployeeImmutable(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    //getter: read-only
    //setter: final olduğu için, değiştirelemesin diye yazmıyorum
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    //toString;obj string e dönüştüroyur yani okumamızı sağlar
    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    ///değiştirdik equals yazınca override ödeliroyr
    @Override//equals methodunu kendi istediğim duruma göre karşalaştırma yaptık
    public boolean equals(Object obj) {

        if (this==obj) return true;
        //employee2 .equals(employee2)
        //refenransları aynı değilse

        if (obj==null || this.getClass()!=obj.getClass()) return false;
        //employee2.equals(null)
        //employee2.equals(employee1)
        //gelen obje null ise bu classdaki obj parametrede gelen aynı değilse

        EmployeeImmutable emp=(EmployeeImmutable) obj;
        //employee2.equals(employee3)

        return Objects.equals(this.firstname,emp.firstname) &&
                Objects.equals(this.lastname,emp.lastname) &&
                Objects.equals(this.email,emp.email);
        //employee2 ile employee3 fieldaları aynı ise true döndür dedik

    }
    //objeler için benzersiz donlar üretir
    ///hashcode yazınca çıkıyor
    @Override
    public int hashCode() {//fieldların değerlerine göre hash codu üretir hash code
        return Objects.hash(firstname,lastname,email);
    }
}
