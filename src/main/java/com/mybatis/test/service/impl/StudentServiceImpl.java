package com.mybatis.test.service.impl;

import com.mybatis.test.entity.Student;
import com.mybatis.test.mapper.StudentMapper;
import com.mybatis.test.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
