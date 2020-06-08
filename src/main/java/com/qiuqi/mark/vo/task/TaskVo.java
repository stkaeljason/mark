package com.qiuqi.mark.vo.task;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 5/27/20 4:07 PM
 */
@ApiModel("TaskVo")
public class TaskVo {
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

    @ApiModelProperty("taskSchdule")
    private String taskSchdule;

    @ApiModelProperty("dataAmount")
    private Integer dataAmount;

    @ApiModelProperty("creator")
    private String taskCreator;

    @ApiModelProperty("create_time")
    private Date createTime;
}
