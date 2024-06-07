package inheritance;

public class Boy extends Student{
    String trouser;


    public void getTownship(){ /*INHERITANCE OVERRIDE FOR getTownship method*/
        this.name = "Kyaw Kyaw"; /*INHERITANCE OVERRIDE FOR name*/
        System.out.println(this.name + " Boy Inheritance Override township is Mandalay");
    }
}
