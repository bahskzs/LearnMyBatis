# MyBatis从0到小白新手入门

本次实验包含:
- MyBatis的环境搭建
- 对数据库的CRUD
- 逆向工程生成代码
- MyBatis集成Spring
- 如何配置MyBatis多源数据库
- 搭建MyBatis源码环境开发

### 0. 学习MyBatis的前世今生

    核心原因 ：探索新知识的爱好(对为接触者来说) + 工作需要 + 更高效率的开发
    
    学生时代，但凡上过JavaEE(暴露年龄的叫法,现在是叫JakartaEE)课程的计算机专业
    同胞们，多半都见过也写过JDBC。
    
    JDBC到底好不好，此处为个人见解。每次重复的代码，但是省又不能省，连接是开了关，关了开。
    工具类里边的地址，用户，密码等等一旦进行变动，就得重新编译。大写的惨！！！
    
    这个问题毕竟已经存在了非常久，那么势必有很多人发现并试图解决它。多年来大神们各显神通，
    各类框架百花齐放。MyBatis则正是其中的一种。
    
    那么问题来了，为啥选MyBatis,仅仅只是赶时髦嘛？
    
    MyBatis到底和其他框架有何处不同，此处简单说明一下。
    
    学习一样新事物，多半会从学习成本上来考虑，MyBatis通过简单的配置，便于修改的sql配置
    以及清晰的原理在众多框架之中脱颖而出。只要有一定的文档阅读能力，有一定的sql基础，
    就能轻松的入门。这也就是本次实验的由来了。

### 1. MyBatis的环境搭建

---

######1.1 MyBatis简介
    
    MyBatis原名iBatis, 更名原因 -->代码从Google Code搬迁到了github。
    iBatis 是 Internet + abatis的结合
    
######1.2 搭建环境的两种方式
1.2.1 jar包

|序号| 名称 | 用途 |
|  ----  | ----  | ----
| 1 | mybatis | MyBatis的核心包
| 2 | mysql-connector-java | 数据库连接驱动
| 3 | log4j | 日志
| 4 | junit | 单元测试



1.2.2 maven工程

|序号| 名称 | 用途 |
|  ----  | ----  | ----
| 1 | mybatis | MyBatis的核心包
| 2 | mysql-connector-java | 数据库连接驱动
| 3 | log4j | 日志
| 4 | junit | 单元测试


tips: 如何知道需要的依赖包有哪些?  
https://mvnrepository.com/ 
首先得知: 

1.要搭建MyBatis肯定需要MyBatis的核心包
可以在网站上检索MyBatis 挑选是官方出品的可以根据简介挑出我们可能需要的包

######1.3 MyBatis为什么开始流行? 在ORM框架中的优势?


### 2. 对数据库的CRUD

---

###### 2.1 新增记录
