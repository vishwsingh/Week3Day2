package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Phone implements People
{

    public Phone() {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "ph=" + ph +
                '}';
    }

    public List<String> getPh() {
        return ph;
    }

    public void setPh(List<String> ph) {
        this.ph = ph;
    }

    public Phone(List<String> ph) {
        this.ph = ph;
    }

    @Autowired
    private List<String> ph;

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Autowired
    private String mob;

    @Override
    public void show() {
        System.out.println("Phone numbers");
        for(int i = 0;i<ph.size();i++) {
            System.out.println(ph.get(i));
        }
    }
}