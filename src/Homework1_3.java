public class Homework1_3 {
    public static void main(String[] args) {

        String email = "adam.krenc1@gmail.com";
        String s1 = "@";
        String s2 = ".";
        String s3 = " ";
        String s4 = "..";

        System.out.println("The length of the email address is " +email.length());

        boolean p = email.contains(s1);
        boolean q = email.contains(s2);
        boolean w = email.contains(s3);
        boolean a = email.contains(s4);
        boolean z = email.length()<254;
        boolean b = email.indexOf(s1)<email.lastIndexOf(s2);

        boolean t = p && q && !w && !a && z && b;

        if (t) {
            System.out.println("All good!");
        } else {
            System.out.println("Email invalid!");
        }



    }
}