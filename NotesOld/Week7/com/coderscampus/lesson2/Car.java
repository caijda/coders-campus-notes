package com.coderscampus.lesson2;

public class Car implements Product{
	private Electronics eletronics;
	private Body body;
	private Frame frame;
	
	public Electronics getEletronics() {
		return eletronics;
	}

	public void setEletronics(Electronics eletronics) {
		this.eletronics = eletronics;
	}
	
	public Body getBody() {
		return body;
	}
	
	public void setBody(Body body) {
		this.body = body;
	}
	
	public Frame getFrame() {
		return frame;
	}
	
	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	@Override
	public Integer getPrice() {
		return 10000;
	}
}
