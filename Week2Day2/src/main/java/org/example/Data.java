package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Data {

    @Autowired
    @Qualifier("1")
    private Student student;

    public void show() {
        System.out.print("YES");
    }
}
