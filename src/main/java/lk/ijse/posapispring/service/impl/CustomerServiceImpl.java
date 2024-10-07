package lk.ijse.posapispring.service.impl;

import lk.ijse.posapispring.dao.CustomerDao;
import lk.ijse.posapispring.dto.impl.CustomerDTO;
import lk.ijse.posapispring.entity.impl.CustomerEntity;
import lk.ijse.posapispring.exception.DataPersistException;
import lk.ijse.posapispring.service.CustomerService;
import lk.ijse.posapispring.util.AppUtil;
import lk.ijse.posapispring.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private Mapping mapping;
    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        customerDTO.setCustomerId(AppUtil.generateCustomerId());
        CustomerEntity saveCustomer = customerDao.save(mapping.toCustomerEntity(customerDTO));
        if(saveCustomer == null){
            throw new DataPersistException("Customer not saved");
        }
    }
}
