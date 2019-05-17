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

```
## 3、Eureka的概念
```
Eureka是Nteflix的一个子模块，是一个基于REST的服务，用于定位服务，以实现云端中间服务层发现与故障转移。只需要使用服务的标识符，就可以访问到服务，而不需要修改服务调用的配置文件。