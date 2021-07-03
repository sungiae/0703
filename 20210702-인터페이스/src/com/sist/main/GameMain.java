package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameMain extends JFrame implements KeyListener{
	// 포함 클래스
	GameView gv=new GameView();
	public GameMain() {
		add("Center",gv);
		setSize(800,650);
		setVisible(true);
		gv.addKeyListener(this);
		gv.setFocusable(true);
	}
	public static void main(String[] args) {
		new GameMain();
	}
	// 인터페이스 => 기능(키워드) : 프로그램에 따라 => 기능 구현이 다를 수도 있기 때문에 => 프로그래머가 구현
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			gv.x-=5;
			if(gv.x<0)
				gv.x=800;
			break;
		case KeyEvent.VK_RIGHT:
			gv.x+=5;
			if(gv.x>800)
				gv.x=0;
			break;
		}
		
	}@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
