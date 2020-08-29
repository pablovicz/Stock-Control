package br.com.vicz.StockControl.business;

import br.com.vicz.StockControl.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

public interface ProductBusiness {

    public List<Product> findAll();

    public void save(Product product);

    public ResponseEntity<String> deleteById(@PathVariable("id") Long id);

    public List<Product> findByName(@PathVariable String name);

    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product);
}
