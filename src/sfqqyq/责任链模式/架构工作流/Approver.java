package sfqqyq.责任链模式.架构工作流;

public abstract class Approver {

    protected String name;// 审批人姓名
    protected Approver nextApprover;// 下一位审批人

    public Approver(String name) {
        this.name = name;
    }

    public Approver setNextApprover(Approver nextApprover){
        this.nextApprover=nextApprover;
        return this.nextApprover;// 返回下一位审批人，使其支持链式编程
    }

    public abstract void approve(int amount);// 抽象具体方法由具体审批人子类实现

}
