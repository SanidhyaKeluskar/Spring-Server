package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product_Details {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	   private int product_id;
	    private String product_name;
	    private String product_category;
	    private String total_item_remaining;
	    private String product_location;

	    public Product_Details() {  }

	    public Product_Details(int product_id, String product_name, String product_category,String total_item_remaining,String product_location) {
	        this.setId(product_id);
	        this.set_product_name(product_name);
	        this.set_product_category(product_category);
	        this.set_total_item_remaining(total_item_remaining);
	        this.set_total_item_remaining(product_location);
	    }

	    public int getId() {
	        return product_id;
	    }

	    public void setId(int id) {
	        this.product_id = id;
	    }

	    public String get_product_name() {
	        return product_name;
	    }

	    public void set_product_name(String product_name) {
	        this.product_name = product_name;
	    }

	    public String get_product_category() {
	        return product_category;
	    }

	    public void set_product_category(String product_category) {
	        this.product_category = product_category;
	    }
	    
	    public String get_total_item_remaining() {
	        return total_item_remaining;
	    }

	    public void set_total_item_remaining(String total_item_remaining) {
	        this.total_item_remaining = total_item_remaining;
	    }
	    public String get_product_location() {
	        return product_location;
	    }

	    public void set_product_location(String product_location) {
	        this.product_location = product_location;
	    }

}
