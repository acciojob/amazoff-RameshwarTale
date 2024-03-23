package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM

        this.id = id;

        String parts[] = deliveryTime.split(":");

        int HH = Integer.parseInt(parts[0]);
        int MM = Integer.parseInt(parts[1]);

        this.deliveryTime = HH*60+MM;  // Convert to Minutes

    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
