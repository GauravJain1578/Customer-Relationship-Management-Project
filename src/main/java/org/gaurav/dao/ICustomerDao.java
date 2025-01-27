package org.gaurav.dao;

import org.gaurav.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerDao extends CrudRepository<Customer,Integer> {




}
