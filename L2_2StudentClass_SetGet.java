package practical;

class Student{
    int age;
    String name;
    String city;

    void setage(int age){
        this.age = age;
    }
    void setname(String name)
    {
        this.name = name;
    }
    void setcity(String city)
    { this.city = city;}
    int getage()
    {return age;}
    String getname(){return name;}
    String getcity(){return city;} 

}

public class L2_2StudentClass_SetGet{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setage(20);
        s1.setcity("rajkot");
        s1.setname("Shyam");
        s2.setage(20);
        s2.setcity("Ahemdabad");
        s2.setname("Suman");
        System.out.println(s1.getname());
        System.out.println(s1.getcity());
        System.out.println(s1.getage());
        System.out.println(s2.getname());
        System.out.println(s2.getcity());
        System.out.println(s2.getage());
    }
}
