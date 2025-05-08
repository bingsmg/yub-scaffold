```text
yub-scaffold/
├── build.gradle
├── settings.gradle
├── platform/                 # 平台基础模块，放通用配置、工具类、通用异常处理等
│   ├── platform-common/      # 通用工具类、枚举等
│   └── platform-config/      # 通用配置类（如 Redis、Jackson、跨域、统一异常等）
├── app-service/              # 所有的服务模块 xxx-api+xxx-service 放在该目录下
│   ├── user-api/             # 对外接口定义模块，定义 Feign 接口 + DTO等...
│   └── user-service/         # 具体服务类，包含配置接口实现等...
|—— app-ui/                   # 所有 ui 模块 xxx-ui 放在该目录下
│   |__user-ui/              # 具体的 ui 模块
├── gateway/                  # 微服务网关模块（如 Spring Cloud Gateway）
└── docs/                     # 项目说明文档
|__ db/                       # 项目 db 文件
|__ deploy/                   # 项目部署文件
```

## 命名规范
统一响应：
- R
- ApiResponse

分页结果：
- PageResult

全局异常处理：
- GlobalExceptionHandler 

