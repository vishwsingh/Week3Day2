package org.example;

public class Address implements People
{

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    private String city;
    private String state;
    private String country;
    private String zipcode;

    @Override
    public void show() {
        System.out.println("Address " + city + " " + state + " " + country + " " + zipcode);
    }

    @Override
    public String toString()
    {
        return "Address: "
                + city + " " + state
                + " " + country + "  " + zipcode;
    }
}