public class Loops {

    public static void main(String[] args) {
        // For
        for (var i = 1; i <= 10; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        // While
        var x = 1;
        while (x <= 10) {
            System.out.println("Perulangan ke-" + x);
            x++;
        }

        // Do While
        var y = 11;
        do {
            System.out.println("Perulangan ke-" + y);
            y++;
        } while (y <= 10);

        // For each
        String[] nama = {
          "Miftah", "Ilman", "Eko", "Sule"
        };

        for (var value: nama) {
            System.out.println(value);
        }

    }

}
