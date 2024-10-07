package lk.ijse.posapispring.service;

import lk.ijse.posapispring.dto.impl.CustomerDTO;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String customerId);
    void updateCustomer(String customerId,CustomerDTO customerDTO);
}
