package com.zixun.purchase.model.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @description:
 * @author: tiger
 * @date: 18-1-12 下午11:18
 * @version: V1.0
 * @modified by:
 */
@Data
public class PermissionVO {
    private Long id;

    @NotNull(message = "角色名不能为空")
    private String permname;

    private Integer status;

    @NotNull(message = "类型不能为空")
    private String description;

    @NotNull(message = "类型不能为空")
    private Integer type;

    private String icon;

    private Integer sort;

    private Long parentid;

    private String url;

    private String code;
}
