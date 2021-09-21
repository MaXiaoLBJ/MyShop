package com.xiao.service.impl;

import com.xiao.base.BaseDao;
import com.xiao.base.BaseServiceImpl;
import com.xiao.mapper.ItemOrderMapper;
import com.xiao.po.ItemOrder;
import com.xiao.service.ItemOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemOrderServiceImpl extends BaseServiceImpl<ItemOrder> implements ItemOrderService {

    @Autowired
    private ItemOrderMapper itemOrderMapper;

    @Override
    public BaseDao<ItemOrder> getBaseDao() {
        return itemOrderMapper;
    }
}
