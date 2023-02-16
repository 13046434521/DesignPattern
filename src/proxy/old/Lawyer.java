package proxy.old;

/**
 * @author：TianLong
 * @date：2022/10/24 19:09
 * @detail：
 */
class Lawyer implements ILawyer{
    private ILawyer mILawyer;

    public void setILawyer(ILawyer ILawyer) {
        mILawyer = ILawyer;
    }

    @Override
    public void submit() {
        mILawyer.submit();
    }

    @Override
    public void defend() {
        mILawyer.defend();
    }

    @Override
    public void finish() {
        mILawyer.finish();
    }
}
