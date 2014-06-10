#include "eqsolver_AlgebricCubicEquationSolver.h"

#include "ThirdOrderEquation.h"

JNIEXPORT jint JNICALL Java_eqsolver_AlgebricCubicEquationSolver_solve
  (JNIEnv * env, jobject, jdoubleArray doubleArray, jdouble a, jdouble b, jdouble c, jdouble d){
  	  
    jdouble* flt1 = env->GetDoubleArrayElements( doubleArray,0);

    int size = env->GetArrayLength(doubleArray);	  
  	double* dArray=new double[size];
  	
  	ThirdOrderEquation::solve(dArray,a,b,c,d);

        for(int i=0;i<size;i++){
            flt1[i]=dArray[i];
        }
        delete dArray;
  	  
    env->ReleaseDoubleArrayElements(doubleArray, flt1, 0);
  	
  	return size;
  }
