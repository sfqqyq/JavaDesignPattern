package sfqqyq.代理模式.动态代理;

public class Switch implements Intranet{
    @Override
    public void fileAccess(String path) {
        System.out.println("范问内网："+path);
    }
}
