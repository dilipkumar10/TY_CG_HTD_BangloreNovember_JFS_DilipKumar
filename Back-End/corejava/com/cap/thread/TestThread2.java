package com.cap.thread;

public class TestThread2 {
public static void main(String[] args) {
	System.out.println("Main Started");
	Thread2 t2=new Thread2();
	Thread t=new Thread(t2);
	t.start();
	System.out.println("Main Ended");
}
}
