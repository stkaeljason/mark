package com.qiuqi.mark.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 5/19/20 5:24 PM
 */
@Getter
@Setter
@Table(name = "package")
public class Package {
    @Id
    @Column(name = "package_id")
    private Long packageId;

    @Column(name = "package_name")
    private String packageName;

    @Column(name = "data_id")
    private Long dataId;

    @Column(name = "package_image_amount")
    private Integer packageImageAmount;

    @Column(name = "enable")
    private Byte enable;
}
