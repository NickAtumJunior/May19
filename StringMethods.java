import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String txtString = sc.nextLine();

        System.out.println("enter second String");
        String txtTwoString = sc.nextLine();

        System.out.println("this is hashCodeMethod = " + txtString.hashCode());
        System.out.println("this is charAt method = " + txtString.charAt(2));
        System.out.println("this is concat method  = " + txtString.concat(txtTwoString));
        System.out.println("this is substring method = " + txtString.substring(1, 2));
        System.out.println("this is length method = " + txtString.length());
        System.out.println("this is indexOf method = " + txtString.indexOf(3));
        System.out.println("this is intern method = " + txtString.intern());
        System.out.println("this is lastIndexOf method = " + txtString.lastIndexOf(9));
        System.out.println("this is lastIndexOf method with two parameter = " + txtString.lastIndexOf(2, 4));
        System.out.println("this is toLowerCase method = " + txtString.toLowerCase());
        System.out.println("this is toUpperCase method = " + txtString.toUpperCase());
        System.out.println("this is isEmpty method = " + txtString.isEmpty());
        System.out.println("this is equals method = " + txtString.equals(txtTwoString));
        System.out.println("this is subSequence method = " + txtString.subSequence(1, 4));
        System.out.println("this is startsWith method = " + txtString.startsWith("h"));
        System.out.println("this is matches method = " + txtString.matches(txtTwoString));
    }
}
