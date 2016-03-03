package com.sist;
import java.awt.*;
import javax.swing.*;
public class UserSelect extends JFrame {
	JLabel la1,la2,la3;
	public UserSelect()
	{
		la1=new JLabel(new ImageIcon("c:\\이미지\\b.png"));
		la2=new JLabel(new ImageIcon("c:\\이미지\\c.png"));
		la3=new JLabel(new ImageIcon("c:\\이미지\\a.png"));
		JPanel p=new JPanel();
		p.add(la1);
		p.add(la2);
		p.add(la3);
		add("Center",p);
		setSize(400,160);
//		setVisible(true);
	}
}
