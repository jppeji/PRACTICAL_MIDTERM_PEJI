package com.example.scs.data.dao.customers.impl;

import com.example.scs.data.dao.customers.CustomersDao;
import com.example.scs.data.dao.utils.queryconstants.customers.QueryConstants;
import com.example.scs.data.model.customers.Customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomersDaoImpl implements CustomersDao {
    @Override
    public List<Customers> getAllCustomers() {
        List<Customers> CustomerList = new ArrayList<>();

        QueryConstants queryConstants = new QueryConstants();
        String sql= queryConstants.getRETRIEVE_ALL_CUSTOMERS_QUERY();


        try (Connection con = ConnectionHelper.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while  (rs.next()) {

                Customers customers = new Customers();

                customers.setCustomerID(rs.getInt("CUSTOMER_ID"));
                customers.setCustomerName(rs.getString("CUSTOMER_NAME"));
                customers.setAddress(rs.getString("ADDRESS"));
                customers.setContactNumber(rs.next("CONTACT_NUMBER"));

            }
        }
        return CustomerList;
    }
}
