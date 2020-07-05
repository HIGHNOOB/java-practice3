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
			System.out.println("[����]Ÿ�Ӽ����Դϴ�.");
			socket = listener.accept();
			System.out.println("[����]����Ǿ����ϴ�.\n500ms���� ���� �����ϴ�.");
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
			System.out.printf("�����մϴ�.%n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��Ͽ����ϴ�.");
			}
		}

	}

}
