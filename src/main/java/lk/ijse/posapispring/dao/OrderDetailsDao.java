package lk.ijse.posapispring.dao;

import lk.ijse.posapispring.entity.impl.OrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsDao extends JpaRepository<OrderDetailsEntity,String> {
}
