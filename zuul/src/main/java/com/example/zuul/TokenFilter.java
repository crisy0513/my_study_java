package com.example.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.protocol.RequestContent;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangchenxin
 * @date 2020/6/23  11:20
 * @desc
 */
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";//请求被路由之前调用
    }

    @Override
    public int filterOrder() {
        return 0;//执行顺序
    }

    @Override
    public boolean shouldFilter() {
        return true;//是否执行
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isNotEmpty(token)) {
            ctx.setSendZuulResponse(true); //对请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);
            return null;
        } else {
            ctx.setSendZuulResponse(false); //不对其进行路由
            ctx.setResponseStatusCode(400);
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess", false);
            return null;
        }
    }
}
