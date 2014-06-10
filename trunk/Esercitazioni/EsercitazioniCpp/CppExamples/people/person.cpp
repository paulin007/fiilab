#include "person.h"


people::Person::Person(string name,string surname){
    this->name=name;
    this->surname=surname;
    this->birth=new Date();
}

people::Person::~Person(){
    delete this->birth;
}

string people::Person::getName(){
    return this->name;
}

string people::Person::getSurname(){
    return this->surname;
}

Date* people::Person::getBirth(){
    return this->birth;
}
