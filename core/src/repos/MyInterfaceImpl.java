package repos;

import model.interfaces.MyInterface;

import javax.ejb.Stateless;

/**
 * @author m.kongoev
 */

@Stateless
public class MyInterfaceImpl implements MyInterface {

	@Override public String sayHello() {
		return "bye-bye";
	}
}
