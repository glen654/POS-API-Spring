package lk.ijse.posapispring.entity.impl;

import jakarta.persistence.*;
import lk.ijse.posapispring.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orderDetails")
public class OrderDetailsEntity implements SuperEntity {
    @Id
    private String detailsId;
    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "orderId")
    private OrderEntity order;
    @ManyToOne
    @MapsId("itemCode")
    @JoinColumn(name = "itemCode")
    private ItemEntity item;
    private int orderQty;
    private double unitPrice;
}
