package com.mybatis.test.service.impl;

import com.mybatis.test.entity.Blog;
import com.mybatis.test.mapper.BlogMapper;
import com.mybatis.test.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhuXiaoxi
 * @since 2025-10-22
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
