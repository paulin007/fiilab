#include "example02_Randomizer.h"

#include "math.h"
#include "Randomizer.h"

#define NOT_EXACTLY_RANDOM

/*
 * Class:     example02_Randomizer
 * Method:    randomNumbers
 * Signature: ([F)I
 */
JNIEXPORT jint JNICALL Java_example02_Randomizer_randomNumbers
  (JNIEnv* env, jobject, jfloatArray array){


    jfloat* flt1 = env->GetFloatArrayElements( array,0);

    int size = env->GetArrayLength(array);

#ifdef NOT_EXACTLY_RANDOM
    for(int i=0;i<size;i++){
        flt1[i]=sqrt(i);
    }
#else
    double* d=new double[size];
    Randomizer::randomNumbers(d,size);
    for(int i=0;i<size;i++){
        flt1[i]=d[i];
    }
    delete d;
#endif

    env->ReleaseFloatArrayElements(array, flt1, 0);

    return size;
}
