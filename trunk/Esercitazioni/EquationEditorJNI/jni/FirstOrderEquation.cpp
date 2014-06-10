//
//  FirstOrderEquation.cpp
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#include "FirstOrderEquation.h"



FirstOrderEquation::FirstOrderEquation(double a,double b){
    this->a=a;
    this->b=b;
}


/**
 eval f(x)
 */
double FirstOrderEquation::getFunction(double x){
    return 2*a+b;
}

/**
 eval the derivative of f(x)
 */
double FirstOrderEquation::getDerivative(double x){
    return 2*a;
}


/* Find x satisfying a x + b = 0
 */
int FirstOrderEquation::solve(double* results){
    if(a!=0){
        results[0]=-b/a;
        return 1;
    }else{
        return 0;
    }
}

/* Find x sotisfying a x + b = 0
 */
int FirstOrderEquation::solve(double* results,double a,double b){
    
    FirstOrderEquation* equation=new FirstOrderEquation(a,b);
    
    int solution = equation->solve(results);
    
    delete equation;
    
    return solution;
}