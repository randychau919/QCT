package QCT.seasar2.demo;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

import QCT.seasar2.logic.GreetingClientLogic;

public class GreetingDiconDemo {
	public static void main(String[] args) {
		String diconFilePath = "QCT/seasar2/dicon/GreetingDemo.dicon";
		S2Container container = S2ContainerFactory.create(diconFilePath);
		GreetingClientLogic greetingClientLogic = (GreetingClientLogic) container.getComponent(
				"greetingClientLogic");
		greetingClientLogic.execute();
	}
}
