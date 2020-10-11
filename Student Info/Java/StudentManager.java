public class StudentManager{

    public StudentManager(){}
    
    public void simulate(){
        StudentDossier sd = new StudentDossier();
        sd.addStudent(new Student("Jonathan", 26, 2.0f, "Senior"));
        sd.addStudent(new Student("Joseph", 24, 1.5f, "Junior"));
        sd.addStudent(new Student("Jotaro", 22, 1.0f, "Sophomore"));
        sd.addStudent(new Student("Josuke", 20, 1.25f, "Freshman"));

        sd.list();
    }


}