package com.sist.server;
import java.util.*;
public class Room {
	String roomName, roomState, roomPwd, roomBang;
	int inwon;
	int current;
	Vector<Server.Client> userVc=new Vector<Server.Client>();//userVc가 0번인 사람이 방장
	public Room(String rn, String rs, String rp, int i)
	{
		roomName=rn;
		roomState=rs;
		roomPwd=rp;
		inwon=i;
		current=1;
	}
}
