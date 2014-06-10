//
//  ThirdOrderEquation.h
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#ifndef __JNIExamples__ThirdOrderEquation__
#define __JNIExamples__ThirdOrderEquation__

#include <iostream>

#include "FirstOrderEquation.h"
#include "SecondOrderEquation.h"
#include "Point.h"
#include "NewtonSolver.h"

#define MAX_ERROR 0.0000000001

/**
 Class for the equation a x^3 + b x^2 + c x + d = 0
 */
class ThirdOrderEquation:public Solver,public Function{
    
    float a,b,c,d;
    
public:
    
    ThirdOrderEquation(double a,double b,double c,double d);
    
    /**
     eval f(x)
     */
    double getFunction(double x);
    
    /**
     eval the derivative of f(x)
     */
    double getDerivative(double x);
    
    /* Find x satisfying a x^2 + b x + c = 0
     */
    int solve(double* results);
    
    /* Find x sotisfying a x^2 + b x + c = 0
     */
    static int solve(double* results,double a,double b,double c,double d);
    
};

#endif /* defined(__JNIExamples__ThirdOrderEquation__) */
