import inheritance.Boy;
import inheritance.Girl;

import java.sql.SQLOutput;
import java.util.*;

class Main {

    public static void main (String[] args) {

        //STACK
        System.out.println("########## Stack Operation ##########");
        Stack<Integer> stack = new Stack<Integer>();
        StackEg.stack_push(stack);
        StackEg.stack_pop(stack);
        StackEg.stack_push(stack);
        StackEg.stack_peek(stack);
        StackEg.stack_search(stack, 2);
        StackEg.stack_search(stack, 6);

        System.out.println();

        //METHOD OVERLOADING (29.05.2024)
        System.out.println("########## Method OverLoading Operation ##########");
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.task();
        methodOverLoading.task("Aung Aung");
        methodOverLoading.task("Mg Mg", 24);

        System.out.println();

        //CONSTRUCTOR (29.05.2024)
        System.out.println("########## CONSTRUCTOR OPERATION ##########");
        new Constructor();

        System.out.println();

        //CONSTRUCTOR OVERLOADING (29.05.2024)
        System.out.println("########## CONSTRUCTOR OVERLOADING ##########");
        new ConstructorOverLoading();
        new ConstructorOverLoading(23);
        new ConstructorOverLoading(23,"Aye Aye");

        System.out.println();

        //THIS KEYWORD OVERLOADING (29.05.2024)
        System.out.println("########## THIS KEYWORD ##########");
        new ThisKeywork(20);

        System.out.println();

        //INHERITANCE
        System.out.println("########## INHERITANCE ##########");
        Boy b = new Boy();
        b.getParents();

        Girl g = new Girl();
        g.getParents();

        System.out.println();

        //INHERITANCE
        System.out.println("########## INHERITANCE OVERRIDE ##########");
        b.getTownship();
        g.getTownship();

    }
}