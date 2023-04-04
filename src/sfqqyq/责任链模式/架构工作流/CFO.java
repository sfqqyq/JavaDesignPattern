package sfqqyq.责任链模式.架构工作流;

public class CFO extends Approver{

    public CFO(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if(amount<10000){
            System.out.println("审批通过，总监：["+name+"]");
        }else {
            System.out.println("驳回申请，总监：["+name+"]");
        }
    }
}
