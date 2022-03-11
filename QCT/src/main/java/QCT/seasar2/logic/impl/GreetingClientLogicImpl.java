package QCT.seasar2.logic.impl;

import QCT.seasar2.logic.GreetingClientLogic;
import QCT.seasar2.logic.GreetingLogic;

public class GreetingClientLogicImpl implements GreetingClientLogic {
	private GreetingLogic greetingLogic;

	public void setGreeting(GreetingLogic greetingLogic) {
		this.greetingLogic = greetingLogic;
	}

	public void execute() {
		System.out.println(greetingLogic.greet());
	}
}