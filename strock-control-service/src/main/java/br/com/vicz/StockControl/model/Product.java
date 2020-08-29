package br.com.vicz.StockControl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name = "PRICE")
    private Long price;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "BAR_CODE")
    private Long barCode;

    public Product(){}

    public Product(String name, Long price, Long amount, Long barCode) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + ", price=" + price + ", amount=" + amount + ", barCode=" + barCode + '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getBarCode() {
        return barCode;
    }

    public void setBarCode(Long barCode) {
        this.barCode = barCode;
    }
}
