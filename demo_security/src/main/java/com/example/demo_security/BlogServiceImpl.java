package com.example.demo_security;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchenxin
 * @date 2020/6/29  9:28
 * @desc
 */
@Service
public class BlogServiceImpl implements BlogService {
    private List<Blog> list = new ArrayList<>();
    public BlogServiceImpl(){
        list.add(new Blog(1l,"spring boot","this is spring boot"));
        list.add(new Blog(2l,"spring cloud","this is spring cloud"));
    }

    @Override
    public List<Blog> getBlogs() {
        return list;
    }

    @Override
    public void deleteBlog(Long id) {
        list.removeIf(s->s.getId().equals(id));
    }
}
