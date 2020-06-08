package com.qiuqi.mark.vo.task;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 5/27/20 4:05 PM
 */
@Getter
@Setter
@ApiModel("TaskQueryVo")
public class TaskQueryVo {
    @ApiModelProperty("dataName")
    private String dataName;

    @ApiModelProperty("dataCategory")
    private Byte dataCategory;

    @ApiModelProperty("taskCategory")
    private Byte taskCategory;

    @ApiModelProperty("taskCategoryValue")
    private String taskCategoryValue;

    @ApiModelProperty("taskStatus")
    private Byte taskStatus;
}
