package com.mybatis.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.mybatis.test.service.ITeacherService;
import com.mybatis.test.entity.Teacher;

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
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @PostMapping("/save")
    public Boolean save(@RequestBody Teacher teacher) {
        return teacherService.saveOrUpdate(teacher);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return teacherService.removeById(id);
    }

    @GetMapping("/list")
    public List<Teacher> findAll() {
        return teacherService.list();
    }

    @GetMapping("/{id}")
    public Teacher findOne(@PathVariable Integer id) {
        return teacherService.getById(id);
    }

    @GetMapping("/page")
    public Page<Teacher> findPage(@RequestParam Integer pageNum,
                                    @RequestParam Integer pageSize) {
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return teacherService.page(new Page<>(pageNum, pageSize));
    }

}

