package services;

import models.Order;
import models.User;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders;

    public OrderService() {
        this.orders = new ArrayList<>();
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(int id) {
        return orders.stream().filter(order -> order.getId() == id).findFirst().orElse(null);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void deleteOrder(int id) {
        orders.removeIf(order -> order.getId() == id);
    }
}
