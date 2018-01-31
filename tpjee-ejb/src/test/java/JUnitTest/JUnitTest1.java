package JUnitTest;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Test;

import entity.Controller;
import entity.ControllerInterface;

public class JUnitTest1 {
	
	@Test
	public void test3() throws NamingException {
		Properties prop = new Properties();
		
		prop.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.jboss.naming.remote.client.InitialContextFactory");
		prop.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		prop.put("jboss.naming.client.ejb.context", true);
		Context context = new InitialContext(prop);
		
		// lookup
		
		ControllerInterface b = (ControllerInterface) context
				.lookup("tp1-ear/tp1-ejb/AgencePhoto!org.ema.tp.IAgencePhoto");
		System.out.println(b.getPhotographe());
	}

	

}
