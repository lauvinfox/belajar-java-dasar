public class Array {

    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Miftah";
        arrayString[1] = "Ilman";
        arrayString[2] = "Leo";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);


        String[] arrayString2 = {
                "Miftah", "Ilman", "Leo", "Messi"
        };

        int[] arrayInt = new int[] {
            10, 12, 14, 16, 18, 20
        };

        long[] arrayLong = new long[] {
            10L, 20L, 30L, 40L, 60L
        };

        System.out.println(arrayInt.length);
        System.out.println(arrayLong.length);
        System.out.println(arrayString2.length);

        String[][] members = {
                {"Miftah", "Ilman"},
                {"Leo", "Messi"},
                {"Ahmad", "Zee"}
        };

        System.out.println(members[0][1]);
        System.out.println(members.length);
    }

}
