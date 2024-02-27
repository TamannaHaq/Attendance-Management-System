
import java.lang.System.Logger;
import java.lang.System.Logger.Level;




public class Load {
    public static void main(String args[]) throws InterruptedException{
        LoadingPage Loading=new LoadingPage();
        Loading.setVisible(true);
        Loading.setLocationRelativeTo(null);
        SignUp sign=new SignUp();
        sign.setLocationRelativeTo(null);
        for(int i=0;i<=100;i++){
            try{
            Thread.sleep(20);
            Loading.num.setText(Integer.toString(i)+"%");
            Loading.progress.setValue(i);
            if(i==100){
                Loading.setVisible(false);
                sign.setVisible(true);
            }
        }
            catch(InterruptedException ex){
                Logger.getLogger(Load.class.getName()).log(Level.SEVERE,null,ex);
            }
    }
}
}

