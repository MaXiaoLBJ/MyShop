package com.xiao.service.impl;

import com.xiao.base.BaseDao;
import com.xiao.base.BaseServiceImpl;
import com.xiao.mapper.CommentMapper;
import com.xiao.po.Comment;
import com.xiao.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment> implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public BaseDao<Comment> getBaseDao() {
        return commentMapper;
    }
}
