package records2;

public record Student(String firstname, String lastname, String studentNumber) {
   /*
    public void setStudentNumber(String number){
     this.studentNumber=number;
    }
    */
    ///NOT: recordlar default olarak immutable yani
    //değiştirelemez read-only(okunabilir )dir
    //gieldları finaldir ve setter gibi bir method ekleyemeyiz

    public void printFirstname(){
        System.out.println("Ögrencinin adı : "+this.firstname);
    }

}

//data base ile calışırken sık sık görücez
//kaydetme silme tüm bilgileri görme bunlar için ayrı ayrı classlar oluşturuyorduk