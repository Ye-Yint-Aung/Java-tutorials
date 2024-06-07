public class ConstructorOverLoading {


    public  ConstructorOverLoading(){
        System.out.println("I am without parameter of constructor overloading");
    }
    public ConstructorOverLoading(int age){
        System.out.println("I am age parameter of constructor overloading age is : " + age);
    }

    public ConstructorOverLoading(int age, String name){
        System.out.println("I am age and name parameter of constructor overloading Age is : " + age + " Name is : "+ name);
    }
}
