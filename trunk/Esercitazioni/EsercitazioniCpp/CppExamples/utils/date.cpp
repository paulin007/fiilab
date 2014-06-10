#include "date.h"

Date::Date(){
    this->day=1;
    this->month=1;
    this->year=2014;
}

Date::Date(int day,int month,int year){
    this->day=day;
    this->month=month;
    this->year=year;
}


void Date::setDay(int day){
    int maxDay=31;
    switch(this->month){
        case 4: case 6: case 9: case 11 :
            maxDay=30;
            break;
        case 2:
            maxDay=28;
    }
    if(day<1)
        day=1;
    if(day>maxDay)
        day=maxDay;
    this->day=day;
}

int Date::getDay(){
    return this->day;
}

void Date::setMonth(int month){
    if(month<1)
        month=1;
    if(month>12)
        month=12;
    this->month=month;
}

int Date::getMonth(){
    return this->month;
}

void Date::setYear(int year){
    this->year=year;
}

int Date::getYear(){
    return year;
}
