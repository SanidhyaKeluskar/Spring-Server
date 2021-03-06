package com.example.demo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class InventoryController {
	
	@Autowired
	InventoryRepository invenotryRepository;
	
	 @RequestMapping("/")
	    public String index() {
	        return "Congratulations from InventoryController.java";
	    }
	 
	 @GetMapping("/items")
	 public List<Product_Details> allproducts() 
	 {
		//return invenotryRepository.findAll();
		 return invenotryRepository.findallvalues();
	 }
	 
	 @GetMapping("/items/{id}")
	 public Optional<Product_Details> selectedproduct(@PathVariable String id){
		 int Id = Integer.parseInt(id);
		 return invenotryRepository.findById(Id);
	 }
	 
	 @PutMapping("/items/update/{id}")
	 public Product_Details updateproduct(@PathVariable String id, @RequestBody Map<String, String> body){
		 int Id = Integer.parseInt(id);
		 
		 Optional<Product_Details> pd=invenotryRepository.findById(Id);
		 
		 
		 Product_Details cd=pd.get();
		 cd.set_total_item_remaining(Integer.parseInt(body.get("total_item_remaining")));
		 cd.set_product_location(body.get("product_location"));
		 return invenotryRepository.save(cd);
		 
	 }
	 
	 @PostMapping("/items/new")
	    public Product_Details create(@RequestBody Map<String, String> body){
	      
	        String product_name = body.get("product_name");
	        String product_category = body.get("product_category");
	        int total_item_remaining = Integer.parseInt(body.get("total_item_remaining"));
	        String product_location = body.get("product_location");
	        Product_Details cd=new Product_Details(product_name,product_category,total_item_remaining,product_location);
	        return invenotryRepository.save(cd);
	 }
	 
	 


}
