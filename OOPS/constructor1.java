public class constructor1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s3 = new Student("Harsh");
        Student s2 = new Student(23);
        System.out.println(s2.Reg_no);
        System.out.println();
        System.out.println(s3.Name);
    }
}

class Student{
    String Name;
    int Reg_no ;
    Student(String Name ){
        this.Name=Name;
    }
    Student(int Reg_no ){
        this.Reg_no=Reg_no;
    }
    Student(){
        System.out.println("Constructor is called .....");
    }
}