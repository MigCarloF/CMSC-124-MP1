#include<stdio.h>
#include"student.h"


void handler();
struct student* create_students(int);
struct student create_student();
void list_students(struct student*, int);

int get_int();
float get_float();
char* get_str();

void handler(){
    printf("Welcome to student information storage!\n");
    printf("How many students will you store?");
    int student_size = get_int();
    struct student *students = create_students(student_size);

    list_students(students, student_size);
}

void list_students(struct student *students, int student_size){
    for(int i = 0; i < student_size; i++){
        struct student *stud = &students[i];
        printf("Name: %s\n", (*stud).name);
        printf("Age: %d\n", (*stud).age);
        printf("GPA: %f\n", (*stud).gpa);
        printf("Grade Level: %s\n\n", (*stud).grade_level);
    }
}

struct student* create_students(int size){
    struct student *students = (struct student*)malloc(size * sizeof(struct student));

    for(int i = 0; i < size; i++){
        students[i] = create_student();
    }
    return students;
}

    /**
     * void
     * returns created student struct
     */

struct student create_student(){
    struct student new_student;

    printf("New Student!\n");
    // Get Name
    printf("Input Name: ");
    new_student.name = get_str();

    // Get Age
    printf("Input Age: ");
    new_student.age = get_int();

    // Get Gpa
    printf("Input GPA:");
    new_student.gpa = get_float();

    // Get Grade Level
    printf("Input Grade Level: ");
    new_student.grade_level = get_str();
    printf("\n");

    return new_student;
}

int get_int(){
    int n;
    scanf("%d", &n);
    return n;
}

char* get_str(){
    char *string;
    string = (char*)malloc(256 * sizeof(char));
    scanf("%255s", string);
    return string;
}

float get_float(){
    float f;
    scanf("%f", &f);
    return f;
}
