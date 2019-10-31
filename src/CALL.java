public class CALL {
    public static void main(String[] args) {
        JUNK_KOOK JK=new JUNK_KOOK();
        JK.setCallBack(new Alen());
        JK.setCallBack(new BackInterface() {
            @Override
            public void reply() {
                System.out.println("Alen:在你打电话之前我已经做好啦");
            }
        });
        JK.ask();
        JK.evaluate();
    }
}
