//
//  Randomizer.cpp
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#include "Randomizer.h"



int Randomizer::randomNumbers(double* numbers,int max){
    int randomCount=rand();
    std::cout << "\n rcount" << randomCount<< "\n";
    if(randomCount>max)
        randomCount=max;
    for (int i=0; i<randomCount;i++) {
        int random=rand();
        numbers[i]=random;
        //std::cout << "" << i << " " << numbers[i] << " " << random;
    }
    return randomCount;
}