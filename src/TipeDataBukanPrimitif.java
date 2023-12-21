public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        // Konversi dari primitif
        int age = 30;

        Integer ageObject = age;

        // Konversi dari bukan primitif
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

    }

}
