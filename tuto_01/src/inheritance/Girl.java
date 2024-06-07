package inheritance;

public class Girl extends  Student{
    String skirt;

    public void getTownship(){ /*INHERITANCE OVERRIDE FOR getTownship method*/
        this.name = "Aye Aye"; /*INHERITANCE OVERRIDE FOR name*/
        System.out.println( this.name + " Girl Inheritance Override township is Bago ");
    }
}
