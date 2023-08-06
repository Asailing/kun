package cn.kun.auth.system.user.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import cn.kun.base.core.global.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * <p>
 * 外部用户角色表
 * </p>
 *
 * @author SkySailStar
 * @since 2023-02-10 11:06
 */
@Getter
@Setter
@TableName("sys_user_role_outer")
@Schema(name = "SysUserRoleOuter", description = "外部用户角色表")
public class SysUserRoleOuter extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "外部角色编号（关联sys_role_outer表中的id）")
    @TableField("user_outer_id")
    private Long userOuterId;

    @Schema(description = "外部用户编号（关联sys_user_outer表中的id）")
    @TableField("role_outer_id")
    private Long roleOuterId;
}
