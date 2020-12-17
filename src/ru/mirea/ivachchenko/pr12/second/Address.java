package ru.mirea.ivachchenko.pr12.second;

import java.util.StringTokenizer;

public class Address {

    private String str;
    private String country;
    private String region;
    private String city;
    private String street;

    Address(String str){
        this.str = str;
    }

    public void setAddress(String str){
        String[] splitAddress = str.split(",");
        if (splitAddress.length >= 4){
            country = splitAddress[0];
            System.out.println(country);
            region = splitAddress[1];
            System.out.println(region);
            city = splitAddress[2];
            System.out.println(city);
            street = splitAddress[3];
            System.out.println(street + "\n");
        }
    }

    public void setAddressTokenizer(String str) {
        StringTokenizer st = new StringTokenizer(str, ",.;-");
        if (st.hasMoreTokens()) {
            country = st.nextToken();
            System.out.println(country);
        }
        if (st.hasMoreTokens()){
            region = st.nextToken();
            System.out.println(region);
    }
        if (st.hasMoreTokens()) {
            city = st.nextToken();
            System.out.println(city);
        }
        if (st.hasMoreTokens()) {
            street = st.nextToken();
            System.out.println(street + "\n");
        }
    }
}
