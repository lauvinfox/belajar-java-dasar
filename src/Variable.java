public class Variable {

    public static void main(String[] args) {

        String name;
        name = "Leo";

        int age = 37;
        String nationality = "Argentina";

        System.out.println(name);
        System.out.println(age);
        System.out.println(nationality);


        // Kata kunci var
        // Apabila tidak dideklarasikan langsung akan terjadi error
        // Misal: var name;

        var club = "Inter Miami";

        System.out.println(club);

        // Kata kunci final
        // Agar variabel tidak bisa diubah setelah dideklarasikan

        final boolean goat = true;

        System.out.println(goat);

    }

}
