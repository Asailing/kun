package cn.kun.base.api.entity.patrol.vo;

import cn.kun.base.core.global.entity.vo.BaseDetailVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;

/**
 * 巡检类型-查询-返回值
 *
 * @author SkySailStar
 * @date 2023-03-22 10:14
 */
@Schema(description = "巡检类型-查询-返回值")
@Data
public class PatrolCategoryVO extends BaseDetailVO {
    
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "编码")
    private String code;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "排序")
    private Integer sort;
}
