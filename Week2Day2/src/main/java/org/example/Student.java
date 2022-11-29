package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Student implements People
{
    @Autowired
    public Student stu;
    public void show() {
        System.out.println("Student Id is.." + id);
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAdd() {
        return add;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    private int id;
    private String name;
  //  private List<Phone> ph;
    private Address add;


}