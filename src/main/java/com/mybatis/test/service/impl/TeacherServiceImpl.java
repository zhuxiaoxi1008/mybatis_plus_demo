package com.mybatis.test.service.impl;

import com.mybatis.test.entity.Teacher;
import com.mybatis.test.mapper.TeacherMapper;
import com.mybatis.test.service.ITeacherService;
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
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

}
