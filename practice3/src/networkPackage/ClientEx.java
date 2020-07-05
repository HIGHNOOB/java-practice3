package networkPackage;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

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
			while(true) {
				System.out.print("텍스트 입력>>");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("끝")) {
					out.write(outputMessage + '\n');
					out.flush();
					break;
				}
				out.write(outputMessage + '\n');
				out.flush();
				/*
				String inputMessage = in.readLine();
				System.out.println("서버: " + inputMessage);
				*/
			}
			System.out.println("연결을 종료합니다.");
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