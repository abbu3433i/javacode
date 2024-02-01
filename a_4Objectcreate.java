/*******
 * first we declare instance variable then we equal it inside the constructor
 * after that we create diffrent obj and give them an argument
 *******/

public class a_4Objectcreate {

    int age; //
    String name; // These are instance variable of an object
    String clgname; //

    a_4Objectcreate(int a, String n, String CN) { // costructor
        age = a;
        name = n;
        clgname = CN;
    }

    public static void main(String[] args) {
        a_4Objectcreate ct = new a_4Objectcreate(25, "harsh", "SAGE"); //
        a_4Objectcreate c = new a_4Objectcreate(20, "abhishek", "SIRTE"); // object

        System.out.println(ct.age);
        System.out.println(ct.name);
        System.out.println(ct.clgname);

        System.out.println(c.age);
        System.out.println(c.name);
        System.out.println(c.clgname);
    }
}
