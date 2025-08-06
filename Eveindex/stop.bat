@echo off
echo 停止风险监控系统...

echo.
echo 1. 停止前端服务...
taskkill /f /im node.exe 2>nul
taskkill /f /im npm.exe 2>nul

echo.
echo 2. 停止后端服务...
taskkill /f /im java.exe 2>nul

echo.
echo 系统已停止！
echo.
pause