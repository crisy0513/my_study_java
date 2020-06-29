package com.example.demo_security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author wangchenxin
 * @date 2020/6/29  9:34
 * @desc
 */

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @RequestMapping("/list")
    public ModelAndView list(Model model){
        List<Blog> blogs = blogService.getBlogs();
        model.addAttribute("bloglist",blogs);
        return new ModelAndView("blog/list","blogModel",model);
    }

    @RequestMapping("/delete/{id}")
    @PreAuthorize("hasAuthority('ROLE_ROOT')")//方法级别的验证，只有ROOT角色的用户才能访问此方法
    public ModelAndView delete(@PathVariable("id") Long id, Model model){
        blogService.deleteBlog(id);
        model.addAttribute("bloglist",blogService.getBlogs());
        return new ModelAndView("blog/list", "blogModel", model);
    }
}
