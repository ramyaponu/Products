package com.NewWorks.Ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.NewWorks.Ecommerce.Entity.ProductsDto;
import com.NewWorks.Ecommerce.Service.ProductsService;

@RestController
public class ProductController {
	
	@Autowired
	ProductsService productservice;
	
    @PostMapping("/products")
     public void saveData(@RequestBody ProductsDto productdto) {
    	 

    	 productservice.SaveProducts(productdto);
     }
    @GetMapping("/view/productId/{productId}")
    public ProductsDto viewProducts(@PathVariable Integer productId) throws Exception {
 
    	ProductsDto dto=productservice.viewData(productId);
		return dto;
    	
    	
    	
    }
    
    
    
    
    
    

}
