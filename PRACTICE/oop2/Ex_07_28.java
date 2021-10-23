package oop2;

import java.awt.*;
import java.awt.event.*;

//[7-28] 아래의 EventHandler 를 익명 클래스 로 변경하시오  (anonymous class) .
public class Ex_07_28 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new EventHandler());
	}

}
class EventHandler extends WindowAdapter
{
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}
