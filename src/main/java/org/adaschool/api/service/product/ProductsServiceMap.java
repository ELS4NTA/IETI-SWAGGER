package org.adaschool.api.service.product;

import org.adaschool.api.repository.product.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ProductsServiceMap implements ProductsService {

    Map<String, Product> products = new HashMap<>();

    @Override
    public Product save(Product product) {
        products.put(product.getId(), product);
        return product;
    }

    @Override
    public Optional<Product> findById(String id) {
        return Optional.ofNullable(products.get(id));
    }

    @Override
    public List<Product> all() {
        return (List<Product>) products.values();
    }

    @Override
    public void deleteById(String id) {
        products.remove(id);
    }

    @Override
    public Product update(Product product, String productId) {
        products.put(productId, product);
        return product;
    }
}
