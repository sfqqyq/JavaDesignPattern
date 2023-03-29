package sfqqyq.代理模式;

import java.util.Arrays;
import java.util.List;

public class RouterProxy implements Internet{

    private Internet modem;//被代理的对象
//    private List<String> blackList= Arrays.asList("电影","游戏","音乐","小说");

    public RouterProxy() throws Exception {
        this.modem=new Modem("123456");
    }

    @Override
    public void httpAccess(String url) {
        // 遍历黑名单
//        for (String keyword : blackList) {
//            if(url.contains(keyword)){// 查看是否包含黑名单
//                System.out.println("禁止访问："+url);
//                return;
//            }
//        }

        modem.httpAccess(url);// 转发请求至"猫"以访问互联网

    }
}
