package com.liez.coupon.controller;

import com.alibaba.fastjson.JSONObject;
import com.liez.common.utils.R;
import com.liez.coupon.entity.SmsCoupon;
import com.liez.coupon.service.SmsCouponService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 优惠券信息(SmsCoupon)表控制层
 *
 * @author liez
 * @since 2021-08-27 16:53:12
 */
@RestController
@RequestMapping("coupon")
public class SmsCouponController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponService smsCouponService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("selectOne")
    public R selectOne(@RequestBody JSONObject params) {
        return R.oK().data("data", this.smsCouponService.queryById(Long.valueOf(params.getString("id"))));
    }

}
