package sfqqyq.适配器模式;

public class Client {
    public static void main(String[] args) {
        // TriplePin tv = new TV(); 接口不兼容
        // 通用适配器
        DualPin dualPinDevice=new TV();
        TriplePin triplePin= new Adapter(dualPinDevice);
        triplePin.electrify(1,0,-1);

        //电视机专属适配器
        TVAdapter tvAdapter = new TVAdapter();
        tvAdapter.electrify(1,0,-1);

    }
}
