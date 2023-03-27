package sfqqyq.适配器模式;

// TV专属适配器
public class TVAdapter extends TV implements TriplePin{
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l,n);
    }
}
