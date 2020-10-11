import java.util.ArrayList;

public class StudentDossier{
    private ArrayList<Student> studentList;

    public StudentDossier(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    
    public void removeStudent(Student student){
        studentList.remove(student);
    }

    public void removeStudent(int index){
        studentList.remove(index);
    }

    public Student getStudent(int index){
        return studentList.get(index);
    }

    public void list(){
        System.out.println("Index \tName\tAge\tGPA\tGrade Level");
        System.out.println();
        for(int i = 0; i < studentList.size(); i++){
            Student student = studentList.get(i);
            System.out.println(i + "\t" + student.getName() + "\t" + student.getAge() +
                                "\t" + student.getGpa() + "\t" + student.getGradeLevel());
        }
        System.out.println();
    }

    public Student getStudent(String name){
        for(Student student:studentList){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
}