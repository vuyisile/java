package com.app;

public class Location {
    int id;
    String address_line1;
    String city_or_town;
    int zip_code;
    int provider_id;
    String address_line2;


    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }


    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getCity_or_town() {
        return city_or_town;
    }

    public void setCity_or_town(String city_or_town) {
        this.city_or_town = city_or_town;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public int getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
