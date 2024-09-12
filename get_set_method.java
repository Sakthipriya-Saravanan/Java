package package_2;

class priya {
    private String skills; //private fields
    private int age;

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills){
        this.skills = skills;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }
        else{
            System.out.println("Incorrect Age");
        }
    }
}
public class pack_2  {
    public static void main(String[] args) {
        priya p = new priya();
        p.setSkills("web development");
        p.setAge(19);
        System.out.println(p.getSkills());
        System.out.println(p.getAge());


    }
}
