#include "student.h"


people::Student::Student(string name,string surname,int id):
    Person(name,surname){
    this->id=id;
}

int people::Student::getId(){
    return id;
}
