package lk.ijse.posapispring.dao;

import lk.ijse.posapispring.entity.impl.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<OrderEntity,String> {
}
