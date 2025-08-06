#!/bin/bash

echo "停止风险监控系统..."

# 停止前端服务
echo "停止前端服务..."
pkill -f "npm run dev"
pkill -f "vite"

# 停止后端服务
echo "停止后端服务..."
pkill -f "spring-boot:run"
pkill -f "java.*risk-monitoring"

echo "服务已停止！" 