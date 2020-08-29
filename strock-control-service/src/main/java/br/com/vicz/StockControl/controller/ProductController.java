package br.com.vicz.StockControl.controller;

import br.com.vicz.StockControl.business.ProductBusiness;
import br.com.vicz.StockControl.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductBusiness productService;

    @GetMapping("/products")
    public List<Product> findAll(){

        return productService.findAll();
    }

    @PostMapping("/product")
    public void save(@RequestBody Product product){

        productService.save(product);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long id){

        return productService.deleteById(id);
    }

    @GetMapping("/product/name/{name}")
    public List<Product> findByName(@PathVariable String name){

        return productService.findByName(name);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product){

        return productService.updateProduct(id, product);
    }

}
