//
//  Tests0001.cpp
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//  Copyright (c) 2014 fiii. All rights reserved.
//

#include "Tests0001.h"

#include "Randomizer.h"


void printSolutions(int size,double* solutions){
    
    if(size>1)
        cout << "There are "<< size << " solutions "<< "\n";
    else if(size==1)
        cout << "There is "<< size << " solutions "<< "\n";
    else if(size==0)
        cout << "There are no solutions "<< "\n";

    for(int i=0;i<size;i++){
        cout << "" << solutions[i]<< " ";
    }
    cout << "\n";
}


void test0001(){
    
    double solutions[3];
    for(int i=0;i<3;i++){
        solutions[i]=0;
    }
    
    int solutionsCount = ThirdOrderEquation::solve(solutions,1,0,0,0);
    printSolutions(solutionsCount,solutions);
    
    solutionsCount = ThirdOrderEquation::solve(solutions,1,-1,0,0);
    printSolutions(solutionsCount,solutions);
    
    solutionsCount = ThirdOrderEquation::solve(solutions,1,1,1,0);
    printSolutions(solutionsCount,solutions);
    
    solutionsCount = ThirdOrderEquation::solve(solutions,1,1,1,1);
    printSolutions(solutionsCount,solutions);
    
    cout << "Running Randomizer" << "\n";
    
    solutionsCount = Randomizer::randomNumbers(solutions, 3);
    printSolutions(solutionsCount,solutions);
}
