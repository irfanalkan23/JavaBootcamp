package day01;

public class CharSequences {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

       // StringBuilder stringBuilder ="Java";
        StringBuilder stringBuilder = new StringBuilder("Java");

       // StringBuffer stringBuffer = "Java";
        StringBuffer stringBuffer = new StringBuffer("Java");

        System.out.println("------------------------------------");

        String s1 = "Cydeo";
        s1.concat(" School"); //"Cydeo School"

        System.out.println(s1);


        StringBuilder s2 = new StringBuilder("Cydeo"); // mutable
        s2.append(" School");

        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("CYdeo");
        s3.append(" School");

        System.out.println(s3);



    }

}
