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

public class L2_1StudentClass{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.age = 20;
        s1.city="rajkot";
        s1.name="Shyam";
        s2.age = 20;
        s2.city="Ahemdabad";
        s2.name="Suman";
        
        System.out.println(s1.name);
        System.out.println(s1.city);
        System.out.println(s1.age);
        
        System.out.println(s2.name);
        System.out.println(s1.city);
        System.out.println(s2.age);
    }
}