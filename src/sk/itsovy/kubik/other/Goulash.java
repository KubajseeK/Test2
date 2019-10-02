package sk.itsovy.kubik.other;


public class Goulash {
    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayNHello(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print("Hello ");
            i++;
        }
        System.out.println(); //odriadkovanie
    }

    public void sayHi() {
        System.out.print("Hi ");
    }

    public void sayNHi(int n) {
        for (int i = 1; i <= n; i++) {
            sayHi();
        }
        System.out.println();
    }

    public int getEvenNumber(int a) {
        if (a % 2 == 0) {
            return a;
        } else {
            a++;
            return a;
        }

    }

    public double getPozicka(int mes, double urok, double suma) {
        return (suma * urok + suma) / mes;

    }

    public void test() {
        int time = 514623; //sekundy
        int day = time / 86400;
        time = time % 86400;
        int hour = time / 3600;
        time = time % 3600;
        int minute = time / 60;
        time = time % 60;
        System.out.println(day + " " + hour + " " + minute + " ");
    }

    public void addingNumbers() {
        int sum = 0;
        int value = 1;
        for (int i = 1; i <= 30; i++) {
            System.out.println(sum + value);
            value = value * 2;
        }
        System.out.println(sum / 100);
    }

    public void primeNumberChecker(int value) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                count++;
        }
        if (count == 0)
            System.out.println("PRIME");
        else {
            System.out.println("Nope.");
        }
    }

    public void testingWhile() {
        int i = 10000;
        while (i < 99999) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if (a + b + c + d + e == 43) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void testingWhile2() {
        int m = 99999;
        while (m % 613 != 0) {
            m--;
            if (m % 613 == 0) {
                System.out.println(m);
            }
        }
    }

    public void testingWhile3() {
        int a = 244;
        int b = 312;
        while (b % a != 0) {
            b += 312;
            if (b % a == 0) {
                System.out.println(b);
            }
        }
    }

    public void biggestDelitel() {
        int a = 96;
        int b = 27;
        int temp = a;
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;

        }
        System.out.println(a);
    }

    public void uloha() {
        int i = 3;
        int j = 5;
        int k = 8;
        int m = 0;
        while (i < 6) {
            m = i + j + k;
            System.out.println(m);
            j++;
            i++;
            k -= 3;
        }
    }

    public void uloha2() {
        int i = 5;
        int k = 7;
        int n = 0;
        do {
            n = k * i;
            i++;
            k = k + 3;
            System.out.println(n);
        } while (5 * i < k);
    }

    public void uloha3() {
        for (int i = 2; i < 5; i++) {
            int j = 1;
            while (j <= i) {
                j++;
                System.out.print("*" + "");
            }
        }
    }

    public void uloha4() {
        for (int j = 1; j < 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("**");
            }
            System.out.println();
        }
    }

    public void uloha5() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void uloha6() {
        for (int j = 20; j >= 1; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void uloha7(int n) {
        for (int i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }
    public void uloha8(int n) {
        for (int i = 0; i<=n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0 || j == n || i == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }

}



