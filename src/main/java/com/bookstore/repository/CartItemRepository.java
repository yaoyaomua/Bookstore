package com.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.model.CartItem;
import com.bookstore.model.Order;
import com.bookstore.model.ShoppingCart;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long> {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	List<CartItem> findByOrder(Order order);
}
