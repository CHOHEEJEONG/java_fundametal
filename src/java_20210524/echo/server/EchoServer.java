package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;
	public EchoServer(int port) {
		this.port = port;
	}
	public void run() {
		ServerSocket serverSocket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		try {
			//1. ServerSocket 인스턴스 생성한다.
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
		}
		System.out.println("[서버 화면 입니다.]");
		while(true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다...");
			
			try {
				//2.클라이언트 접속을 기다린다.
				//accept() : 클라이언트 접속을 기다리다 클라이언트가 접속하면
				//클라이언트와 통신할 수 있는 Socket객체를 생성해준다.
				Socket socket = serverSocket.accept();
				//4.클라이언트 통신할 수 있는 Socket객체가 생성된다.
				InetAddress i = socket.getInetAddress();
				System.out.println("클라이언트가 접속했습니다[" + i.getHostAddress() + "]");
				//5. Socket를 이용해서 클라이언트와 통신할 수 있는 입출력 스트림 생성
				
				//6-2
				InputStream in = socket.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);

				//6-3
				OutputStream out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);


				while(true) {    //한명이 채팅 안나가면 다른 사람들은 못보냄
					String readLine = br.readLine();
					System.out.println("클라이언트 메세지 : "+ readLine);
					bw.write(readLine);
					bw.newLine();
					bw.flush();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	public static void main(String[] args) {
		//EchoServer변수를 한번 사용할 것이면 아래와 같이 코드 작성
		//원래 하던 같은 의미의 코드는
		//EchoServer echoserver = new EchoServer(3000);
		//echoserver.run(); 와 같이 했었음. 
		new EchoServer(3000).run();
	}
}
