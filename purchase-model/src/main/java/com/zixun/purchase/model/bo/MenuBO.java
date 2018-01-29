package com.zixun.purchase.model.bo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: tiger
 * @date: 18-1-14 下午7:30
 * @version: V1.0
 * @modified by:
 */
@Data
public class MenuBO {
    private Long id;

    private String permname;

    private Integer status;

    private String description;

    private Integer type;

    private String icon;

    private Integer sort;

    private Long parentid;

    private String url;

    private String code;

    private Date createdate;

    private String createusername;

    private List<MenuBO> children;
}
