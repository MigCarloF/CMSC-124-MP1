var studentList = [];
studentDossier();

function studentDossier(){
    run();
}

function run(){
    let answer = 0;
    let quit = false;
    while((isNaN(answer) || answer >= 1 || answer <= 4) && quit == false){
        answer = 0;
        answer = parseInt(prompt("Insert Choice"));
        quit = choiceHandler(answer);
    }
}

// Returns true if 4 is input
// Else returns false
function choiceHandler(answer){
    switch(answer){
        case 1:
            addStudent();
            break;
        case 2:
            removeStudent();
            break;
        case 3:
            listAllStudents();
            break;
        case 4:
            return true;
        default:
    }
    return false;
}

function addStudent(){
    let student = {
        name : prompt("New student!\nInput name: "),
        age : getAge(),
        gpa : getGpa(),
        gradeLevel : getGradeLevel()
    };
    studentList.push(student);
}

function removeStudent(){
    let found = false;
    let name = prompt("Remove Student!\nInput name of student to remove: ");
    for(let i = 0; i < studentList.length; i++){
        if(name == studentList[i].name){
            studentList.splice(i, 1);
            found = true;
        }
    }
    if(!found){
        console.log("No such student exists!");
    } else {
        console.log(name + " was removed");
    }
}

function listAllStudents(){
    let list = 'Student List:\n';
    for(let student of studentList){
        list += `Name: ${student.name}\nAge: ${student.age}\nGPA: ${student.gpa}
                \nGrade Level: ${student.gradeLevel}\n\n`;
    }
    console.log(list);
}

/**
 * loops prompt until user inputs int value
 */
function getAge(){
    let age;
    while(isNaN(age) || !age){
        age = parseInt(prompt("Input age: "));
    }
    return age;
}


/**
 * loops prompt until user inputs float value
 */
function getGpa(){
    let gpa;
    while(isNaN(gpa) || !gpa){
        gpa = parseFloat(prompt("Input GPA: "));
    }
    return gpa;
}

/**
 * returns string of 1 of 4 grade levels
 */
function getGradeLevel(){
    let gradeLevel;
    while(!gradeLevel || isNaN(gradeLevel) || (gradeLevel < 1 && gradeLevel > 4)){
        gradeLevel = parseInt(prompt("Input Year Level:\n1)Freshman\n2)Sophomore\n3)Junior\n4)Senior"));
    }
    switch(gradeLevel){
        case 1:
            return 'Freshman';
        case 2:
            return 'Sophomore';
        case 3:
            return 'Junior';
        case 4:
            return 'Senior';
        default:
        prompt("You're not supposed to be in here");
            return 'Error in function getGradeLevel (Input beyond 1 - 4 bounds)';
    }
}