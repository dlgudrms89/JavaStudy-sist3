package com.sist2;
import java.io.File;
import java.util.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXParseException;
public class Container {
	Map<String, I> map=new HashMap<String,I>();
	public Container()
	{
		try
		{
			SAXParserFactory spf=SAXParserFactory.newInstance();
			SAXParser sp=spf.newSAXParser();
			File file=new File("C:\\JavaDev\\JavaStudy3\\20160211ÄÃ·º¼Ç\\src\\com\\sist2\\class.xml");
			MyHandler my=new MyHandler();
			sp.parse(file, my);
			map=my.map;
		}catch(Exception ex){}
	}
	public I getBean(String key)
	{
		return map.get(key);
	}
}
