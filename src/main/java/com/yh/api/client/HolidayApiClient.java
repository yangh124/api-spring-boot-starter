package com.yh.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 */
public interface HolidayApiClient {

    /**
     * 获取节假日信息
     *
     * @param year 年份
     * @return 节假日信息
     */
    @GetMapping("/{year}.json")
    String getHolidayFromGitHub(@PathVariable("year") Integer year);
}
