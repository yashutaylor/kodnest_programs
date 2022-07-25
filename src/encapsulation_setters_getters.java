

public class encapsulation_setters_getters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap obj= new encap("Taylor_yash",20,5.6f);
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		System.out.println(obj.getheight());
	}

}
class encap{
	private  String name;
	private int age;
	private float height;
	
	public encap(String str,int i,float f) {
		name=str;
		age=i;
		height=f;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public float getheight() {
		return height;
	}
	
}