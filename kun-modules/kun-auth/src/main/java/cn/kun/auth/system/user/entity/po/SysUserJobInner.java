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
 * 内部用户职位表
 * </p>
 *
 * @author SkySailStar
 * @since 2023-02-10 11:06
 */
@Getter
@Setter
@TableName("sys_user_job_inner")
@Schema(name = "SysUserJobInner", description = "内部用户职位表")
public class SysUserJobInner extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "用户编号（关联sys_user_inner表中的id）")
    @TableField("user_inner_id")
    private Long userInnerId;

    @Schema(description = "内部职位id（关联sys_job_inner表中的id）")
    @TableField("job_inner_id")
    private Long jobInnerId;
}
