package sfqqyq.模板方法模式.项目管理模板;

public abstract class PM {

    public abstract String analyze(); // 需求分析
    public abstract String design(String project);// 软件设计

    public abstract String develop(String project);// 代码开发

    public abstract boolean test(String project);// 质量测试

    public abstract void release(String project);// 上线发布

    // 开始
    public final void kickoff(){

        String requirement = analyze();// 软件分析后的要求
        String designCode = design(requirement);
        do{
            designCode = develop(designCode);
        }while (!test(designCode));// 如果测试失败需要修改代码
        release(designCode);
    }

}
