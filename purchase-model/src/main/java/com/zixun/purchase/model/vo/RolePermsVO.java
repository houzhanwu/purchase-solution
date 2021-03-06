package com.zixun.purchase.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

/**
 * @description:
 * @author: tiger
 * @date: 18-1-28 下午8:16
 * @version: V1.0
 * @modified by:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePermsVO {
    @NonNull
    private Long roleId;

    private List<Long> permIds;
}
