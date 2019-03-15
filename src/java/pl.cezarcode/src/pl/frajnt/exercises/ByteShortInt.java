package pl.frajnt.exercises;

public class ByteShortInt {
    public static void main(String[] args)

    {
        //Int has width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 214783847;
        int myTotal = (myMinValue/2);

        System.out.println("myTotal = +myTotal");

        //byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue =  (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myByteValue);

        // short has a width 16
        short myShortValue = (short) 32768;
        short myNewSortValue = (short) (myShortValue/2);

        // long has a width of 64

        long myLongValue = 9_233_372_036_854_775_80L;
        long myNewLong = (long) (myLongValue/2);
    }
}
