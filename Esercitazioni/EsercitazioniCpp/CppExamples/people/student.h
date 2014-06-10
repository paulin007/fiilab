#ifndef STUDENT_H
#define STUDENT_H

#include "person.h"

namespace people{

class Student: public Person{
    int id;
public:
    Student(string name,string surname,int id);
    int getId();
};

}

#endif // STUDENT_H
