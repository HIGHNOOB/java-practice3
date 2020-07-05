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
			System.out.println("������ �����Ͽ����ϴ�.");
			while(true) {
				System.out.print("�ؽ�Ʈ �Է�>>");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("��")) {
					out.write(outputMessage + '\n');
					out.flush();
					break;
				}
				out.write(outputMessage + '\n');
				out.flush();
				/*
				String inputMessage = in.readLine();
				System.out.println("����: " + inputMessage);
				*/
			}
			System.out.println("������ �����մϴ�.");
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