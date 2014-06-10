//
//  Point.cpp
//  JNIExamples
//
//  Created by Alessandro Martinelli on 20/05/14.
//

#include "Point.h"


Point2D::Point2D(double x,double y){
    this->x=x;
    this->y=y;
}

double Point2D::getX(){
    return x;
}

double Point2D::getY(){
    return y;
}