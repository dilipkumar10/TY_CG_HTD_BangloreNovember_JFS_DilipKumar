package com.cap.thread;

public class TestIRCTCUSER {
public static void main(String[] args) {
	System.out.println("main started");
	IRCTC i=new IRCTC();
	IRCTCUser u1=new IRCTCUser(i);
	u1.start();
	IRCTCUser u2=new IRCTCUser(i);
	u2.start();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	i.leaveme();
//	try {
//		Thread.sleep(4000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	System.out.println("main ended");
}
}
