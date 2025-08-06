# 风险监控系统安装指南

## 系统要求

### 硬件要求
- CPU: 2核心以上
- 内存: 4GB以上
- 硬盘: 10GB可用空间

### 软件要求
- 操作系统: Windows 10/11, Linux, macOS
- Node.js: 16.0.0 或更高版本
- Java: 17 或更高版本
- MySQL: 8.0 或更高版本
- Maven: 3.6 或更高版本

## 安装步骤

### 1. 环境准备

#### 安装Node.js
1. 访问 https://nodejs.org/
2. 下载并安装LTS版本
3. 验证安装: `node --version` 和 `npm --version`

#### 安装Java
1. 下载OpenJDK 17或Oracle JDK 17
2. 安装并配置JAVA_HOME环境变量
3. 验证安装: `java --version`

#### 安装MySQL
1. 下载MySQL 8.0
2. 安装并设置root密码
3. 启动MySQL服务
4. 验证连接: `mysql -u root -p`

#### 安装Maven
1. 下载Maven 3.6+
2. 配置MAVEN_HOME环境变量
3. 验证安装: `mvn --version`

### 2. 项目部署

#### 克隆项目
```bash
git clone <repository-url>
cd Eveindex
```

#### 初始化数据库
```bash
mysql -u root -p < database/init.sql
```

#### 配置数据库连接
编辑 `backend/src/main/resources/application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/risk_monitoring?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8
    username: your_username
    password: your_password
```

#### 安装前端依赖
```bash
cd frontend
npm install
```

#### 安装后端依赖
```bash
cd backend
mvn clean install
```

### 3. 启动服务

#### Windows系统
```bash
start.bat
```

#### Linux/Mac系统
```bash
chmod +x start.sh
./start.sh
```

#### 手动启动
```bash
# 启动后端
cd backend
mvn spring-boot:run

# 启动前端（新终端）
cd frontend
npm run dev
```

### 4. 验证安装

1. 访问前端: http://localhost:3000
2. 访问后端API: http://localhost:8080/api
3. 检查数据库连接是否正常

## 配置说明

### 前端配置
- 开发服务器端口: 3000
- API代理配置: `frontend/vite.config.ts`
- 环境变量: 创建 `.env` 文件

### 后端配置
- 服务端口: 8080
- 数据库配置: `backend/src/main/resources/application.yml`
- 日志配置: 默认输出到控制台

### 数据库配置
- 数据库名: risk_monitoring
- 字符集: utf8mb4
- 时区: GMT+8

## 故障排除

### 常见问题

#### 1. 端口被占用
```bash
# Windows
netstat -ano | findstr :3000
netstat -ano | findstr :8080

# Linux/Mac
lsof -i :3000
lsof -i :8080
```

#### 2. 数据库连接失败
- 检查MySQL服务状态
- 验证用户名密码
- 确认数据库已创建

#### 3. 依赖安装失败
```bash
# 清理缓存
npm cache clean --force
mvn clean

# 重新安装
npm install
mvn clean install
```

#### 4. 内存不足
- 增加JVM内存: `-Xmx2g`
- 增加Node.js内存: `--max-old-space-size=2048`

### 日志查看

#### 前端日志
```bash
# 开发模式
npm run dev

# 生产模式
npm run build
npm run preview
```

#### 后端日志
```bash
# 查看控制台输出
mvn spring-boot:run

# 查看日志文件
tail -f logs/backend.log
```

## 性能优化

### 前端优化
- 启用gzip压缩
- 使用CDN加速
- 代码分割和懒加载

### 后端优化
- 配置数据库连接池
- 启用缓存机制
- 优化SQL查询

### 数据库优化
- 创建合适的索引
- 定期维护表结构
- 监控慢查询

## 安全配置

### 前端安全
- 启用HTTPS
- 配置CORS策略
- 输入验证和过滤

### 后端安全
- 配置防火墙规则
- 使用HTTPS
- 实现认证授权

### 数据库安全
- 设置强密码
- 限制访问IP
- 定期备份数据

## 维护指南

### 日常维护
- 监控系统运行状态
- 检查日志文件
- 备份重要数据

### 定期维护
- 更新依赖包
- 清理临时文件
- 优化数据库

### 故障恢复
- 恢复数据库备份
- 重启服务
- 检查配置文件

## 联系支持

如遇到问题，请提供以下信息：
- 操作系统版本
- 错误日志
- 复现步骤
- 环境配置 