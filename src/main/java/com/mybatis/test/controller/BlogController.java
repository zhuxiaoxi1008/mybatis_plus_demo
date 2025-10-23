package com.mybatis.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.mybatis.test.service.IBlogService;
import com.mybatis.test.entity.Blog;

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
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @PostMapping("/save")
    public Boolean save(@RequestBody Blog blog) {
        return blogService.saveOrUpdate(blog);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return blogService.removeById(id);
    }

    @GetMapping("/list")
    public List<Blog> findAll() {
        return blogService.list();
    }

    @GetMapping("/{id}")
    public Blog findOne(@PathVariable Integer id) {
        return blogService.getById(id);
    }

    @GetMapping("/page")
    public IPage findPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize) {
        return blogService.page(new Page<>(pageNum, pageSize));
    }

}

