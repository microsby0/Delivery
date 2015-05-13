package com.delivery.model;

public class Order{

    private int orderId;
    private int merchantId;
    private float price;

    public int getOrderId(){
        return orderId;
    }

    public void setOrderId(final int orderId){
        this.orderId = orderId;
    }

    public int getMerchantId(){
        return merchantId;
    }

    public void setMerchantId(final int merchantId){
        this.merchantId = merchantId;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(final float price){
        this.price = price;
    }
}
