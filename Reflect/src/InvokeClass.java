import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class InvokeClass {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c = DataClassLoader.loadClass("http://127.0.0.1:1881/", "RemoteData");
		
		Class[] parameterTypes = {String.class, String.class};
		Constructor con = c.getConstructor(parameterTypes);
		
		Object[] initargs = new Object[]{"내이름", "곱슬머리"};
		Object obj = con.newInstance(initargs);
		
		System.out.println(obj);
		
		Method m = c.getMethod("sayHello", null);
		m.invoke(obj, null);

		Class[] parameterTypes2 = {String.class};
		Method m2 = c.getMethod("sayHello", parameterTypes2);
		
		Object[] params = new Object[]{"이름변경"};
		m2.invoke(obj, params);
	}

}
