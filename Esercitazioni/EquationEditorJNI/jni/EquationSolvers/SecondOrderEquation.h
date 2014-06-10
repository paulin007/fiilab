//
//  SecondOrderEquation.h
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#ifndef __JNIExamples__SecondOrderEquation__
#define __JNIExamples__SecondOrderEquation__

#include <iostream>
#include <math.h>
#include "FirstOrderEquation.h"
#include "Point.h"


/**
 Class for the equation a x^2 + b x + c = 0
 */
class SecondOrderEquation:public Solver,public Function{
    
    double a,b,c;
    
public:
    SecondOrderEquation(double a,double b,double c);
    
    Point2D eval(double x);
    
    
    /**
     eval f(x)
     */
    double getFunction(double x);
    
    /**
     eval the derivative of f(x)
     */
    double getDerivative(double x);
    
    Point2D getMinMax();
    
    /** true if
     */
    bool isPositive();
    
    
    /* Find x satisfying a x^2 + b x + c = 0
     */
    int solve(double* results);
    
    /* Find x sotisfying a x^2 + b x + c = 0
     */
    static int solve(double* results,double a,double b,double c);
    
};

#endif /* defined(__JNIExamples__SecondOrderEquation__) */
