//
//  NewtonSolver.cpp
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#include "NewtonSolver.h"

double NewtonSolver::solve(Function* function,double x0,double maxError){
    
    double value=function->getFunction(x0);
    
    //std::cout << "" << x0 << " " << value;
    
    //std::cout << "" << value;
    
    int index=0;
    
    while(value*value>maxError*maxError && index < MAX_ITERATION){//unsigned comparison
        
        x0= x0 - value/function->getDerivative(x0);
        
        //std::cout << "     " << x0 << " " << value<< "\n";
        
        value=function->getFunction(x0);
        
        index++;
    }
    
    return x0;
}