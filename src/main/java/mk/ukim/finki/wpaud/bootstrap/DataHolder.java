package mk.ukim.finki.wpaud.bootstrap;

import lombok.Getter;
import mk.ukim.finki.wpaud.model.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component //ovaa klasa se instancira koga startuva samata app
@Getter
public class DataHolder {
    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts = new ArrayList<>();


//    @PostConstruct //posle DataHolder se povikuva init
//    public void init()
//    {
//        categories.add(new Category("Books", "Books category"));
//        categories.add(new Category("Movies", "Movies category"));
//        users.add(new User("kostadin.mishev", "km", "Kostadin", "Mishev"));
//        users.add(new User("riste.stojanov", "rs", "Riste", "Stojanov"));
//        Manufacturer manufacturer = new Manufacturer("Nike", "NY NY");
//        manufacturers.add(manufacturer);
//        Category category = new Category("Sport", "Sport category");
//        categories.add(category);
//        products.add(new Product("Ball 1", 235.8, 7, category, manufacturer));
//        products.add(new Product("Ball 2", 235.8, 7, category, manufacturer));
//        products.add(new Product("Ball 3", 235.8, 7, category, manufacturer));
//    }
}
