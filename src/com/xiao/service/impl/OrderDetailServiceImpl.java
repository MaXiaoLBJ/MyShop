package com.xiao.service.impl;

import com.xiao.base.BaseDao;
import com.xiao.base.BaseServiceImpl;
import com.xiao.mapper.OrderDetailMapper;
import com.xiao.po.OrderDetail;
import com.xiao.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends BaseServiceImpl<OrderDetail> implements OrderDetailService {
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public BaseDao<OrderDetail> getBaseDao() {
        return orderDetailMapper;
    }
}
