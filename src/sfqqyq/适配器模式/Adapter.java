package sfqqyq.适配器模式;

public class Adapter implements TriplePin{

    private DualPin dualPinDevice;

    public Adapter(DualPin dualPinDevice) {
        this.dualPinDevice = dualPinDevice;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPinDevice.electrify(l,n);
    }
}
