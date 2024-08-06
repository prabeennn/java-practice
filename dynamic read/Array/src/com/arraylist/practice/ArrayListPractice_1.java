package com.arraylist.practice;

public class ArrayListPractice_1 {
	
	private Object[]a=new Object[5];
	private int p=0;
	
	public void add(Object e) {
		if(p>=a.length)increaseArraySize();
		a[p++]=e;
	}
	public void add(int index, Object e) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		if(p>=a.length) increaseArraySize();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	public void remove(int index) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		
		for(int i=index+1; i<size();i++) {
			a[i-1]=a[i];
		}
		--p;
		a[p]=null;
	}
	private void increaseArraySize() {
		Object[] temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public int size() {
		return p;
	}
	public Object get(int index) {
		if(index<=1 || index>=size()) throw new IndexOutOfBoundsException();
		return a[index];
	}
	
	@Override
	public String toString() {
		if(size()==0) return"[]";
		String s="["+a[0];
		for(int i=1;i<size();i++) {
			s=s+","+a[i];
		}
		s=s+"]";
		return s;
	}
	

}
