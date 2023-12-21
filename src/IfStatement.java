public class IfStatement {

    public static void main(String[] args) {

        var nilai = 70;
        var absen = 90;

        String indeksNilai;

        if (nilai >= 80 && absen >= 90) {
            indeksNilai = "A";
        } else if (nilai >= 70 && absen >= 80) {
            indeksNilai = "B";
        } else if (nilai >= 60 && absen >= 70) {
            indeksNilai = "C";
        } else {
            indeksNilai = "D";
        }
        // Switch biasa
        switch (indeksNilai) {
            case "A":
                System.out.println("Nilai anda A");
                break;
            case "B":
                System.out.println("Nilai anda B");
                break;
            case "C":
                System.out.println("Nilai anda C");
                break;
            case "D":
                System.out.println("Nilai anda D");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // Switch biasa dengan lambda
        switch (indeksNilai) {
            case "A" -> System.out.println("Lulus dengan nilai baik");
            case "B", "C" -> System.out.println("Lulus");
            case "D" -> System.out.println("Tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }

        // Switch dengan yield
        String ucapan = switch (indeksNilai) {
            case "A":
                yield "Lulus dengan nilai baik";
            case "B", "C":
                yield "Lulus";
            case "D":
                yield "Tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };

        // Ternary operator
        String ucapan2 = nilai >= 70 ? "Selamat anda lulus" : "Silahkan coba lagi";
    }

}
