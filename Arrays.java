public class Types {

    public static void main(String[] args) {

        byte[] myByte = {100};
        short[] myShort = {10000};
        int[] myInt = {100000, 200000, 300000};
        long[] myLong = {10000000000L};

        float[] myFloat = {5.75f};
        double[] myDouble = {19.99};

        char[] myChar = {'F'};

        boolean[] isJavaFun = {true};

        // length
        System.out.println("Byte: " + myByte[0]);
        System.out.println("Short: " + myShort[0]);
        System.out.println("Int: " + myInt[0]);
        System.out.println("Long: " + myLong[0]);
        System.out.println("Float: " + myFloat[0]);
        System.out.println("Double: " + myDouble[0]);
        System.out.println("Char: " + myChar[0]);
        System.out.println("Boolean: " + isJavaFun[0]);
        System.out.println(myInt[0]);
    }
}
