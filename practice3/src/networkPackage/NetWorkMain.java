package networkPackage;

import java.net.InetAddress;//InetAddress�� import ���ݴϴ�
import java.net.UnknownHostException;//UnknownHostException�� import ���ݴϴ�

public class NetWorkMain {
	
	public static void main(String[] args)throws UnknownHostException {	
		
		System.out.printf("NetWork Practice1\n");
        InetAddress local = InetAddress.getLocalHost();//���� local�� InetAddress.getLocalHost();�� �ʱ�ȭ �մϴ�.
        System.out.println(local.getHostAddress());//local.getHostAddress()�� ���� �ڽ��� ��ǻ���� ip�� �� �� �ֽ��ϴ�
    }
}

