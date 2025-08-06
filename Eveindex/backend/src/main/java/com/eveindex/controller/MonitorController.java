package com.eveindex.controller;

import com.eveindex.common.Result;
import com.eveindex.dto.MonitorDataResponse;
import com.eveindex.service.MonitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitor")
@RequiredArgsConstructor
public class MonitorController {

    private final MonitorService monitorService;

    @GetMapping("/dashboard")
    public Result<MonitorDataResponse> getDashboardData() {
        try {
            MonitorDataResponse data = monitorService.getDashboardData();
            return Result.success(data);
        } catch (Exception e) {
            return Result.error("获取仪表盘数据失败: " + e.getMessage());
        }
    }

    @GetMapping("/country/{countryCode}")
    public Result<MonitorDataResponse> getCountryMonitorData(@PathVariable String countryCode) {
        try {
            MonitorDataResponse data = monitorService.getCountryMonitorData(countryCode);
            return Result.success(data);
        } catch (Exception e) {
            return Result.error("获取国家监控数据失败: " + e.getMessage());
        }
    }

    @GetMapping("/warnings")
    public Result<List<MonitorDataResponse>> getWarnings(
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String warningType,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size) {
        try {
            List<MonitorDataResponse> warnings = monitorService.getWarnings(country, warningType, page, size);
            return Result.success(warnings);
        } catch (Exception e) {
            return Result.error("获取预警数据失败: " + e.getMessage());
        }
    }
} 