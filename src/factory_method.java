
public class factory_method {
	public OS getinstance(String  str) {
		if(str.equals("open")) {
			return new Android();
		}
		else if(str.equals("secure")) {
		
			return new ios();
		}
		else
		return new Window();
		
	}

}
