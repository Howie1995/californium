#说明
项目源地址：https://github.com/eclipse/californium
原项目是 [RFC7252 - Constrained Application Protocol](http://tools.ietf.org/html/rfc7252) 进行了实现，这里因为业务需要在原项目基础上添加了自己的业务逻辑，
整体流程应该和阿里云的Coap服务一致，想快速了解流程可以看看阿里云介绍

在接下来时间里应该会有几篇文章，一个是对整个项目的数据流通流程做一个介绍，还有他路由转发的思路，还有就是我在其基础上做的改造的思路

项目架构图

![MQS_COAP](https://img-blog.csdnimg.cn/2019091009394829.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RyZWFtX19Tbm93,size_16,color_FFFFFF,t_70)
