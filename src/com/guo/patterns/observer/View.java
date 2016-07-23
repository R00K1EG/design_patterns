package com.guo.patterns.observer;

/**
 * 抽象目标接口 此处使用抽象类表示
 * 
 * @author guo
 *
 */
abstract public class View {
	
	/**
	 * 状态,目标数据
	 */
	private int state; 
	
	/**
	 * 观察者注册接口
	 * 
	 * @param listener
	 */
	abstract protected void Attach(ObserverListener listener);

	/**
	 * 观察者解绑接口
	 * 
	 * @param listener
	 */
	abstract protected void Detach(ObserverListener listener);

	/**
	 * 消息广播接口 通知所有的注册者
	 */
	abstract protected void Notify();

	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		this.Notify();
	}
}
