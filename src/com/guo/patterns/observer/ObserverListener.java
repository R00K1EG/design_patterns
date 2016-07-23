package com.guo.patterns.observer;

/**
 * 抽象观察者接口
 * @author guo
 *
 */
public interface ObserverListener {
	
	/**
	 * 提供更新函数
	 * @param v  抽象目标
	 * @param id 具体目标ID
	 */
	public void update(View v, int state);
	
}
