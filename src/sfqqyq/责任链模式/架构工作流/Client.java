package sfqqyq.责任链模式.架构工作流;

public class Client {
    public static void main(String[] args) {
        Approver flightJohn = new Staff("张飞");
        flightJohn.setNextApprover(new Manager("关羽")).setNextApprover(new CFO("刘备"));

        flightJohn.approve(1000);
        /**
         * 无权审批,请找上级，专员：[张飞]
         * 审批通过，经理：[关羽]
         */

        flightJohn.approve(4000);
        /**
         * 无权审批,请找上级，专员：[张飞]
         * 审批通过，经理：[关羽]
         */

        flightJohn.approve(9000);
        /**
         * 无权审批,请找上级，专员：[张飞]
         * 无权审批,请找上级，经理：[关羽]
         * 审批通过，总监：[刘备]
         */

        flightJohn.approve(88000);
        /**
         * 无权审批,请找上级，专员：[张飞]
         * 无权审批,请找上级，经理：[关羽]
         * 驳回申请，总监：[刘备]
         */

    }
}
