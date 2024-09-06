class departmentstore{
	int pencost=5;
	void pen() {
		System.out.println("stylish pen");
		
	}
	void pencost() {
		System.out.println("cost of pen "+pencost);
	}
}
class sakthi extends departmentstore{
	String penciltype="nataraj pencil";
	void pencil() {
		System.out.println("This is a " +penciltype );
		
	}
	
}
public class single_inheritence {

	public static void main(String[] args) {
		sakthi s=new sakthi();
		s.pen();
		s.pencil();
		s.pencost();
		
	}
}
