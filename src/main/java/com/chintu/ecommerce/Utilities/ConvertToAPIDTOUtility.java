package com.chintu.ecommerce.Utilities;

import com.chintu.ecommerce.DTOs.APIResposne;
import com.chintu.ecommerce.Models.Product;
import org.springframework.stereotype.Component;

@Component
public class ConvertToAPIDTOUtility {

    public ConvertToAPIDTOUtility() {
    }

    public static APIResposne convert(int status, Product product){
        return new APIResposne(status, product);
    }
}
