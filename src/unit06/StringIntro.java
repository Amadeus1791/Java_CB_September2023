package unit06;

public class StringIntro {
    public static void main(String[] args) {
        String name = "Wolfgang";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.equals("Wolfgang"));
        System.out.println(name.equals("wolfgang"));
        System.out.println(name.equalsIgnoreCase("wolfgang"));
        System.out.println(name.toCharArray());
        char[] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }


        char[] myName = {'W', 'O', 'L', 'F', 'I'};
        String nameString = new String(myName);

        char a = 'a';
        char a2 = 97;
        int a3 = 'a';
        System.out.println(a3);
        System.out.println(a);
        System.out.println(++a2);
    }
}
