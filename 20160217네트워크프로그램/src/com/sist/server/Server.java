package com.sist.server;
/*
 * 	1) ���� ����
 * 		= ServerSocket (��ȯ����)
 * 		= Socket (��� ����)
 * 
 * 		ServerSocket ss=new ServerSocket(PORT); =>����Ʈ50����� ���� ����
 * 		==> bind() => Socket�� ip,port�� �ɾ��ش�
 * 					  (��ȭ�ⰳ��)
 * 			listen() => ������
 * 	2) ������ => ���ӽ� ó��
 * 		ss.accept(); => Ŭ���̾�Ʈ�� ������ ���� ��쿡�� ȣ��(��ȣ)
 * 		accept() => ������ : Ŭ���̾�Ʈ�� ����
 * 		*****port(����: ����, Ŭ���̾�Ʈ : �ӽ�(�ڵ�����))
 * 		port : 0~65535(0~1023)
 * 		�޸𸮿� Ŭ���̾�Ʈ ������ ����
 * 	====================================
 * 	�����尡 ����(���)
 * 	BufferedReader : ��û�� �޴´� : readLine
 * 		ó��
 * 	OutputStream : ������� ���� : write
 * 	close() : ����
 * 	====================================
 * 
 */
import java.net.*;
import java.io.*;
import java.util.*;
public class Server implements Runnable{
	ServerSocket ss;
	Vector<Client> waitVc=new Vector<Client>(); //Ŭ���̾�Ʈ ���� ����
	
	//��������
	public Server()
	{
		try
		{
			ss=new ServerSocket(33333);
			//bind(), listen() : ���� ���� �� ������
			System.out.println("Server Start...");
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
	}
	//����ó��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				// s : Ŭ���̾�Ʈ��  ip, port
				Client client=new Client(s);
				//��Ž���
				client.start();
				waitVc.addElement(client);
			}
		}catch(Exception ex){}
	}
	////////////////ServerSocket
	/////��� ����
	class Client extends Thread
	{
		Socket s; //��ȭ��
		BufferedReader in; //�ް�
		OutputStream out; //�ְ�
		public Client(Socket s)//���� �غ�
		{
			// �о���� �޸� ��ġ in
			// �����ϴ� �޸� ��ġ out
			try
			{
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//�޸� �б�
				out=s.getOutputStream();
			}catch(Exception ex){}
		}
		//���
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					for(Client client:waitVc)
					{
						client.out.write((msg+"\n").getBytes()); //���ڿ��� ����Ʈ�� �ٲ㼭 ����
					}
				}
			}catch(Exception ex){}
		}
	}
}
