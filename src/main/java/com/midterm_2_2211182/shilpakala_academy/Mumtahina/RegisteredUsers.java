package com.example.shilpakala;

public class RegisteredUsers {
    private String name, number, address;

    public String print() {
        return "Registration Successful for : "+ name + " with " + number ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RegisteredUsers(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }
}
