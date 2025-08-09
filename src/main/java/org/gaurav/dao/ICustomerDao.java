package org.gaurav.dao;

import org.gaurav.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ICustomerDao extends CrudRepository<Customer,Integer> {




}
