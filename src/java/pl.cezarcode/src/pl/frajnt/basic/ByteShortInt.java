package pl.frajnt.basic;

public class ByteShortInt {
    public static void main(String[] args) {

    // Int has width of 32
    int myMinValue = -214748364;
    int myMaxValue = 214748364;
    int myTotal = (myMinValue/2);
    System.out.println("myTotal = " + myTotal);

    // byte has width of 8
    byte myByteValue = -127;
    byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

    // short has a width of 16
    short myShortValue = 30000;
    short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

    // long has a width of 64
    long myLongValue = 100L;
    long longTotal = 5L + 10L * (myNewByteValue + myNewShortValue + myTotal);
        System.out.println("long total = "  + longTotal);


}
}