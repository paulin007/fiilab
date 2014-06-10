//
//  ThirdOrderEquation.cpp
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#include "ThirdOrderEquation.h"




ThirdOrderEquation::ThirdOrderEquation(double a,double b,double c,double d){
    this->a=a;
    this->b=b;
    this->c=c;
    this->d=d;
}

/**
 eval f(x)
 */
double ThirdOrderEquation::getFunction(double x){
    return ((a*x+b)*x+c)*x+d;
}

/**
 eval the derivative of f(x)
 */
double ThirdOrderEquation::getDerivative(double x){
    return ((3*a*x+2*b)*x+c);
}

/* Find x satisfying a x^2 + b x + c = 0
 */
int ThirdOrderEquation::solve(double* results){
    if(a!=0){
        double minMaxPoints[2];
        
        SecondOrderEquation derivative(3*a,2*b,c);
        
        int minMaxCount = derivative.solve(minMaxPoints,3*a,2*b,c);
        
        double flex;
        FirstOrderEquation::solve(&flex,6*a,2*b);
        
        if(minMaxCount==0){
            
            //Find the flex
            
            results[0]=NewtonSolver::solve(this, flex, MAX_ERROR);
            return 1;
            
        }else{
            
            Point2D firtsMinMax=derivative.eval(minMaxPoints[0]);
            Point2D secondMinMax=derivative.eval(minMaxPoints[1]);
            
            //std::cout << "minMax " << firtsMinMax.getX() << " " << secondMinMax.getX();
            
            if(firtsMinMax.getY()<0){
                if(secondMinMax.getY()<0){//both on the negative side, only 1 solution
                    
                    if(a>0){//positive cubic
                        //start from a point after the secondMinMax
                        results[0]=NewtonSolver::solve(this, secondMinMax.getX()+1, MAX_ERROR);
                        
                    }else{
                        //start from a point before the firstMinMax
                        results[0]=NewtonSolver::solve(this, firtsMinMax.getX()-1, MAX_ERROR);
                        
                    }
                    return 1;
                    
                }
            }else{
                if(secondMinMax.getY()>0){//both on the positive side, only 1 solution
                    
                    if(a>0){//positive cubic
                        //start from a point before the firstMinMax
                        results[0]=NewtonSolver::solve(this, firtsMinMax.getX()-1, MAX_ERROR);
                    }else{
                        //start from a point after the secondMinMax
                        results[0]=NewtonSolver::solve(this, secondMinMax.getX()+1, MAX_ERROR);
                    }
                    return 1;
                    
                }
            }
            
            //in this case, we have 3 solutions separated by minMaxPositions
            //we should have always correct convergence for all of the three starting positions
            results[0]=NewtonSolver::solve(this, firtsMinMax.getX()-1, MAX_ERROR);
            results[1]=NewtonSolver::solve(this, flex, MAX_ERROR);
            results[2]=NewtonSolver::solve(this, secondMinMax.getX()+1, MAX_ERROR);
            
            return 3;
        }
        
    }else{
        return SecondOrderEquation::solve(results,b,c,d);
    }
    return 0;
}

/* Find x sotisfying a x^2 + b x + c = 0
 */
int ThirdOrderEquation::solve(double* results,double a,double b,double c,double d){
    
    ThirdOrderEquation* equation=new ThirdOrderEquation(a,b,c,d);
    
    int solution = equation->solve(results);
    
    delete equation;
    
    return solution;
}