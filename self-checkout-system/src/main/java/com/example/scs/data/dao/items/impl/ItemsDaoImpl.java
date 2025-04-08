package com.example.scs.data.dao.items.impl;

import com.example.scs.data.dao.items.ItemsDao;
import com.example.scs.data.model.items.Items;
import com.example.scs.data.dao.utils.queryconstants.items.QueryConstants;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ItemsDaoImpl implements ItemsDao {
    @Override
    public List<Items> getAllItems() {
        List<Items> ItemList = new ArrayList<>();

        QueryConstants queryConstants = new QueryConstants();
        String sql= queryConstants.getRETRIEVE_ITEM_DETAILS_QUERY();

        try (Connection con = ConnectionHelper.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()){

                Items items =new Items();


                items.getItemID(rs.getInt("ITEM_ID"));
                items.getItemDescription(rs.getString("ITEM_DESCRIPTION"));
                items.getUnitPrice(rs.getInt("UNIT_PRICE"));

            }
        }


        return ItemList;
    }
}
