package com.shapetool;

import javax.xml.ws.Endpoint;

public class ShapeToolPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/shapetool", new ShapeToolService());
        System.out.println("SOAP Service Running...");
    }
}