package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Product_Details, Integer>{
	 @Query(value ="select * from product_details", nativeQuery = true)
	  List<Product_Details> findallvalues();

}
