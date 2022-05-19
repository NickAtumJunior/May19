import java.util.Scanner;

class StringBufferExample {
    public static void main(String args[]) {

        Scanner inputt = new Scanner(System.in);

        System.out.println("Enter fisrt StringBuffer");
        StringBuffer sb = new StringBuffer(inputt.next());

        System.out.println("Enter second StringBuffer");
        StringBuffer two = new StringBuffer(inputt.next());

        System.out.println("this is append method = " + sb.append(two));
        System.out.println("this is toString method = " + sb.toString());
        System.out.println("this is length method = " + sb.length());
        System.out.println("this is capacity method = " + sb.capacity());
        System.out.println("this is charAt method = " + sb.charAt(2));
        System.out.println("this is codePointAt method = " + sb.codePointAt(4));
        System.out.println("this is codePointBefore method = " + sb.codePointBefore(6));
        System.out.println("this is codePointCount method" + sb.codePointCount(2, 5));
        System.out.println("this is hashCode method = " + sb.hashCode());
        System.out.println("this is indexOf method = " + sb.indexOf("h"));
        System.out.println("this is lastIndexOf method = " + sb.lastIndexOf("h"));
        System.out.println("this is substring method = " + sb.substring(3));
        System.out.println("this is another append method = " + sb.append("priya"));
        System.out.println("this is delete method = " + sb.delete(3, 4));
        System.out.println("this is deleteCharAt method = " + sb.deleteCharAt(6));
        System.out.println("this is equals method = " + sb.equals(two));
        System.out.println("this is getClass method = " + sb.getClass());
        System.out.println("this is insert method = " + sb.insert(3, "gh"));
        System.out.println("this is replace method = " + sb.replace(1, 4, "hjh"));
        System.out.println("this is reverse method = " + sb.reverse());
        System.out.println("this is subSequence method = " + sb.subSequence(1, 5));
    }
}