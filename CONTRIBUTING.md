1、完成第一个微服务以及它的调用者Consumer

2、进行代码重构，将重复使用的实体类封装到cloudCommonApis中，并package成本地的jar包，在使用到这些实体类的moudle中的pom.xml文件中引入

3、修复在代码重构时遗留的一个问题，服务类中的@MapperScan()扫描的包路径发生了改变，但是代码中没有修改导致Mapper扫描不到的问题

4、
