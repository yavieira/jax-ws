package br.com.caelum.estoque.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date>{

	private String pattern = "dd/MM/yyyy";
	
	public Date unmarshal(String date) throws Exception {
		if(date == null || date.isEmpty()) {
			new Exception("Data inválida");
		}
		return new SimpleDateFormat(pattern).parse(date);
	}
		
	public String marshal(Date date) throws Exception {
		if(date == null) {
			new Exception("Data inválida");
		}
		return new SimpleDateFormat(pattern).format(date);
	}
}
