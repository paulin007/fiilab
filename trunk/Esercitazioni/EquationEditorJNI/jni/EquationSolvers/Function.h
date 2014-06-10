//
//  Function.h
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#ifndef JNIExamples_Function_h
#define JNIExamples_Function_h

/**
 A function y=f(x)
 */
class Function{

public:
    
    /**
        eval f(x)
     */
    virtual double getFunction(double x)=0;
    
    /**
        eval the derivative of f(x)
     */
    virtual double getDerivative(double x)=0;

};


#endif
