package br.com.vicz.StockControl.businessImpl;

import br.com.vicz.StockControl.business.ProductBusiness;
import br.com.vicz.StockControl.model.Product;
import br.com.vicz.StockControl.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductBusinessImpl implements ProductBusiness {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {

        System.out.println("Get all products...");

        return (List<Product>) productRepository.findAll();
    }

    @Override
    public void save(Product product) {

        productRepository.save(product);
    }

    @Override
    public ResponseEntity<String> deleteById(Long id) {

        System.out.println("Delete product with ID: " + id + "...");
        productRepository.deleteById(id);

        return new ResponseEntity<>("Product has been deleted!", HttpStatus.OK);
    }

    @Override
    public List<Product> findByName(String name) {

        List<Product> products = productRepository.findByName(name);
        return products;
    }

    @Override
    public ResponseEntity<Product> updateProduct(Long id, Product product) {

        System.out.println("Update products with ID: " + id + "...");

        Optional<Product> productData = productRepository.findById(id);

        if(productData.isPresent()){

            Product _product = productData.get();
            _product.setName(product.getName());
            _product.setAmount(product.getAmount());
            _product.setPrice(product.getPrice());
            _product.setBarCode(product.getBarCode());

            return new ResponseEntity<>(productRepository.save(_product), HttpStatus.OK);

        } else {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
