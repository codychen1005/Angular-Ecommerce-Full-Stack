package com.weihong.ecommerce.dto;

import com.weihong.ecommerce.entity.Address;
import com.weihong.ecommerce.entity.Customer;
import com.weihong.ecommerce.entity.Order;
import com.weihong.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
