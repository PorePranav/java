package Challenge;

public class MegaBytesConvertor {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes;
        int remaningKiloBytes;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        megaBytes = kiloBytes / 1024;
        remaningKiloBytes = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaningKiloBytes + " KB");
    }
}
