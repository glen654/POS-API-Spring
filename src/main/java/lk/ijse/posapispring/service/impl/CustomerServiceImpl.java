package lk.ijse.posapispring.service.impl;

import lk.ijse.posapispring.dao.CustomerDao;
import lk.ijse.posapispring.dto.impl.CustomerDTO;
import lk.ijse.posapispring.entity.impl.CustomerEntity;
import lk.ijse.posapispring.exception.CustomerNotFoundException;
import lk.ijse.posapispring.exception.DataPersistException;
import lk.ijse.posapispring.service.CustomerService;
import lk.ijse.posapispring.util.AppUtil;
import lk.ijse.posapispring.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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

    @Override
    public void deleteCustomer(String customerId) {
        Optional<CustomerEntity> existCustomer = customerDao.findById(customerId);
        if(!existCustomer.isPresent()){
            throw new CustomerNotFoundException("Customer Not Found");
        }else{
            customerDao.deleteById(customerId);
        }
    }

    @Override
    public void updateCustomer(String customerId, CustomerDTO customerDTO) {
        Optional<CustomerEntity> tmpCustomer = customerDao.findById(customerId);
        if(!tmpCustomer.isPresent()){
            throw new CustomerNotFoundException("Customer Not Found");
        }else{
            tmpCustomer.get().setCustomerName(customerDTO.getCustomerName());
            tmpCustomer.get().setCustomerAddress(customerDTO.getCustomerAddress());
            tmpCustomer.get().setCustomerTel(customerDTO.getCustomerTel());
        }
    }
}
