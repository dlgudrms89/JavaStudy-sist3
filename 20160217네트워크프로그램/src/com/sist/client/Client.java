package com.sist.client;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class Client extends JFrame implements ActionListener, Runnable{
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	String name;

	//네트워크
	Socket s;
	BufferedReader in; //서버로 부터 값을 읽어옴
	OutputStream out; //서버로 보냄
	public Client()
	{
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		ta.setEditable(false);
		tf=new JTextField(20);
		tf.setEnabled(false);
		b1=new JButton("접속");
		b2=new JButton("종료");
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		add("Center",js);
		add("South", p);
		setSize(450,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)//접속
		{
			name=JOptionPane.showInputDialog("대화명 : ");
			try
			{
				s=new Socket("211.238.142.39",33333);
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//메모리 읽기
				out=s.getOutputStream();
			}catch(Exception ex){}
			b1.setEnabled(false);
			tf.setEnabled(true);
			tf.requestFocus();
			new Thread(this).start();
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText().trim(); //채팅 보내기
			if(msg.length()<1)
				return;
			try
			{
				out.write(("["+name+"]"+msg+"\n").getBytes());
			}catch(Exception ex){}
		}
		else if(e.getSource()==b2)
		{
			
		}
	}
	//서버로부터 값을 받아서 출력
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();//서버로부터 받아서
				ta.append(msg+"\n");//텍스트필드에 출력
			}
		}catch(Exception ex){}
	}

}
