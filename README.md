# 2023software
2023年软件生产实训（SDUST）  
分数构成：40%千峰分数，30%答辩，%30%报告  
[git下载地址]：https://git-scm.com/download/win  
Author：Sught
--------
**数据库设计**

JAVA电商类项目，从需求分析角度来讲，较为简易。  
数据库已经设计好了  
软件的成功与否，关键在于数据库的设计。  
数据表结构：1对1（使用少）,1对多（类别--商品），多对多（学生选课：学生-课程）。  
e.g.购物车:一人一车，车里很多商品。  
select * from 左表 left join 右表 on 条件  
关联查询的结果：变成一张表（视图）  
视图只能用于查询，不能修改、添加、删除


**编码阶段**

前后台模式：  
前台：微信小程序（手机）(1人)  
后台：传统界面（2人）  
使用GIT进行版本控制


**测试**

人工测试，无问题则打包发布。发布到云端服务器。
讲了一堆服务器的东西。  
快速部署工具e.g.[宝塔]：https://www.bt.cn/new/index.html  


**环境要求**

java JDK Version 1.8/11（版本不同可重复安装）
mysql   
1.原生安装(难卸载)（不可重复安装）（卸载需要删除注册表）  
2.集成安装[phpstudy]：https://www.xp.cn/download.html  
（安装环境下不能有中文）默认端口3306，密码root或无密码，mysql5.7，工具：navicat\SQLyog\ *HeidiSQL*  
*闲的没事别乱改数据库，乱改的一律打死*  
所有软件系统都有用户表，工具类除外。  
用户表：存在权限控制，一般由三张表来控制（User,role,permission）（分别代表人、角色、权限，而且user与role是多对多关系，role与ppermission也是多对多关系），但是在小项目中，加入一status字段即可，比较简单。  
数据渲染：FreeMarker Java数据-->web网页 同类有thymeleaf，语法较为困难
数据库表扩展至10张，可做：关注表（人或店铺）  
IDE选择IDEA 版本：1.买不起的专业版2.low逼用的社区版3.根本找不到的教育版，社区版是专业版的阉割版。XD，有些功能没有，比如写前端的时候没有提示（TAB）没得补全。  
社区版没有Spring的项目创建选项XD，这次用的SSM，springMVC+spring+MyBatis（jdbc的封装+xmlxieSQL+注解写SQL）  
SpringBoot：springMVC+spring+自带的Tomcat，本身不是web项目，呈现效果为一个java项目。  
做前后端分离，要用框架，Vue+ElementUI  
SpringCloud太难，别乱搞  


**项目相关**

项目名：shop  
构建工具：maven  
group：com.xx（com代表company，举例com.qianfeng.shop）  
jdk：1.8  
java：8  
打包：jar  

SpringBoot：2.7.13 *（保持网络畅通！）*  
每日完成且可以成功运行的代码包将以新分支的形式发布，预计发布至7.15日。

