package com.example.scs.app.facade.customers;
import com.example.scs.data.model.customers.Customers;
import java.util.List;

public interface CustomerFacade {

    List<Customers> findAllCustomers();

}
