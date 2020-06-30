package networkPackage;

import java.net.InetAddress;//InetAddress를 import 해줍니다
import java.net.UnknownHostException;//UnknownHostException을 import 해줍니다

public class NetWorkMain {
	
	public static void main(String[] args)throws UnknownHostException {	
		
		System.out.printf("NetWork Practice1\n");
        InetAddress local = InetAddress.getLocalHost();//변수 local을 InetAddress.getLocalHost();로 초기화 합니다.
        System.out.println(local.getHostAddress());//local.getHostAddress()로 현재 자신의 컴퓨터의 ip를 알 수 있습니다
    }
}

