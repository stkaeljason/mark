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
 * @date 5/27/20 10:25 AM
 */
@Getter
@Setter
@Table(name = "task_package")
public class TaskPackage {
    @Id
    @Column(name = "task_id")
    private Long taskId;

    @Id
    @Column(name = "package_id")
    private Long packageId;

    @Column(name = "marker_name")
    private String markerName;


    @Id
    @Column(name = "task_package_status")
    private Byte taskPackageStatus;

    @Column(name = "pull_time")
    private Date pullTime;

    @Column(name = "commit_time")
    private Date commitTime;

    @Column(name = "enable")
    private Byte enable;
}
