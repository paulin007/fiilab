#include <stdio.h>
#include <vector>

#include "utils/date.h"
#include "people/person.h"
#include "people/student.h"

using namespace std;
using namespace people;

void test01(){
    Date* date1=new Date(6,5,2014);

    Date date2(6,5,2014);

    Date date3;

    delete date1;

    printf("Ciao Mondo");
}

void test04(){

    vector<Person*> people;

    people.push_back(new Person("Paolo","Rossi"));
    people.push_back(new Person("Giuseppe","Verdi"));
    people.push_back(new Student("Mario","Bianchi",100200));

    for(int i=0;i<people.size();i++){
        Person* p=people[i];//Overriding Operatori
        //Person* p=people.at(i);
        printf("%s %s \n",p->getName().c_str(),p->getSurname().c_str());
    }
}

int main(int argc, char *argv[]){

    //test01();
    test04();

    return 0;
}
