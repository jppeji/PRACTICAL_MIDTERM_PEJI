package com.example.scs.app.facade.items.impl;

import com.example.scs.app.facade.items.ItemsFacade;
import com.example.scs.data.dao.items.ItemsDao;
import com.example.scs.data.dao.items.impl.ItemsDaoImpl;
import com.example.scs.data.model.items.Items;
import com.example.scs.app.facade.items.impl.ItemsFacadeImpl;

import java.util.List;

public class ItemsFacadeImpl implements ItemsFacade {

    private ItemsDao itemsDao = new ItemsDaoImpl();

    @Override
    public List<Items> findALLItems(){return this.itemsDao.getAllItems();}
}

