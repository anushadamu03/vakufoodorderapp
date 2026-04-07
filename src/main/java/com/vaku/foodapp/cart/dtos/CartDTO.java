package com.vaku.foodapp.cart.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.vaku.foodapp.cart.entity.CartItem;
import com.vaku.foodapp.menu.dtos.MenuDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartDTO {

    private Long id;

    private Long menuId;

    private List<CartItemDTO> cartItems;

    private int quantity;

    private BigDecimal totalAmount;
}
