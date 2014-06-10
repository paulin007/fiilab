#ifndef PERSON_H
#define PERSON_H

#include "utils/date.h"
#include <string>

using namespace std;

namespace people{

    class Person{
        Date* birth;
        string name;
        string surname;
    public:
        Person(string name,string surname);
        ~Person();
        virtual string getName();
        string getSurname();
        Date* getBirth();
    };

}

#endif // PERSON_H
