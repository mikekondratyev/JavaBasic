package Lesson4;

class Test {
    public static void main (String[] args)	{
        String str = "I study Basic Java";
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.toUpperCase() );
        System.out.println(str.toLowerCase() );
        System.out.println("Содержит Java? " + str.contains("Java") );

        int substringJava=str.indexOf("Java");
        System.out.println(str.substring(substringJava) );

        System.out.println(str.replaceAll("a", "o") );

    }
}

