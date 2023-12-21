public class OperasiMatematika {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(b % a);

        int c = 100;
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        c /= 10;
        System.out.println(c);

        c %= 10;
        System.out.println(c);

        int d = +10;
        int e = -10;
        boolean f = true;
        d++;
        System.out.println(d);
        e--;
        System.out.println(e);

        System.out.println(!f);

        int value1 = 100;
        int value2 = 200;

        System.out.println(value1 > value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 < value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);

        boolean g = false;
        System.out.println(f && f);
        System.out.println(f && g);
        System.out.println(f || f);
        System.out.println(f || g);

    }

}
