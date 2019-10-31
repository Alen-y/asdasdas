public class JUNK_KOOK {
    private  BackInterface callBack;
    void setCallBack(BackInterface callBack){
        this.callBack=callBack;
    }
    public  void  ask(){
        System.out.println("JK:我马上回家了，可以做饭了");
        callBack.reply();
    }
    public void evaluate(){
        System.out.println("JK:Alen真棒");
    }
}
