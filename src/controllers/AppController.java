package controllers;

import services.ProductServices;
import services.UserService;
import services.OrderService;

public class AppController {
    private ProductServices productService;
    private UserService userService;
    private OrderService orderService;

    public AppController() {
        this.productService = new ProductServices();
        this.userService = new UserService();
        this.orderService = new OrderService();
    }

    public void showProducts() {
        productService.getAllProducts().forEach(System.out::println);
    }

    public void showUsers() {
        userService.getAllUsers().forEach(System.out::println);
    }

    public void showOrders() {
        orderService.getAllOrders().forEach(System.out::println);
    }
}
