注意的问题：
1.如果使用https，则用jdk生成的证书的firstnamelastname必须是 域名（这firstnamelastname也是cas服务器地址），而不能是ip，否则在handleshake时会报错。
2.如果使用https，必须先从cas服务器导出公钥，并放到jre/lib/security下
关于cas 的 clinet和 casserver的证书，请看http://blog.sina.com.cn/s/blog_56d8ea9001017uo4.html
keytool -list -keystore cacerts  查看证书库里边所有证书  ，密码使用  changeit ,这是jdk默认的密码
keytool -list -keystore cacerts -alias  cjTomcat 查看某个证书
keytool -import -alias cjTomcat -keystore cacerts -file a.crt  导入证书 ，密码同样是changeit，不是casserver生成keystore那个。


开始----------参考文章
https://blog.csdn.net/yelllowcong/article/details/79241777
结束！