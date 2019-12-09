package com.cap.thread;

public class User extends Thread {
	PVR p;
	User(PVR p){
		this.p=p;
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	p.confirmTicket();
	super.run();
}
}
