package com.vaku.foodapp.order.services;

import com.vaku.foodapp.enums.OrderStatus;
import com.vaku.foodapp.order.dtos.OrderDTO;
import com.vaku.foodapp.order.dtos.OrderItemDTO;
import com.vaku.foodapp.response.Response;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderService {

    Response<?> placeOrderFromCart();
    Response<OrderDTO> getOrderById(Long id);
    Response<Page<OrderDTO>> getAllOrders(OrderStatus orderStatus, int page, int size);
    Response<List<OrderDTO>> getOrdersOfUser();
    Response<OrderItemDTO> getOrderItemById(Long orderItemId);
    Response<OrderDTO> updateOrderStatus(OrderDTO orderDTO);
    Response<Long> countUniqueCustomers();
}
