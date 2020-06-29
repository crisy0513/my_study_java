package com.example.demo_security;

import java.util.List;

/**
 * @author wangchenxin
 * @date 2020/6/29  9:25
 * @desc
 */
public interface BlogService {
    /**
     * 获取所有Blog
     * @return
     */
    List<Blog> getBlogs();

    /**
     * 删除Blog
     */
    void deleteBlog(Long id);

}
