
## 基于嵌入式Jetty的Spring MVC应用案例

Spring MVC 3.2.x 版本应用，基于嵌入式Jetty实现。

### 运行
1. `mvn package`
2. `java -jar target/example-spring-jetty-1.0-SNAPSHOT.jar`
3. `查看根信息` [http://localhost:8080](http://localhost:8080)
4. `查看用户` [http://localhost:8080/users](http://localhost:8080/users)
5. `查看images下面的图片` [http://localhost:8080/images/spring_logo.png](http://localhost:8080/images/spring_logo.png)

POST数据示例：`{"id":1111,"name":springmvc,"age":25}`


