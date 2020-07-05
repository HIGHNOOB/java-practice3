package networkPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
 
     
 
public class SleepTest {
 
    public static void main(String[] args) throws InterruptedException {         
         
        int num = 100 ;         
        // 시간 출력 포맷
        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");         
         
        for(int i=0; i < num; i++){             
            Calendar cal = Calendar.getInstance() ;             
            // 콘솔에 출력 (현재시간 + i )
            System.out.println(fmt.format(cal.getTime()) + "=" + i) ;             
            // 1초간 중지시킨다.(단위 : 밀리세컨드)
            Thread.sleep(1000);
                          
        }         
    }
}
