//
//  SecondOrderEquation.cpp
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#include "SecondOrderEquation.h"


SecondOrderEquation::SecondOrderEquation(double a,double b,double c){
    this->a=a;
    this->b=b;
    this->c=c;
}

Point2D SecondOrderEquation::eval(double x){
    return Point2D(x,getFunction(x));
}


/**
 eval f(x)
 */
double SecondOrderEquation::getFunction(double x){
    return (a*x+b)*x+c;
}

/**
 eval the derivative of f(x)
 */
double SecondOrderEquation::getDerivative(double x){
    return (2*a*x+b);
}

Point2D SecondOrderEquation::getMinMax(){
    double solution[1];
    solution[0]=0;
    int results = FirstOrderEquation::solve(solution,2*a,b);
    if(results==1){
        return eval(solution[0]);
    }else{
        return Point2D(0,0);
    }
}

/** true if
 */
bool SecondOrderEquation::isPositive(){
    return a==0;
}


/* Find x satisfying a x^2 + b x + c = 0
 */
int SecondOrderEquation::solve(double* results){
    if(a!=0){
        double delta=b*b-4*a*c;
        std::cout << "" <<  delta;
        if(delta>=0){
            delta=sqrt(delta);
            results[0]=(-b+delta)/(2*a);
            results[1]=(-b-delta)/(2*a);
            return 2;
        }
        return 0;
    }else{
        return FirstOrderEquation::solve(results,b,c);
    }
}

/* Find x sotisfying a x^2 + b x + c = 0
 */
int SecondOrderEquation::solve(double* results,double a,double b,double c){
    
    SecondOrderEquation* equation=new SecondOrderEquation(a,b,c);
    
    int solution = equation->solve(results);
    
    delete equation;
    
    return solution;
}