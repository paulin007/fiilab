//
//  FirstOrderEquation.h
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#ifndef __JNIExamples__FirstOrderEquation__
#define __JNIExamples__FirstOrderEquation__

#include <iostream>

#include "Solver.h"
#include "Function.h"

/**
  Class for the equation a x + b = 0
 */
class FirstOrderEquation:public Solver,public Function{

    double a,b;
    
public:
    FirstOrderEquation(double a,double b);
    
    /**
     eval f(x)
     */
    double getFunction(double x);
    
    /**
     eval the derivative of f(x)
     */
    double getDerivative(double x);
    
    
    /* Find x satisfying a x + b = 0
     */
    int solve(double* results);
    
    /* Find x sotisfying a x + b = 0
     */
    static int solve(double* results,double a,double b);
};


#endif /* defined(__JNIExamples__FirstOrderEquation__) */
