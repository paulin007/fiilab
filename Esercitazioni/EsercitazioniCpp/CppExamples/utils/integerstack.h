#ifndef INTEGERSTACK_H
#define INTEGERSTACK_H

class IntegerStack{
//private:
    int* stack;
    int counter;
    int dimension;

public:
    IntegerStack(int dimension);

    void push(int value);

    int pop();
};

#endif // INTEGERSTACK_H
