package mk.ukim.finki.wpaud.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    @ManyToOne //edna kategorija mozat da ja imaat povekje produkti
    private Category category;
    @ManyToOne //eden proizvoditel moze da bide na povekje produkti
    private Manufacturer manufacturer;

    public Product(String name, Double price, Integer quantity, Category category, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.manufacturer = manufacturer;
    }

    public Product() {

    }
}
