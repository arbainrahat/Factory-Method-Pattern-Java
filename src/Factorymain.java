
public class Factorymain {

	public static void main(String[] args) {

		factory_method fm= new factory_method();
		OS obj=fm.getinstance("secure");
		obj.spec();

	}

}
