package com.chintu.ecommerce.Services;

import com.chintu.ecommerce.DTOs.APIResposne;
import com.chintu.ecommerce.Models.Product;
import com.chintu.ecommerce.Utilities.ConvertToAPIDTOUtility;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ProductRetreive {
    private static List<Product> productsList;

    public APIResposne addtoList(Product p){
        productsList.add(p);
        return ConvertToAPIDTOUtility.convert(1, p);
    }

    public ProductRetreive() {
        productsList = new ArrayList<>(Arrays.asList(new Product(1, "Apple", "Fruits"),
                new Product(2, "Potato", "Veggies"),
                new Product(3, "Chips", "Snacks")));
    }
    public APIResposne getOneProduct(int id){
        Product ans= productsList.stream().filter(x->x.getID()==id).findFirst().get();
        return ConvertToAPIDTOUtility.convert(1, ans);
    }
    public List<String> getProductsList() {

        return productsList.stream().map(Product::toString).collect(Collectors.toList());
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }
}
