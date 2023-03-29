package sfqqyq.代理模式;

import sfqqyq.代理模式.动态代理.BlackListFilter;
import sfqqyq.代理模式.动态代理.Intranet;
import sfqqyq.代理模式.动态代理.Switch;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) throws Exception {

        System.out.println("----访问外网");
        Internet internet=(Internet)Proxy.newProxyInstance(
                RouterProxy.class.getClassLoader(),
                RouterProxy.class.getInterfaces(),
                new BlackListFilter(new RouterProxy()));
        internet.httpAccess("http://www.电影.com");
        internet.httpAccess("http://www.游戏.com");
        internet.httpAccess("http://www.学习.com");
        internet.httpAccess("http://www.工作.com");

        System.out.println("----访问内网");
        Intranet intranet=(Intranet)Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new BlackListFilter(new Switch()));
        intranet.fileAccess("http://www.电影.com");
        intranet.fileAccess("http://www.游戏.com");
        intranet.fileAccess("http://www.学习.com");
        intranet.fileAccess("http://www.工作.com");




    }

    public static void main1(String[] args) throws Exception {
        Internet proxy = new RouterProxy();
        proxy.httpAccess("http://www.电影.com");
        proxy.httpAccess("http://www.游戏.com");
        proxy.httpAccess("http://www.学习.com");
        proxy.httpAccess("http://www.工作.com");
    }

}
