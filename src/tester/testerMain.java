package tester;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.awt.*;    
import java.awt.event.*;    

public class testerMain {

	public static void main(String[] args) throws Exception{
		
		KeyEvent pause;
		Thread.sleep(3000) ;
		Robot robot = new Robot();
		LinkedList newList = new LinkedList();

		String fileName = "C:\\Users\\Bick\\eclipse-workspace\\tester\\src\\codes";
	
		long elapsedTime;

		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(fileName)));
		try {
			String line;
			String temp;
			while ((line = br.readLine()) != null) {
				if (line.charAt(4)==',') {
					temp = line.substring(0, 4);
	
				}	else {
					temp = line;
					}

				newList.add(temp);
			}
		} finally {
			br.close();
		}


		for (int i=0; i<newList.size(); i++) {
			long startTime = System.nanoTime();


			String number =  (String) newList.get(i);
			System.out.print(number + "-");

			char a = number.charAt(0);
			char b = number.charAt(1);
			char c = number.charAt(2);
			char d = number.charAt(3);
			char e = 'a';
			char f = 'a';
			
			if (number.length()>4) {
			e = number.charAt(4);
			f = number.charAt(5);
			}

			System.out.print(i+ "-");

			
			if (1 != 'a') {
			keyStroke(a);
			Thread.sleep(20);
			}
			if (b != 'a') {
			keyStroke(b);
			Thread.sleep(20);
			}
			if (c != 'a') {
			keyStroke(c);
			Thread.sleep(20);
			}
			if (d != 'a') {
			keyStroke(d);
			Thread.sleep(20);
			}
			if (e != 'a') {
				keyStroke(e);
				Thread.sleep(20);
			}
			if (f != 'a') {
				keyStroke(f);
				Thread.sleep(20);
			}

			
			execute(number.length());

			Thread.sleep(690) ;
			long endTime = System.nanoTime();
			elapsedTime = startTime - endTime;
			System.out.println(elapsedTime/1000000 + " milliseconds");
			a= 'a';
			b= 'a';
			c= 'a';
			d= 'a';
			e= 'a';
			f= 'a';
		}

	}

public static void execute (int length)throws Exception  {
	Robot robot = new Robot();
	
	Thread.sleep(20);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(50);
	
	for (int i=0; i<length; i++) {
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(20);
	}
}


	public static  void keyStroke (char t) throws Exception {
		Robot robot = new Robot();


		if (t=='0') {
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_0);
		}
		if (t=='1') {
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
		}
		if (t=='2') {
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
		}
		if (t=='3') {
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
		}
		if (t=='4') {
			robot.keyPress(KeyEvent.VK_4);
			robot.keyRelease(KeyEvent.VK_4);
		}
		if (t=='5') {
			robot.keyPress(KeyEvent.VK_5);
			robot.keyRelease(KeyEvent.VK_5);
		}
		if (t=='6') {
			robot.keyPress(KeyEvent.VK_6);
			robot.keyRelease(KeyEvent.VK_6);
		}
		if (t=='7') {
			robot.keyPress(KeyEvent.VK_7);
			robot.keyRelease(KeyEvent.VK_7);
		}
		if (t=='8') {
			robot.keyPress(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_8);
		}	if (t=='9') {
			robot.keyPress(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_9);
		}	


	}}




