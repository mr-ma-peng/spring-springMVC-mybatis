# spring-springMVC-mybatis
## spring
### BeanFactory（工厂模式，bean的生成，加载，维护）:
接口：org.springframework.beans.factory.BeanFactory
实现类：org.springframework.beans.factory.xml.XmlBeanFactory

getBean(String name）：根据Bean的id生成该Bean的对象
getBean(String name,Class requiredType）：根据Bean的id和相应类生成该Bean的对象

### ApplicationContext 高级功能容器 
实现类：
FileSysternXmlApplicationContext：从文件系统中的XML文件加载上下文信息
ClassPathXmlApplicationContext： 从类路径中的XML文件加载上下文信息
XmlWebApplicationContext：从 Web系统中的XML文件加载上下文信息


### 装配方式
XML装配：设值注入，构造注入
annotation转配：
