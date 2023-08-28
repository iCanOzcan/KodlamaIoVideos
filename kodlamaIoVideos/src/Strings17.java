public class Strings17 {
    public static void main(String[] args) {
        String message = "the weather is very nice today.";
        System.out.println(message);
        /*System.out.println("number of element is :" + message.length());
        System.out.println("3.element :" + message.charAt(2));
        System.out.println(message.concat("Heyyoo!!!"));
        System.out.println(message.startsWith("t"));
        System.out.println(message.endsWith("."));
        char[] chars =new char[3];
        message.getChars(0,3,chars,0);
        System.out.println(chars);
        System.out.println(message.indexOf('e'));
        System.out.println(message.lastIndexOf('a'));*/

        String newMessage=message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(message.substring(4));
        System.out.println(message.substring(4,11));

        for (String words :message.split(" "))
        {
            System.out.println(words);
        }
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
