package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
	User user;
	Product product;
	
	public Order(User user, Product product) { //public이 붙어여 다른 package에서 쓸 수 있음.
		this.user = user;
		this.product = product;
	}
	
}
