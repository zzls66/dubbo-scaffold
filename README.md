# dubbo-scaffold
一个基于ssm+dubbo的脚手架，还在持续更新中......

# 项目列表

| 项目      |  描述 | 端口 | 备注  |
| :-------- | --------:| :--: | ---- |
| scaffold-common | 依赖 |  无  |  公共服务包  |
| scaffold-parent | 父控项目，用来管理mave依赖的jar的版本 | 无 | 父控  |
| user-service | dubbo服务,jar依赖于scaffold-parent的scaffold-dubbo | 20880 |  |
| business-service | dubbo服务,jar依赖于scaffold-parent的scaffold-dubbo | 20881 |  |
| business-activity | 服务,jar依赖于scaffold-parent的scaffold-web  | 8081 |  web |
|  |  |  |  |


| 项目   | 子项目 |  描述 | 端口 | 备注  |
| :-------- | :-------- | --------:| :--: | ---- |
| scaffold-common | scaffold-common | 依赖 |  无  |  公共服务包  |
| scaffold-parent | scaffold-common | 父控项目，用来管理mave依赖的jar的版本 | 无 | 父控  |
|  | scaffold-dubbo | 父控项目，用来管理mave依赖的jar的版本 | 无 | 父控  |
|  | scaffold-web | 父控项目，用来管理mave依赖的jar的版本 | 无 | 父控  |
| user-service | scaffold-common | dubbo服务,jar依赖于scaffold-parent的scaffold-dubbo | 20880 |  |
|  | user-api |  |  |  |
|  | user-provider |  |  |  |
| business-service | scaffold-common | dubbo服务,jar依赖于scaffold-parent的scaffold-dubbo | 20881 |  |
|  | business-api |  |  |  |
|  | business-provider |  |  |  |
| business-web | scaffold-common | web服务,jar依赖于scaffold-parent的scaffold-web  | 8081 |  web |
|  |  |  |  |

------**scaffold-parent**  
------|---scaffold-dubbo   
------|---scaffold-web  

------|----|---**user-service**   
------|----|---|---user-api  
------|----|---|---user-provider

------|----|---**business-service**   
------|----|---|---business-api  
------|----|---|---business-provider

------|----|---**business-web**



