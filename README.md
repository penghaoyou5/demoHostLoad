#### 最终实现

最终没有对代码进行任何改动 只是对启动参数作了修改

只用了文章：Read文件夹中 Spring Boot项目在Intellij IDEA 中实现热部署

https://blog.csdn.net/tmaskboy/article/details/78996794
一定要记住是重启iead不是重启项目

#### 解决断点问题
在本类中的断点没有起作用
但是可以调用另一个类，进行断点跳转
例如这个项目中 ： 
更改类com.example.demo.TestRequesController.RequestTest 的方法中不能进行断点 
但是方法内部调用 com.example.demo.SecondCladd.todString 方法可以在此方法中进行断点，
然后断点跟踪到外边的方法即可

###############


//========
验证思路思路：
1.创建启动项目   并在Application中增加两分钟的睡眠时间延长启动
2.创建一个接口 localhost:6093/testhotload 并返回字符串
3.在启动项目后 改变接口中（com.example.demo.TestRequesController.RequestTest）的内容，并马上保存访问，
  看是否改变返回内容判断热加载是否成功

###  最终效果  编译报错 不会热部署  
quedian ? 不能中间人为控制



#### 其他实现方式  要进行项目重启 不适用
idea创建 spring    项目 ：
https://jingyan.baidu.com/article/574c521979f9be6c8d9dc1aa.html
spring boot 热加载：
https://www.jianshu.com/p/6b8cffa252c0

文件网页 ReadMe 中



  
#### 上述方法不通   还是要重新加载初始化   
####  下面进行热部署配置 而不是热加载配置

参考：https://www.cnblogs.com/jiangbei/p/8439394.html
命令行打开


#### 最终实现
https://blog.csdn.net/tmaskboy/article/details/78996794
一定要记住是重启iead不是重启项目# demoHostLoad
# demoHostLoad


提交代码到 git FANGFA 

https://www.cnblogs.com/qcwblog/p/5709720.html