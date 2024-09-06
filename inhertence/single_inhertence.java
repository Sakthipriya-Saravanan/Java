class departmentstore{
	void pen() {
		System.out.println("hai i am parkavi");
		
	}
	
}
class sakthi extends  departmentstore{
	void pencil() {
		System.out.println("hai i am santhiya");
	}
	
	
}
public class single_inheritence {

	public static void main(String[] args) {
		sakthi s=new sakthi();
		s.pen();
		s.pencil();
		

	}

}
