package com.qiuqi.mark.service.DesignPatterns.statePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/4/20 4:02 PM
 */

class NoHavePackstate extends AbstractState{

    private Context mcontext;

    public NoHavePackstate(Context context) {
        mcontext = context;
    }
    @Override
    public void uploadInstallPack(String path) {
        System.out.println("uploading pack");
        mcontext.setMState(mcontext.getWaitForInstallState());
    }
}

class WaitForInstallState extends AbstractState {

    private Context mcontext;

    public WaitForInstallState(Context context) {
        mcontext = context;
    }
    @Override
    public void uploadInstallPack(String path) {
        System.out.println("the installpack is existestd");
    }

    @Override
    public void install() {
        try {
            System.out.println("start installing");
            mcontext.setMState(mcontext.getWaitForStartState());
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}

class WaitForStartState extends AbstractState {

    private Context mcontext;

    public WaitForStartState(Context context) {
        mcontext = context;
    }

    @Override
    public void startProduct() {
        System.out.println("starting product");
        mcontext.setMState(mcontext.getRuningState());
    }
}

class RuningState extends AbstractState {

    private Context mcontext;

    public RuningState(Context context) {
        mcontext = context;
    }
}
