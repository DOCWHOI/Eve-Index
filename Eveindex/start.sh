#!/bin/bash

echo "启动风险监控系统..."

echo ""
echo "1. 启动后端服务..."
cd backend
nohup mvn spring-boot:run > ../logs/backend.log 2>&1 &
BACKEND_PID=$!
cd ..

echo ""
echo "2. 启动前端服务..."
cd frontend
nohup npm run dev > ../logs/frontend.log 2>&1 &
FRONTEND_PID=$!
cd ..

echo ""
echo "系统启动完成！"
echo "前端地址: http://localhost:3000"
echo "后端地址: http://localhost:8080"
echo "后端PID: $BACKEND_PID"
echo "前端PID: $FRONTEND_PID"
echo ""
echo "日志文件位置:"
echo "后端日志: logs/backend.log"
echo "前端日志: logs/frontend.log"
echo ""
echo "停止服务请运行: ./stop.sh" 