package networkPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
 
     
 
public class SleepTest {
 
    public static void main(String[] args) throws InterruptedException {         
         
        int num = 100 ;         
        // �ð� ��� ����
        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");         
         
        for(int i=0; i < num; i++){             
            Calendar cal = Calendar.getInstance() ;             
            // �ֿܼ� ��� (����ð� + i )
            System.out.println(fmt.format(cal.getTime()) + "=" + i) ;             
            // 1�ʰ� ������Ų��.(���� : �и�������)
            Thread.sleep(1000);
                          
        }         
    }
}
