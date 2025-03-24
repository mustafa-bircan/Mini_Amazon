package interfaces;

import models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void updateProduct(Long id, Product updateProduct);
    void deleteProduct(Long id);
}
