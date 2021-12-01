class Student{

    String name;
    int age;
    String college;

    static int counter=0;

    public Student(String name, int age) {
        this(name,age,"IIT");

    }

    public Student(String name, int age, String college){
        this.name = name;
        this.age = age;
        this.college=college;
        this.counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  String getCollege() {
        return college;
    }

    public  void setCollege(String college) {
        this.college = college;
    }

     public void display(){
        System.out.println("counter:"+counter+" name:"+name+" age:"+age+" college:"+college);
    }

    static public void getNoOfStudents(){
        int num=5;
        System.out.println("NoOfStudents:"+counter);
    }

    // we can use only static variables inside static methods
    // inside non-static method we can use both static and non  static variables
}


class Vehicle{
    String colour;

    public Vehicle(){ // default or no argument const

    }

    public void drive(){
        System.out.println("driving");
    }
}





public class sample_code {

    public static void main(String[] args) {

        Student stud1=new Student("vijay", 20);
//        stud1.name="vijay";
//        stud1.age=20;

        stud1.display();
        Student.getNoOfStudents();

        Student stud2=new Student("Ram", 21);
//        stud2.name="Ram";
//        stud2.age=21;

        stud2.display();
        Student.getNoOfStudents();
        Student stud3=new Student("Raj", 22, "NIT");

        stud3.display();
        Student.getNoOfStudents();

        System.out.println(Student.counter);

    }
}


/*
Access specifiers:
 i)   private- can be accessed only within same class
 ii)  default- can be accessed within class and same package
 iii) protected-can be accessed within class and same package and subclasses
 iv)  public-can be accessed from anywhere within project

 */
