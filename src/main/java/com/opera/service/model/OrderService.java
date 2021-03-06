package com.opera.service.model;

import com.opera.model.Order;
import com.opera.model.ShoppingCart;
import com.opera.model.User;
import java.util.List;

public interface OrderService {
    void completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
