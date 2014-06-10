#include "integerstack.h"


IntegerStack::IntegerStack(int dimension){
    this->stack=new int[dimension];
    this->dimension=dimension;
    this->counter=0;
}

void IntegerStack::push(int value){
    if(counter<dimension){
        this->stack[this->counter]=value;
        this->counter++;
    }
}

int IntegerStack::pop(){
    if(counter>0){
        this->counter--;
        return this->stack[this->counter];
    }
    return 0;
}
