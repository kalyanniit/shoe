package com.shoeclue.dao;

import com.shoeclue.model.Cart;
import com.shoeclue.model.CartItem;


public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByItemId (int itemId);

}
