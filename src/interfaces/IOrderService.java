package interfaces;

import models.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAllOrders();
    Order getOrderById(int id);
    void addOrder(Order order);
    void deleteOrder(int id);
}
