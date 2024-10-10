package lk.ijse.posapispring.service.impl;

import lk.ijse.posapispring.dto.impl.OrderDTO;
import lk.ijse.posapispring.dto.impl.OrderDetailsDTO;
import lk.ijse.posapispring.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Override
    public boolean placeOrder(OrderDTO orderDTO, List<OrderDetailsDTO> orderDetailsDTOS) {
        return false;
    }
}
