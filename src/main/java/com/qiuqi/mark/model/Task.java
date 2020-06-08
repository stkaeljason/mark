package com.qiuqi.mark.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 5/19/20 5:23 PM
 */
@Getter
@Setter
@Table(name = "task")
public class Task {
    @Id
    @Column(name = "task_id")
    private Long taskId;

    @Id
    @Column(name = "data_id")
    private Long dataId;

    @Column(name = "task_category")
    private Byte taskCategory;

    @Column(name = "task_category_value")
    private String taskCategoryValue;

    @Column(name = "task_status")
    private Byte taskStatus;

    @Column(name = "task_schdule")
    private String taskSchdule;

    @Column(name = "creator")
    private String taskCreator;

    @Column(name = "creator_id")
    private Long creatorId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "enable")
    private Byte enable;

}
