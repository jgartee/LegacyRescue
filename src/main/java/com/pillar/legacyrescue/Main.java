package com.pillar.legacyrescue;

import com.pillar.legacyrescue.model.Order;
import com.pillar.legacyrescue.model.PerItemProduct;
import com.pillar.legacyrescue.model.PerPoundProduct;

public class Main {

    public static void main(String[] args) {
        Order order = Order.createOrder().forCustomer("John Doe");
        order.addProduct(new PerPoundProduct("Pulled Pork", 0.5, 6.99));
        order.addProduct(new PerItemProduct("Coke", 2, 3.00));

        System.out.println(order.getOrderSummary());
    }
}

