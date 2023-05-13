package constructor;

public class program {
	int modelyear;
	String modulename;

	public program(int year,String name)
	{
		modelyear=year;
		modulename=name;
	}
	public static void main(String[] args) {
		
	
	program r =new program(2001,"gauri");
    System.out.println(r.modelyear + ","+ r.modulename);
	}
	
	
}
		
	


