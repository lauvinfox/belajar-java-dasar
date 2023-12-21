public class TipeDataNumber {

    public static void main(String[] args) {

        // Integer
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        // Float
        float iniFloat = 12.14F;
        double iniDouble = 10.2424;

        // Literals
        int iniDecimal = +23;
        int iniDecimal2 = -20;
        int iniOctal = 0757;
        int iniHex = 0xBB17;
        int iniBinary = 0b111011;

        // Underscore
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        // Conversion
        // Widening
        double ituDouble = (float) (long) (int) (short) (byte) 10;

        // Narrowing
        // Sama saja tetapi hati hati karena bisa terjadi number overflow
    }

}
