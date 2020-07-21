package model;

import java.util.Date;

public class MessageModel {
	private String text;
	private boolean isFile;
	private String from;
	private String time;
	
	public MessageModel(String text, boolean isFile, String from, String time) {
		// TODO Auto-generated constructor stub
		this.text = text;
		this.from = from;
		this.isFile = isFile;
		this.time = time;
	}
	
	public String getText() {
		return text;
	}
	
	public boolean getIsFile() {
		return isFile;
	}
	
	public String getFrom() {
		return from;
	}
	
	public String getTime() {
		return time;
	}
}
