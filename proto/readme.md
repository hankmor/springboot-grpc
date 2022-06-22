说明
----

1. 前提
* 接口定义文件 .proto 必须放到 /src/main/proto 目录下

2. 依赖：

1）protobuf-java：用于生成 proto 中 service 的 java 代码，没有则不能生成 `XxxRpc.java`

2）插件：依赖两个插件，

* os-maven-plugin：读取操作系统配置的插件，需要读取os.detected.classifier参数
* protobuf-maven-plugin：根据proto生成代码，包括message对应的类和service对应的类

3. 编译生成 java 文件

* protobuf:compile 生成 message 对应的java类到 target/generated-sources/protobuf/java 下，相当于执行了 `protoc` 命令来编译
* protobuf:compile-custom 此时会调用 protobuf-java 包生成 service 的 java 类到 target/generated-sources/protobuf/grpc-java 下
