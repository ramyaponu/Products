package com.NewWorks.Ecommerce.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NewWorks.Ecommerce.Entity.Products;
import com.NewWorks.Ecommerce.Entity.ProductsDto;

public interface ProductsRepository extends JpaRepository<Products,Integer>{

	

}
