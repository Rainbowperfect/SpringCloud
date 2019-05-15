# SpringCloud
study for myself

## 1、SpringCloud的主要组件
```
服务注册中心：SpringCloud Netflix Eureka;服务监控:Spring Boot Admin; 断路器:Netflix Hysterix:
服务网关：Netflix zuul;  服务跟踪：sleuth;  消息总线：Bus; 数据流:Stream
```
## 2、springCloud与Dubbo的区别
```
SpringCloud抛弃了Dubbo的RPC通信，采用的是HTTP的REST的方式，相对而言比RPC更加灵活，不存在代码级别的强依赖
