package lk.ijse.posapispring.customStatusCodes;

import lk.ijse.posapispring.dto.CustomerStatus;
import lk.ijse.posapispring.dto.ItemStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedCustomerAndItemErrorStatus implements CustomerStatus, ItemStatus {
    private int statusCode;
    private String statusMassage;
}
