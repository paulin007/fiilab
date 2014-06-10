#ifndef DATE_H
#define DATE_H

class Date{

//private:
    int day;
    int month;
    int year;

public:
    Date();

    Date(int day,int month,int year);

    void setDay(int day);

    int getDay();

    void setMonth(int month);

    int getMonth();

    void setYear(int year);

    int getYear();
};

#endif // DATE_H
