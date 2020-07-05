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
			System.out.println("서버에 접속하였습니다.");
			System.out.print("서버의 시간: ");
			while(true) {
				int inputMessage = in.read();
				System.out.printf(" " + inputMessage);
				
				if(inputMessage >= 19) {
					break;
				}
			}
			System.out.printf("\n연결을 종료합니다.\n");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch(IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생하였습니다.");
			}
		}
	}
}