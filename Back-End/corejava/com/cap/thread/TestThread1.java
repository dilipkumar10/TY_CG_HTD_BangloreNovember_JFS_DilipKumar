package com.cap.thread;

public class TestThread1 {
public static void main(String[] args) {
	System.out.println("main started");
	Thread1 t=new Thread1();
	t.start();
	System.out.println("main ended");
}
}
