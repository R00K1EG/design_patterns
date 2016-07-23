package com.guo.patterns.observer;

/**
 * 观察者模式：（Publish/SubScribe） 定义一种一对多的模式 角色： 1.抽象目标角色（Subject）
 * 2.抽象观察者角色（Observer） 3.具体目标角色（Concrete Subject） 4.具体观察者角色（Concrete Observer）
 * 
 * @author guo
 *
 */

public class ObserverModel {
	public static void main(String[] args) {
		SubjectView sv = new SubjectView();
		sv.addListener(new MyListener("No.1"));
		sv.addListener(new MyListener("No.2"));
		sv.addListener(new MyListener("No.3"));
		sv.addListener(new MyListener("No.4"));
		sv.setState(5);
	}
}

class MyListener implements ObserverListener{
	
	private String id;
	
	public MyListener(String id){
		this.id = id;
	}
	
	@Override
	public void update(View v, int state) {
		// TODO Auto-generated method stub
		if(v instanceof SubjectView){
			System.out.println(this.id + ".state=" + state);
		}
	}
	
}
