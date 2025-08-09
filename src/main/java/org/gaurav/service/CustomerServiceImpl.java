package org.gaurav.service;

import org.gaurav.dao.ICustomerDao;
import org.gaurav.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDao repo;

    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) repo.findAll();

    }

    @Override
    public void saveCustomer(Customer customer) {
        repo.save(customer);
    }

    @Override
    public Customer getCustomer(Integer id) {
       Optional<Customer> optional= repo.findById(id);
            return optional.get() ;
    }

    @Override
    public void deleteCustomer(Integer customerId) {
        repo.deleteById(customerId);
    }



}
