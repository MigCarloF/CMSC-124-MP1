public class Student{
    private String name;
    private int age;
    private float gpa;
    private String gradeLevel;

    public Student(String name, int age, float gpa, String gradeLevel){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
    }

    // Getter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public float getGpa(){
        return this.gpa;
    }
    public String getGradeLevel(){
        return this.gradeLevel;
    }

}