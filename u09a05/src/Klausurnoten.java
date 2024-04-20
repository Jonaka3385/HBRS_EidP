public class Klausurnoten {

    public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punktGrenzen){
        int aT = punkte.length;
        int bN = 0;
        int sN = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int aB = 0;
        int aNB = 0;
        double dP;
        int[] noten = new int[aT];

        for(int i = 0; i < aT; i++){
            int p = punkte[i];
            if(p <= punktGrenzen[0]){
                noten[i] = 5;
            }	else if(p <= punktGrenzen[1]){
                noten[i] = 4;
            }	else if(p <= punktGrenzen[2]){
                noten[i] = 3;
            }	else if(p <= punktGrenzen[3]){
                noten[i] = 2;
            }	else{
                noten[i] = 1;
            }
        }

        bN = noten[0];
        sN = noten[0];
        for(int i = 1; i < aT; i++){
            if(noten[i] < bN){
                bN = noten[i];
            }
            if(noten[i] > sN){
                sN = noten[i];
            }
        }

        for(int i = 0; i < aT; i++){
            if(noten[i] == 5){
                aNB++;
            }	else{
                aB++;
            }
        }

        double sP = 0;
        for(int i = 0; i < aT; i++){
            sP += punkte[i];
        }
        dP = sP/aT;

        for(int i = 0; i < aT; i++){
            if(noten[i] == 5){
                a5++;
            }	else if(noten[i] == 4){
                a4++;
            }	else if(noten[i] == 3){
                a3++;
            }	else if(noten[i] == 2){
                a2++;
            }	else if(noten[i] == 1){
                a1++;
            }
        }

        System.out.println(aT);
        System.out.println(bN + " " + sN);
        System.out.println(aB + " " + aNB);
        System.out.println(dP);
        System.out.println("1 " + a1);
        System.out.println("2 " + a2);
        System.out.println("3 " + a3);
        System.out.println("4 " + a4);
        System.out.println("5 " + a5);
    }
}
