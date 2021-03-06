package com.sist.client;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import com.sist.dao.*;
public class EmpMain extends JFrame implements MouseListener,ActionListener{
	JTable table;
	DefaultTableModel model;
	JLabel la;
	JLabel la1;
	JComboBox box;
	JTextField tf;
	JButton b1,b2;
	public EmpMain()
	{
		String[] col={"사번","이름","직위","입사일","부서번호"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row, col)
		{
			public boolean isCellEditable(int r,int c)
			{
				return false;
			}
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		la=new JLabel("사원목록");
		la.setFont(new Font("맑은 고딕",Font.BOLD,30));
		JPanel p=new JPanel();
		p.add(la);
		
		la1=new JLabel("Search");
		tf=new JTextField(10);
		box=new JComboBox();
		box.addItem("이름");
		box.addItem("입사일");
		box.addItem("부서");
		b1=new JButton("찾기");
		b2=new JButton("목록");
		JPanel p1=new JPanel();
		p1.add(la1);
		p1.add(box);
		p1.add(tf);
		p1.add(b1);
		p1.add(b2);
		add("South",p1);
		
		add("Center",js);
		add("North",p);
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getData();
		table.addMouseListener(this);
		tf.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void getData()
	{
		for(int i=model.getRowCount()-1; i>=0; i--)
		{
			model.removeRow(i);
		}
		EmpDAO dao=new EmpDAO();
		ArrayList<EmpDTO> list=dao.empAllData();
		for(EmpDTO d:list)
		{
			String[] data={
				String.valueOf(d.getEmpno()),//int이므로 String으로 변환
				d.getEname(),
				d.getJob(),
				d.getHiredate().toString(),//date이므로 String으로 변환
				String.valueOf(d.getDeptno())
			};
			model.addRow(data);
		}
	}
	public void getFindData(String column,String fdata)
	{
		for(int i=model.getRowCount()-1; i>=0; i--)
		{
			model.removeRow(i);
		}
		EmpDAO dao=new EmpDAO();
		ArrayList<EmpDTO> list=dao.empFindData(column,fdata);
		for(EmpDTO d:list)
		{
			String[] data={
				String.valueOf(d.getEmpno()),//int이므로 String으로 변환
				d.getEname(),
				d.getJob(),
				d.getHiredate().toString(),//date이므로 String으로 변환
				String.valueOf(d.getDeptno())
			};
			model.addRow(data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpMain();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();
				String sabun=model.getValueAt(row, 0).toString();
				EmpDAO dao=new EmpDAO();
				EmpDTO d=dao.empDetailData(Integer.parseInt(sabun));
				String msg="사번:"+d.getEmpno()+"\n"+"이름:"+d.getEname()+"\n"
							+"직위:"+d.getJob()+"\n"+"사수번호:"+d.getMgr()+"\n"
							+"입사일:"+d.getHiredate()+"\n"+"급여:"+d.getSal()+"\n"
							+"성과금:"+d.getComm()+"\n"+"부서번호:"+d.getDeptno();
				JOptionPane.showMessageDialog(this, msg);
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1||e.getSource()==tf)
		{
			int index=box.getSelectedIndex();
			String column="";
			if(index==0)
				column="ename";
			else if(index==1)
				column="hiredate";
			else
				column="deptno";
			
			String data=tf.getText().trim();
			if(data.length()<1)
			{
				tf.requestFocus();
				return;
			}
			getFindData(column, data);
		}
		else if(e.getSource()==b2)
		{
			getData();
		}
	}

}
