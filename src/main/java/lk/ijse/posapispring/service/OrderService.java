package lk.ijse.posapispring.service;

import lk.ijse.posapispring.dto.impl.OrderDTO;
import lk.ijse.posapispring.dto.impl.OrderDetailsDTO;

import java.util.List;

public interface OrderService {
    boolean placeOrder(OrderDTO orderDTO, List<OrderDetailsDTO> orderDetailsDTOS);
}
