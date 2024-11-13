package com.NewWorks.Ecommerce.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.NewWorks.Ecommerce.Dao.ProductsRepository;
import com.NewWorks.Ecommerce.Entity.Products;
import com.NewWorks.Ecommerce.Entity.ProductsDto;

@Service
public class ProductsService {

	@Autowired
	ProductsRepository productrepo;
	ProductsDto dto=new ProductsDto();
	
	public void SaveProducts(ProductsDto productdto) {
		Products prod=new Products();
		prod.setProductName(productdto.getProductName());
		prod.setProductDescription(productdto.getProductDescription());
		prod.setRating(productdto.getRating());
		prod.setProductCost(productdto.getProductCost());
		prod.setDeliveryDate(productdto.getDeliveryDate());
		prod.setProductColor(productdto.getProductColor());
       productrepo.save(prod);
	}
	public ProductsDto viewData(Integer productId) throws Exception {
		
		 Optional<Products> prod=productrepo.findById(productId);
		Products pr=prod.orElseThrow(()->new Exception("product not found"));
	    dto.setProductId(pr.getProductId());
		dto.setProductName(pr.getProductName());
		dto.setProductDescription(pr.getProductDescription());
		dto.setRating(pr.getRating());
		dto.setProductCost(pr.getProductCost());
		dto.setDeliveryDate(pr.getDeliveryDate());
		dto.setProductColor(pr.getProductColor());
		return dto;	
		
	}
}
