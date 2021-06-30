public class HelloMain {
    public static void main(String[] args) {
        Student studentA = new Student("Isuri", "Mendis", 3.2, 2020, "Bioinformatics");
        Student studentB = new Student("Pathum", "Wijethunge",3.0, 2020, "computer science");
        int newGraduationExpectedYearA = studentA.incrementExpectedGraduationYear();
        int newGraduationExpectedYearB = studentB.incrementExpectedGraduationYear();
        System.out.println(studentA.firstName +" graduate in "+newGraduationExpectedYearA);
        System.out.println(studentB.firstName +" graduate in "+newGraduationExpectedYearB);

    }
}
