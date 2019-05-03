package com.test.main;

import com.test.util.GroupNotifyLINE;

public class TestMain {

	public static void main(String[] args) 
	{
		TestMain m = new TestMain();
		
		// build the message
		StringBuffer sb = new StringBuffer();
		
		for ( int i = 0 ; i < 1001; i++) {
			sb.append("message send to api^^^한글," + i);
			m.run(sb);
			sb.delete(0, sb.length());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	void run(StringBuffer sb) {

		// Get Your Token at https://notify-bot.line.me
		// 1.Build the GroupChat at the Line
		// 2.Invite the "LineNotify" to the Group
		// 3.Get the Token for the GroupChat
		String _MY_TOKEN = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";

		GroupNotifyLINE ln = new GroupNotifyLINE();

		
		// send the message to notify
		try {

			int resultCode = ln.postNotify(_MY_TOKEN, sb.toString());
			switch ( resultCode ) {
				case 200:
					System.out.println("send success");
					break;
				default:
					System.out.println("send fail, status: " + resultCode);
					break;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println( "Error Message : " + e.getMessage() );
		}

	}

}