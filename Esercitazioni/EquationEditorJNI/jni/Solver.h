//
//  Solver.h
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#ifndef JNIExamples_Solver_h
#define JNIExamples_Solver_h


class Solver {

public:
    /**
        Find all the solutions for an equation
     */
    virtual int solve(double* results)=0;
};

#endif
