# dubbo-scaffold
一个基于ssm+dubbo的脚手架，还在持续更新中......

# 服务列表服务

| 项目      |  描述 | 端口 | 备注  |
| :-------- | --------:| :--: | ---- |
| scaffold-common | 依赖 |  无  |  公共服务包  |
| scaffold-parent | 父控项目，用来管理mave依赖的jar的版本 | 无 | 父控  |
| user-service | dubbo服务 | 20880 | 用户服务 |
| business-service | dubbo服务 | 20881 |  |
| business-activity | 服务  | 8081 |  web |
|  |  |  |  |

# ------scaffold-parent  
------|---scaffold-dubbo   
------|---scaffold-web  

# ------|----|---user-service   
------|----|---|---user-api  
------|----|---|---user-provider

# ------|----|---business-service   
------|----|---|---business-api  
------|----|---|---business-provider

# ------|----|---business-web



