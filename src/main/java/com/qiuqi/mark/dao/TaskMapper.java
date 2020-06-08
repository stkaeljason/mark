package com.qiuqi.mark.dao;

import com.qiuqi.mark.model.Task;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 5/27/20 2:45 PM
 */
@Component
public interface TaskMapper extends Mapper<Task> {
}
