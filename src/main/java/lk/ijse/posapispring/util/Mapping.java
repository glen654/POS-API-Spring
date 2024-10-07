package lk.ijse.posapispring.util;

import lk.ijse.posapispring.dto.impl.CustomerDTO;
import lk.ijse.posapispring.dto.impl.ItemDTO;
import lk.ijse.posapispring.entity.impl.CustomerEntity;
import lk.ijse.posapispring.entity.impl.ItemEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    //For Customer Mapping
    public CustomerEntity toCustomerEntity(CustomerDTO customerDTO){
        return modelMapper.map(customerDTO,CustomerEntity.class);
    }

    public CustomerDTO toCustomerDto(CustomerEntity customerEntity){
        return modelMapper.map(customerEntity,CustomerDTO.class);
    }

    public List<CustomerDTO> asCustomerDTOList(List<CustomerEntity> customerEntityList){
        return modelMapper.map(customerEntityList, new TypeToken<List<CustomerDTO>>() {}.getType());
    }

    //For Item Mapping
    public ItemEntity toItemEntity(ItemDTO itemDTO){
        return modelMapper.map(itemDTO, ItemEntity.class);
    }

    public ItemDTO toItemDto(ItemEntity itemEntity){
        return modelMapper.map(itemEntity, ItemDTO.class);
    }

    public List<ItemDTO> asItemDTOList(List<ItemEntity> itemEntityList){
        return modelMapper.map(itemEntityList, new TypeToken<List<ItemDTO>>() {}.getType());
    }
}
