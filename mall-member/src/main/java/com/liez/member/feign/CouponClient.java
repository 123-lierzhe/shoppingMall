package com.liez.member.feign;

import com.alibaba.fastjson.JSONObject;
import com.liez.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 1.在启动类添加注解
 * 2.写一个接口调用
 */
@FeignClient("service-coupon")
public interface CouponClient {

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("coupon/selectOne")
    public R selectOne(@RequestBody JSONObject params);
}
