package com.example.scs.app.facade.customers.impl;

import com.example.scs.app.facade.customers.CustomerFacade;
import com.example.scs.data.dao.customers.impl.CustomersDaoImpl;
import com.example.scs.data.model.customers.Customers;
import com.example.scs.data.dao.customers.CustomersDao;

import java.util.List;

public class CustomerFacadeimpl implements CustomerFacade {

    private CustomersDao customersDao = new CustomersDaoImpl();
    @Override
    public List<Customers> findAllCustomers(){ return this.customersDao.getAllCustomers();


    }
}
