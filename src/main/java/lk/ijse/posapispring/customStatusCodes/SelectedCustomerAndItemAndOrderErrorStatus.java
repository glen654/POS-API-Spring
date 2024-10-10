package lk.ijse.posapispring.customStatusCodes;

import lk.ijse.posapispring.dto.CustomerStatus;
import lk.ijse.posapispring.dto.ItemStatus;
import lk.ijse.posapispring.dto.OrderDetailsStatus;
import lk.ijse.posapispring.dto.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedCustomerAndItemAndOrderErrorStatus implements CustomerStatus, ItemStatus, OrderStatus, OrderDetailsStatus {
    private int statusCode;
    private String statusMassage;
}
