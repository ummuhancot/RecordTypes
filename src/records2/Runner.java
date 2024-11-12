package records2;

public class Runner {
    public static void main(String[] args) {

        Student student1 = new Student("Victor" ,"Hugo" ,"123456");
        Student student2 = new Student("Lev" ,"Tolstoy" ,"123789");

        StudentRepo repo = new StudentRepo();
        //bu öğrencileri kaydedelim
        repo.save(student1);
        repo.save(student2);

        //tüm kayıtları listeleyelim
        System.out.println("--------------Tüm Öğrenciler------------");
        repo.printAllStudents();

        student1.printFirstname();

        //listedeki 1. indexteki öğrencilin numarasını yanlış girilmiş
        //değiştirmek istiyoruz...
        //burda yeniden ekle ve eskiyi sildik
        //concatineysin yaptığımızda yeni bir obje üretiriz yine

        //yeni öğrencimiz
        Student newStudent = new Student(repo.students.get(1).firstname(),
                repo.students.get(1).lastname(),
                "123780");
        repo.save(newStudent);
        //eski öğrenciyi de silelim
        repo.delete(student2);

        //tüm öğrencileri listele
        System.out.println("--------Tüm Ögrenciler---------");
        repo.printAllStudents();
    }
}
