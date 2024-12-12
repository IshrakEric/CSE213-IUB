package com.example.shilpakala;

public class BookedCustomer {

    private String name, desig,number;
    public BookedCustomer(String name, String desig, String number) {
        this.name = name;
        this.desig = desig;
        this.number = number;
    }
    public String print() {

        return "Booked for : "+ name + " " + desig + " " + number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
