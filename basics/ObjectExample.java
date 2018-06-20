
public class ObjectExample {

	
	int count;
	String desc;
	public ObjectExample() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public ObjectExample(int count,String desc)
	{
		this.count=count;
		this.desc=desc;
	}
	
	

	@Override
	public int hashCode() {
		
		return count + desc.length() * 2;
	}
	
	@Override
	public String toString() {
		return "ObjectExample [hashCode()=" + hashCode() + "]";
	}




	public static void main(String[] args) {
		
		ObjectExample oc=new ObjectExample(100,"test");
		System.out.println(oc.hashCode());
		System.out.println(oc);
		
		
		ObjectExample oc1=new ObjectExample(100,"test");
		
		System.out.println(oc.equals(oc1));
		System.out.println(oc.hashCode()+"=="+oc1.hashCode());

	}
	
}
