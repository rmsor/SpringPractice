package intro;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		// HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		//
		// objA.setMessage("I'm object A");
		// objA.getMessage1();
		// objA.getMessage2();
		//
		// HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		// objB.getMessage();
		//
		// HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		// objB.getMessage1();
		// objB.getMessage2();
		// objB.getMessage3();

		// TextEditor te = (TextEditor) context.getBean("textEditor");
		//
		// te.spellCheck();

		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();

		context.registerShutdownHook();
	}
}