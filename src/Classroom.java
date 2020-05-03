public class Classroom {


    public static void main(String[] args){
        Wilder wilder1 = new Wilder ("Georges", true);
        Wilder wilder2 = new Wilder ("Sabrina", false);
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
    }
}
