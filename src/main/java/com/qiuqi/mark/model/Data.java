package com.qiuqi.mark.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
/**
 * @author jiaqiying
 * @version 1.0
 * @date 5/19/20 5:19 PM
 */

@Getter
@Setter
@Table(name = "data")
public class Data {
    @Id
    @Column(name = "data_id")
    private Long dataId;

    @Column(name = "data_name")
    private String dataName;

    @Column(name = "data_path")
    private String dataPath;

    @Column(name = "data_category")
    private Byte dataCategory;

    @Column(name = "data_amount")
    private Long dataAmount;

    @Column(name = "enable")
    private Byte enable;
}
