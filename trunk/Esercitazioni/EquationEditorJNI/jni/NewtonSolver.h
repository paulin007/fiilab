//
//  NewtonSolver.h
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#ifndef __JNIExamples__NewtonSolver__
#define __JNIExamples__NewtonSolver__

#include <iostream>
#include "Function.h"

#define MAX_ITERATION 30

class NewtonSolver{

public:

    /**
        Find an approximation for one of the solutions of function(x) = 0,
        starting from an unprecise solution x0, trying to guarantee a maximum Error maxError.
        Based on the classic Newton Iteration
     */
    static double solve(Function* function,double x0,double maxError);

};

#endif /* defined(__JNIExamples__NewtonSolver__) */
