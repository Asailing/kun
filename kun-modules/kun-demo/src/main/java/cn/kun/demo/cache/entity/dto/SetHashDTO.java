package cn.kun.demo.cache.entity.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 集合缓存是否存在值-传入值
 *
 * @author SkySailStar
 * @date 2023-01-08 21:39
 */
@Schema(description = "集合缓存是否存在值-传入值")
@Data
public class SetHashDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "键")
    private String key;

    @Schema(description = "值")
    private Object value;
}
