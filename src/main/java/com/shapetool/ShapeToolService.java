package com.shapetool;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://example.com/shapetool")
public class ShapeToolService {

    @WebMethod
    public double circleArea(double radius) {
        if (radius < 0) throw new RuntimeException("Invalid radius");
        return Math.PI * radius * radius;
    }

    @WebMethod
    public double squareArea(double side) {
        if (side < 0) throw new RuntimeException("Invalid side");
        return side * side;
    }

    @WebMethod
    public double rectangleArea(double length, double width) {
        if (length < 0 || width < 0) throw new RuntimeException("Invalid input");
        return length * width;
    }

    @WebMethod
    public double parallelogramArea(double base, double height) {
        if (base < 0 || height < 0) throw new RuntimeException("Invalid input");
        return base * height;
    }

    @WebMethod
    public double triangleArea(double base, double height) {
        if (base < 0 || height < 0) throw new RuntimeException("Invalid input");
        return 0.5 * base * height;
    }
}