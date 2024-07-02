import java.util.ArrayList;
//this class holds the school class which contains teacher and student type objects
//this class can edit said objects with specific methods
public class School {
    //class unique fields
    String name;
    String catchment;

    int studentamount;
    //constructors
    School(){
     name = "Sample School";
     catchment = "Sample Area";
     studentamount = 100;
    }
    School(String n, String c, int s){
        this.name = n;
        this.catchment = c;
        this.studentamount = s;
    }
    //getters and setters
    public String getName(){
        return (name);
    }
    public void setName(String s){
        name = s;
    }
    public String getCatchment(){
        return (catchment);
    }
    public void setCatchment(String s){
        catchment = s;
    }
    public void setStudentAmount(int s) { studentamount = s;}
    public int getStudentAmount() { return (studentamount);}
    //Method adds a teacher to school object
    /*
    requires: != null ArrayList, != null 3 String
    modifies: n
    effects: creates new Teacher from constructor inside of n with desired fields
     */
    public static void addTeacher(ArrayList<Teacher> n, String pro, String sur, String subject){
        Teacher fella = new Teacher(pro,sur,subject);
        n.add(fella);
    }
    // addStudent
    /*
    requires: non empty ArrayList, != null 3 String
    modifies: n
    effects: creates new Student from constructor inside of n with desired fields
     */
    public static void addStudent(ArrayList<Student> n, String pro, String sur, int grade){
        if(grade > 12){
            System.out.println("bad input");
        } else {
            Student fella = new Student(pro, sur, grade);
            n.add(fella);
        }
    }
    /*
    requires: non empty ArrayList
    modifies: non
    effects: reads all Teachers inside n and prints them individually to console
     */
    public void readTeacher(ArrayList<Teacher> n ){
        for(int i = 0; i < n.size(); i++){
            System.out.print("Name: "+ n.get(i).getName());
            System.out.println(" Subject: " +n.get(i).getSub());


        }
        System.out.println("_______________________________");
    }
    /*
     requires: non empty ArrayList
     modifies: non
     effects: reads all Teachers inside n and prints them individually to console
      */
    public void readStudent(ArrayList<Student> n ){
        for(int i = 0; i < n.size(); i++){
            System.out.print("Name: "+ n.get(i).getName());
            System.out.print(" Grade: " +n.get(i).getGrade());
            System.out.println(" Student Number: "+n.get(i).getNumber());

        }
        System.out.println("_______________________________");
    }
    /*
    requires: nonempty ArrayList
    modifies: n
    effects: last element in n is removed
     */
    public static void delTeacher(ArrayList<Teacher> n){
        int m = n.size();
        n.remove(m-1);
    }
    /*
    requires: nonempty ArrayList
    modifies: n
    effects: last element in n is removed
    */
    public static void delStudent(ArrayList<Student> n){
        int m = n.size();
        n.remove(m-1);
    }
}
