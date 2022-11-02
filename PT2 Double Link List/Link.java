package com.dsa.datastructurealgorithm;

public class Link {
	public String data;
	public Link previous;
	public Link next;
	
	public Link(String data) {
		previous = null;
		this.data = data;
		next = null;
	}
	
	public Link(Link previous, String data, Link next) {
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	
	public String Data() {
		return data;
	}
}
