package services;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServices {
    private List<Product> products;

    public ProductServices() {
        this.products = new ArrayList<>();
        products.add(new Product(1L,"Laptop","Dell XPS 13",30.000,10));
        products.add(new Product(2L,"Phone","Iphone 12",28.000,12));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        return products
                .stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateProduct(Long id, Product updateProduct) {
        Product product = getProductById(id);
        if (product != null){
            product.setName(updateProduct.getName());
            product.setDescription(updateProduct.getDescription());
            product.setPrice(updateProduct.getPrice());
            product.setStock(updateProduct.getStock());
        }
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId() == id);
    }
}
