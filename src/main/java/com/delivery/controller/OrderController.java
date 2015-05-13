package com.delivery.controller;

import com.delivery.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Michael on 5/13/2015.
 */
@Controller
public class OrderController{

    //map to store the orders, key is userId
    private HashMap<Integer, ArrayList<Order>> orders = new HashMap<Integer, ArrayList<Order>>();
    int orderCount =0;

    @RequestMapping(value = "/rest/orders", method = RequestMethod.POST)
    public @ResponseBody Order storeOrder(@RequestParam int userId, @RequestParam int merchantId, @RequestParam float price){
        Order order = new Order();
        order.setPrice(price);
        order.setOrderId(++orderCount); //used number of orders in map as unique Id
        order.setMerchantId(merchantId);
        if(orders.get(userId) == null){
            orders.put(userId,new ArrayList<Order>());
        }
        orders.get(userId).add(order);
        return order;
    }

    @RequestMapping(value = "/rest/orders/users/{userId}",method = RequestMethod.GET)
    public
    @ResponseBody
    ArrayList<Order> retrieveOrder(@PathVariable int userId){
        if(orders.get(userId) == null){
            orders.put(userId,new ArrayList<Order>());
            return null;
        }
        return orders.get(userId);
    }

}
