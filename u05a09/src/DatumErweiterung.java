import java.util.Scanner;

public class DatumErweiterung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int mi;


        while (j<1600 | j>3000) {
            System.out.println("Jahr muss zwischen 1600 und 3000 liegen.");
            j = sc.nextInt();
        }

        while (m<1 | m>12) {
            System.out.println("Monat muss zwischen 1 und 12 liegen.");
            m = sc.nextInt();
        }

        if (m==1 | m==3 | m==5 | m==7 | m==8 | m==10 | m==12) {
            while (t<1 | t>31) {
                System.out.println("Tag muss zwischen 1 und 31 liegen.");
                t = sc.nextInt();
            }
        } else if(m==2) {
            while (t<1 | t>28) {
                System.out.println("Tag muss zwischen 1 und 28 liegen.");
                t = sc.nextInt();
            }
        } else {
            while (t<1 | t>30) {
                System.out.println("Tag muss zwischen 1 und 30 liegen.");
                t = sc.nextInt();
            }
        }

        while (s<0 | s>23) {
            System.out.println("Stunde muss zwischen 0 und 23 liegen.");
            s = sc.nextInt();
        }

        while (m1<0 | m1>59) {
            System.out.println("Minute muss zwischen 0 und 59 liegen.");
            m1 = sc.nextInt();
        }

        while (m2<0 | m2>40000) {
            System.out.println("Addierende Minuten müssen zwischen 0 und 40000 liegen.");
            j = sc.nextInt();
        }


        mi = m1 + m2;


        while (mi>59) {
            s++;
            mi -= 60;
        }

        while (s>23) {
            t++;
            s -= 24;
        }

        if (m==1 | m==3 | m==5 | m==7 | m==8 | m==10 | m==12) {
            while (t>31) {
                m++;
                t -= 31;
            }
        } else if(m==2) {
            while (t>28) {
                m++;
                t -= 28;
            }
        } else {
            while (t>30) {
                m++;
                t -= 30;
            }
        }

        while (m>12) {
            j++;
            m -= 12;
        }


        System.out.print(j + " " + m + " " + t + " " + s + " " + mi);
        sc.close();
    }
}
