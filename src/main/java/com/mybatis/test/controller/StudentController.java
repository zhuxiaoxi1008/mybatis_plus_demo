package com.mybatis.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.mybatis.test.service.IStudentService;
import com.mybatis.test.entity.Student;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhuXiaoxi
 * @since 2025-10-22
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/save")
    public Boolean save(@RequestBody Student student) {
        return studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return studentService.removeById(id);
    }

    @GetMapping("/list")
    public List<Student> findAll() {
        return studentService.list();
    }

    @GetMapping("/{id}")
    public Student findOne(@PathVariable Integer id) {
        return studentService.getById(id);
    }

    @GetMapping("/page")
    public Page<Student> findPage(@RequestParam Integer pageNum,
                                    @RequestParam Integer pageSize) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return studentService.page(new Page<>(pageNum, pageSize));
    }

}

