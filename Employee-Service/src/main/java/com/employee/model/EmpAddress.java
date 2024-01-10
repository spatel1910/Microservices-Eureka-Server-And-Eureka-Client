package com.employee.model;

import org.springframework.stereotype.Component;

@Component
public class EmpAddress {
    private int id;
    private String city;
    private String state;
    private int emp_id;

    public EmpAddress(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public EmpAddress(int id, String city, String state, int emp_id) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.emp_id = emp_id;
    }
}
