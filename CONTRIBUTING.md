1、完成第一个微服务以及它的调用者Consumer

2、进行代码重构，将重复使用的实体类封装到cloudCommonApis中，并package成本地的jar包，在使用到这些实体类的moudle中的pom.xml文件中引入

3、修复在代码重构时遗留的一个问题，服务类中的@MapperScan()扫描的包路径发生了改变，但是代码中没有修改导致Mapper扫描不到的问题

4、Eureka服务注册中心的引入，并将原本提供服务的那一部分注入到服务注册中心中。同时因为SpringBoot版本和Eureka版本不适配的原因，降低SpringBoot的版本为2.5.1，可以成功使用Eureka服务注册中心

5、进行eureka集群环境的搭建，一共两个服务注册中心，eureka7001和eureka7002，并完成测试

6、增加第二台server服务，并开启负载均衡（默认的负载均衡采用的是轮询的方式）

7、增加获取服务提供者详细信息的方法，可通过localhost:8001/payment/discovery 测试，查看服务提供者所提供的详细信息

8、添加Zookeeper使用案例，开始使用Zookeeper的服务

9、添加Zookeeper Consumer案例，并完成配置，测试通过

10、在Windows本地完成Consul环境的搭建，并完成Server案例、配置、测试通过

11、Consul 客户端和服务端的搭建以及运行

12、修复consumer order出现的问题，删除原有moudel，新建moudel解决
