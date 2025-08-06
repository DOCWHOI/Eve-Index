@echo off
echo 启动风险监控系统...

echo.
echo 1. 启动后端服务...
cd backend
start "Spring Boot Backend" cmd /k "mvn spring-boot:run"
cd ..

echo.
echo 2. 启动前端服务...
cd frontend
start "Vue Frontend" cmd /k "npm run dev"
cd ..

echo.
echo 系统启动完成！
echo 前端地址: http://localhost:3000
echo 后端地址: http://localhost:8080
echo.
pause 