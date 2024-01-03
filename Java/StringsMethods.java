public class StringsMethods {
    public static void main(String[] args) {
        String name = "Anurag";

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("ra"));
        System.out.println(name.charAt(3));//character at index giving so here 3 then char is 'r'
        System.out.println(name.endsWith("ag"));
        System.out.println(name.indexOf("nu"));

        System.out.println("My Name is : \"Anurag Gupta\"");//  \" -->this escape sequence character 
        /*some escape sequence or special character 
        \\-->use for back slace in sentences
        \t -->for tab space
        \n --> for new line,etc
        */
    }
    
}
