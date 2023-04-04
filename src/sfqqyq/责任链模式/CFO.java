package sfqqyq.责任链模式;

public class CFO {
    private String name;

    public CFO(String name) {
        this.name = name;
    }

    public boolean approve(int amount){
        if(amount<10000){
            System.out.println("审批通过，总监：["+name+"]");
            return true;
        }else {
            System.out.println("驳回申请，总监：["+name+"]");
        }
        return false;
    }
}
