package MegaBytesConverter;

public class MegaBytesConverter {
    public static void main(String[]args){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }


    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int inMegaBytes = kiloBytes / 1024 ;
            int remainingKiloBytes = kiloBytes % 1024 ;
            String result = kiloBytes + " KB " + "= " + inMegaBytes + " MB " + "and " + remainingKiloBytes + " KB";
            System.out.println(result);
        }
    }
}
