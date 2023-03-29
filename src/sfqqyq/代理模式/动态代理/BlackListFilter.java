package sfqqyq.代理模式.动态代理;

import sfqqyq.代理模式.Internet;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class BlackListFilter implements InvocationHandler {

    private List<String> blackList= Arrays.asList("电影","游戏","音乐","小说");

    private Object origin;

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启黑名单过滤功能......");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 切入"方法面"之前的过滤器逻辑
        String arg = args[0].toString();
        // 遍历黑名单
        for (String keyword : blackList) {
            if(arg.contains(keyword)){// 查看是否包含黑名单
                System.out.println("禁止访问："+arg);
                return null;
            }
        }
        // 调用被代理对象的方法
        System.out.println("校验通过，转向实际业务......");
        return method.invoke(origin,arg);
    }
}
