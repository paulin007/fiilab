//
//  Point.h
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#ifndef __JNIExamples__Point__
#define __JNIExamples__Point__

#include <iostream>

class Point2D{

    double x,y;
    
public:
    
    Point2D(double x=0,double y=0);

    double getX();
    
    double getY();
};
    

#endif /* defined(__JNIExamples__Point__) */
