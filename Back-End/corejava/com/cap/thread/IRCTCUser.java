package com.cap.thread;

public class IRCTCUser extends Thread {
 IRCTC i;

/**
 * @param i
 */
public IRCTCUser(IRCTC i) {
	super();
	this.i = i;
}
 public void run() {
	 i.confirmTicket();
 }
}
