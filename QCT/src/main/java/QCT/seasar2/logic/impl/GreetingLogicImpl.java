package QCT.seasar2.logic.impl;

import QCT.seasar2.logic.GreetingLogic;

public class GreetingLogicImpl implements GreetingLogic {
	@Override
	public String greet() {
		return "Hello ! Welcome to Seasar2 !!!";
	}
}