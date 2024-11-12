package records1;

public class Runner {
    public static void main(String[] args) {

        Employee employee1=new Employee("Jack", "Sparrow", "jack@gmail.com");
        System.out.println(employee1);

        //emaili değiştirmek istersek
        employee1.setEmail("jaskcparrow@gmail.com");
        System.out.println("emaili değişem employee : " + employee1);

        //thread-safe

        //bazı durumlarda bir kere değerlerini belirledikten sonra
        //fieldları bir daha değiştirilemeyen objelere ihtiyaç duyabiliriz

        System.out.println("------------------------immutable---------------");
        //immutable class: read-only okunabilir-değiştirelmez
        EmployeeImmutable employee2 = new EmployeeImmutable("Harry", "Potter", "harry@gmail.com");
        System.out.println(employee2);

        //emaili değiştirmek istersek değiştiremiyoruz
        //employee2.setEmail("......");
        //employee2.setfirstname("......");
        //employee2.setlastname("......");

        System.out.println("employee2 inin ismi : " + employee2);

        EmployeeImmutable employee3 = new EmployeeImmutable("Harry", "Potter", "harry@gmail.com");

        // hem referans hemde değerler karşılaştırılıyor
        System.out.println("double equal ile : " +(employee2 == employee3));//false
        System.out.println("epuals methodu ile : " + (employee2.equals(employee3)));///false-->//true
        ///değiştirilen yerde artık true döndürdü


        //peki boiler plate(basma kalıp) kondları hiç kullanmadan
        //immutable class oluşturamaz mıyız?

        //CEVAP: Java 14 ile gelen record type özelliği ile yapabiliriz.
        EmployeeRecord employee4 = new EmployeeRecord("Ali", "Can" , "can@mail.com");
        System.out.println("Record employee : " + employee4);
        System.out.println("Record employee ismi : " +employee4.firstname());//gettir methodu

        //employee4.setEmail(); --> immutable dir settir methodu yok değiştirilemez

        EmployeeRecord employee5 = new EmployeeRecord("Ali", "Can" , "can@mail.com");
        System.out.println("=="+(employee4==employee5));///false referansları farklı olduğu için
        System.out.println("equals : "+(employee4.equals(employee5)));///true değerleri aynı olduğu için





    }
}
