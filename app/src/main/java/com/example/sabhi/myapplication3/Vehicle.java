package com.example.sabhi.myapplication3;

/**
 * Created by Sabhi on 28/10/2016.
 */

public class Vehicle {
    private String make;
    private int year;
    private String message;
    public static int counter = 0;
    public Vehicle() {
        this.make = "Volvo";
        this.year = 2012;
        this.message = "This is the default message.";
    }
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
        this.message = "Your car is a " + make + " built in " + year + ".";
        count();
    }

    public Vehicle(String make) {
        this();
        this.make = make;
        message = "You didn't type in year value.";
        count();
    }
    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        return message;
    }

    private void count(){
        this.counter++;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    interface Controllable {
        void control();
    }
}
