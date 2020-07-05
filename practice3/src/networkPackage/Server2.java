package networkPackage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) throws InterruptedException {

		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999);
			System.out.println("[서버]타임서버입니다.");
			socket = listener.accept();
			System.out.println("[서버]연결되었습니다.\n500ms마다 수를 보냅니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			int serverTime = 0;
			while (true) {
				if (serverTime >= 19) {
					out.write(serverTime);
					out.flush();
					break;
				}
				out.write(serverTime);
				out.flush();
				serverTime++;
				Thread.sleep(500);
			}
			System.out.printf("종료합니다.%n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생하였습니다.");
			}
		}

	}

}
