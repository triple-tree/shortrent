# Get Started

## 写在前面的东西
这是一个使用Srping Boot搭建的项目，类似于Ruby on rails一样的理念——约定优于配置，即很多配置项都直接使用Spring Boot默认配置的，这样就不需要自己做很多配置项，使用默认优化过的配置项
- 项目配置文件是`src/main/resources/application.properties`，里面最小配置是配置mysql相关信息
- 项目静态资源位于`src/main/resources/static`，例如这个目录下放了一个jquery.js，那访问网址是`/jquery`，后面需要把这些静态资源提取出来，使用专业的处理静态资源的服务器，如nginx
- 项目动态页面的模板位于`src/main/resources/templates`，项目使用thymeleaf，这是一种对页面设计人员及开发人员友好的模板引擎，可以方便的预览及修改
- 项目代码结构采用分层的结构，项目主包是`com/tripletree`，下面`entity`存放实体类，`repository`里存放DAO的代码，`service`封装repository，`web`即是controller层的代码，`api`里面放置restful接口的代码，现在项目还很小，后期项目规模变大之后可以在这下面新建一级目录，如`web/user/`

## 本地开发须知
- 首先git clone下载代码
- 使用eclipse或idea导入maven工程，这时会自动下载依赖库，首次需要较长时间，和网速有关，也可以在外面terminal中执行`mvn dependency:resolve`下载，可以用这种方式来排查错误
- 我们以后尽量使用`bower`以及`bower-installer`管理和安装前段依赖库
- 本地需要搭建一个mysql服务器，使用共享的互联网上的虽然也可以，但网速连接有点慢，不方面开发，并且一开始需要创建一个`shortrent`数据库，不然通过`mvn spring-boot:run`启动项目的时候会报错

