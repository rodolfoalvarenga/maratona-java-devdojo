package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {

    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // Autoboxing -> faz Java transformar tipo primitivo em Wrapper
        // Unboxing -> faz Java transformar Wrapper em tipo primitivo
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = new Integer("2"); // depreciado a partir do Java 9
        boolean verdadeiro = Boolean.parseBoolean("TruE"); // case insensitive
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));

    }

}
