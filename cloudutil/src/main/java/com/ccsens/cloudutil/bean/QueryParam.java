package com.ccsens.cloudutil.bean;

import lombok.Data;

/**
 * @description:
 * @author: wuHuiJuan
 * @create: 2019/11/27 10:06
 */
@Data
public class QueryParam<T> {
    private T t;
    private Long userId;
}
