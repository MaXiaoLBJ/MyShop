package com.xiao.service.impl;

import com.xiao.base.BaseDao;
import com.xiao.base.BaseServiceImpl;
import com.xiao.mapper.ItemMapper;
import com.xiao.po.Item;
import com.xiao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public BaseDao<Item> getBaseDao() {
        return itemMapper;
    }
}
