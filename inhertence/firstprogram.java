public class employee {
	float salary;
}
class Programmer extends employee 
{
	int bouns;
	public static void main(String [] args){
	Programmer p = new Programmer();
	p.salary=40000;
	p.bouns=10000;
	
	System.out.println("Programmer salary is" +p.salary);
	System.out.println("Programmer bonus is" +p.bouns);
	}
}
