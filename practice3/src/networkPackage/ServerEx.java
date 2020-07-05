package networkPackage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {

		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999);
			System.out.println("[서버]클라이언트 연결을 기다리는 중");
			socket = listener.accept();
			System.out.println("[서버]연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("끝")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				System.out.println("... " + inputMessage);
				/*
				System.out.print("보내기>>");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + '\n');
				out.flush();
				*/
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch(IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생하였습니다.");
			}
		}

	}

}
