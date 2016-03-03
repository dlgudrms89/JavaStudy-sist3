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

	//��Ʈ��ũ
	Socket s;
	BufferedReader in; //������ ���� ���� �о��
	OutputStream out; //������ ����
	public Client()
	{
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		ta.setEditable(false);
		tf=new JTextField(20);
		tf.setEnabled(false);
		b1=new JButton("����");
		b2=new JButton("����");
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
		if(e.getSource()==b1)//����
		{
			name=JOptionPane.showInputDialog("��ȭ�� : ");
			try
			{
				s=new Socket("211.238.142.39",33333);
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//�޸� �б�
				out=s.getOutputStream();
			}catch(Exception ex){}
			b1.setEnabled(false);
			tf.setEnabled(true);
			tf.requestFocus();
			new Thread(this).start();
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText().trim(); //ä�� ������
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
	//�����κ��� ���� �޾Ƽ� ���
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();//�����κ��� �޾Ƽ�
				ta.append(msg+"\n");//�ؽ�Ʈ�ʵ忡 ���
			}
		}catch(Exception ex){}
	}

}
