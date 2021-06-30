//Instance variables and instance methods
public class Student {
   String firstName;
   String lastName;
   Double gpa;
   int expectedYearToGraduate;
   String declaredMajor;
    public Student(String firstName,String lastName, Double gpa, int expectedYearToGraduate, String declaredMajor ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.declaredMajor = declaredMajor;

    }
    public int incrementExpectedGraduationYear(){
        this.expectedYearToGraduate +=1;
        return expectedYearToGraduate;
    }

}
