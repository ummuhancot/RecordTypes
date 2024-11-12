package records2;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    List<Student> students = new ArrayList<>();

    //öğrencileri kaydet
    public void save(Student student){
        this.students.add(student);
    }

    //tüm ögrencileri listele
    public void printAllStudents(){
        for (Student std: this.students){
            System.out.println(std);//toString zaten override edilmiz yazdırır yani
        }
    }

    //mevcit bir öğrenciyi silme işlemi
    public void delete(Student student){
        this.students.remove(student);
    }



}
