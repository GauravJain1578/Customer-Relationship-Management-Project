package org.gaurav.service;

import org.gaurav.dao.ICustomerDao;
import org.gaurav.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ICustomerService {


    public List<Customer> getAllCustomers();
    public void saveCustomer(Customer customer);
    public Customer getCustomer(Integer customerId);
    public void deleteCustomer(Integer customerId);


}
