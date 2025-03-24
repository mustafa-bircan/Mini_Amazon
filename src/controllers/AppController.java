package controllers;

import interfaces.IOrderService;
import interfaces.IProductService;
import interfaces.IUserService;


public class AppController {
    private final IProductService productService;
    private final IUserService userService;
    private final IOrderService orderService;

    public AppController(IProductService productService, IUserService userService, IOrderService orderService) {
        this.productService = productService;
        this.userService = userService;
        this.orderService = orderService;
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
