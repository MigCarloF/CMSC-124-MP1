import Student

studentList = []

def run():
    quit = False
    while quit == False:
        displayOptions()
        quit = handler()
    

def displayOptions():
    print("Welcome to the student dossier!")
    print("What would you like to do?")
    print("1) Add Student")
    print("2) Remove Student")
    print("3) List all students")
    print("4) Quit")
    
def handler():
    option = int(input("Select option: "))
    print()
    if option == 1:
        addStudent()
    elif option == 2:
        removeStudent()
    elif option == 3:
        listStudents()
    elif option == 4:
        return True
    print()
    return False
    
def listStudents():
    print("List of students:")
    print("Number of students: {}\n".format(len(studentList)))
    if len(studentList)== 0:
        print("No students yet!")
    else:    
        for student in studentList:
            print("Name: {}".format(student.name))
            print("Age: {}".format(student.age))
            print("GPA: {}".format(student.gpa))
            print("Grade Level: {}".format(student.gradeLevel))
    
def addStudent():
    studentList.append(createStudent())
    print("Student Added!")
    
def removeStudent():
    if len(studentList) == 0:
        print("No students yet!")
        return
    
    found = False
    name = input("Input name of student to remove: ")
    for student in studentList:
        if student.name == name:
            studentList.remove(student)
            print("Student Removed!")
            found = True
    
    if found == False:
        print("Student not found! Remove process cancelled")
        
        
def createStudent():
    print("New Student!")
    name = input("Enter name: ")
    age = int(input("Enter age: "))
    gpa = float(input("Enter gpa: "))
    gradeLevel = input("Enter Grade Level: ")
    return Student.Student(name, age, gpa, gradeLevel)