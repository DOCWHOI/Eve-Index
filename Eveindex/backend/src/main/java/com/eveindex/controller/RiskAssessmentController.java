package com.eveindex.controller;

import com.eveindex.common.Result;
import com.eveindex.dto.RiskAssessmentRequest;
import com.eveindex.dto.RiskAssessmentResponse;
import com.eveindex.service.RiskAssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risk-assessment")
@RequiredArgsConstructor
public class RiskAssessmentController {

    private final RiskAssessmentService riskAssessmentService;

    @PostMapping("/calculate")
    public Result<RiskAssessmentResponse> calculateRisk(@RequestBody RiskAssessmentRequest request) {
        try {
            RiskAssessmentResponse response = riskAssessmentService.calculateRisk(request);
            return Result.success(response);
        } catch (Exception e) {
            return Result.error("风险评估计算失败: " + e.getMessage());
        }
    }

    @GetMapping("/history")
    public Result<List<RiskAssessmentResponse>> getHistory(
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String competitor,
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size) {
        try {
            List<RiskAssessmentResponse> history = riskAssessmentService.getHistory(country, competitor, page, size);
            return Result.success(history);
        } catch (Exception e) {
            return Result.error("获取历史记录失败: " + e.getMessage());
        }
    }

    @PostMapping("/save")
    public Result<String> saveAssessment(@RequestBody RiskAssessmentRequest request) {
        try {
            riskAssessmentService.saveAssessment(request);
            return Result.success("评估结果保存成功");
        } catch (Exception e) {
            return Result.error("保存评估结果失败: " + e.getMessage());
        }
    }
} 