package com.guo.patterns.observer;

import java.util.Vector;

/**
 * 具体目标对象
 * 实现抽象目标对象中的各个方法
 * @author guo
 *
 */
public class SubjectView extends View {

	private Vector<ObserverListener> listeners;

	public SubjectView() {
		this.listeners = new Vector<ObserverListener>();
	}

	@Override
	protected void Attach(ObserverListener listener) {
		// TODO Auto-generated method stub
		this.listeners.addElement(listener);
	}

	@Override
	protected void Detach(ObserverListener listener) {
		// TODO Auto-generated method stub
		this.listeners.removeElement(listener);
	}

	
	public void addListener(ObserverListener listener){
		this.Attach(listener);
	}
	
	@Override
	protected void Notify() {
		// TODO Auto-generated method stub
		for (ObserverListener listener : this.listeners) {
			listener.update(this, this.getState());
		}
	}

}
