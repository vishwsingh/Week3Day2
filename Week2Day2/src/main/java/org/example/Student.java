package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Student implements People
{
    @Autowired
    public Student stu;
    public void show() {
        System.out.println("Student Id is.." + id);


        System.out.println("Name is " + name);

        System.out.println("Address" );

        System.out.println(this.ph);
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
    private List<Phone> ph;
    private Address add;

    @Required
    public void setMyList(List<Phone> myList) {
        this.ph = myList;
    }


}