这一篇是JNDIRMI JNDILDAP的学习
几个重点吧：
（1）jdk得是低版本的，我这里是1.8.0_65
(2)和原生RMI一样，先开启RMI服务端，再开启JNDIRMI服务端，最后客户端可以发现恶意类攻击执行了
（3）LDAP这里没有用JAVA打开，用了一个apache ldap服务器
