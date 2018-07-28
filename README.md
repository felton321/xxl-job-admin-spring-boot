# xxl-job-admin-spring-boot

#### 简介
---
xuxueli的xxl-job-admin默认为war包发布，需要放置到容器中，而spring boot “not war， just run jar！”的口号使我们早已习惯了java -jar 启动web服务的清爽简洁，因此我将xxl-job-admin改造到spring boot框架，公司目前正在使用。

#### 版本
---
1. spring-boot: 1.5.14.RELEASE
2. xxl-job-core: 1.9.1

#### 使用步骤：
---
1. 首先感谢xuxueli的开源奉献。
2. 进入xxl-job的源项目：[https://github.com/xuxueli/xxl-job](https://github.com/xuxueli/xxl-job) ,
   选择1.9.1的tag并下载：[https://github.com/xuxueli/xxl-job/tree/v1.9.1](https://github.com/xuxueli/xxl-job/tree/v1.9.1)
3. 运行 `mvn clean deploy` 安装到仓库中，我们需要xxl-job-core 子模块。
4. 下载本项目
5. 将resources/application-dev.yml中的配置改为自己的配置即可，对应内容可参考xxl-job官方文档: [http://www.xuxueli.com/xxl-job/#/](http://www.xuxueli.com/xxl-job/#/)
6. IDE中直接运行运行 `com.github.xxl.job.admin.Application` 即可.
7. 访问网站：[http://localhost:9000/](http://localhost:9000/)
8. 如有问题请联系: felton321@sina.com
