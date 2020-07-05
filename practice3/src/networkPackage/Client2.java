package networkPackage;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {

		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost",9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			System.out.println("������ �����Ͽ����ϴ�.");
			System.out.print("������ �ð�: ");
			while(true) {
				int inputMessage = in.read();
				System.out.printf(" " + inputMessage);
				
				if(inputMessage >= 19) {
					break;
				}
			}
			System.out.printf("\n������ �����մϴ�.\n");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch(IOException e) {
				System.out.println("������ ä�� �� ������ �߻��Ͽ����ϴ�.");
			}
		}
	}
}