public class MethodOverLoading {

    public void task(){
        System.out.println("I am Without parameter method.");

    }
    public void task(String name){
        System.out.println("I am with parameter method " + name);
    }

    public void task(String name, int age){
        System.out.println("I am with parameter method " + name + " and " + age);
    }
}

//Method Overloading ဆိုတာ class တစ်ခုထဲမှာ name တူတဲ့ method တစ်ခုထက် မက ရှိလို့ရတယ်
//Parameter မတူရဘူး
