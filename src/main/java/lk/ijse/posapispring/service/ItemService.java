package lk.ijse.posapispring.service;

import lk.ijse.posapispring.dto.impl.ItemDTO;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);
    void deleteItem(String itemCode);
}
