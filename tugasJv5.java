// SOAL: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610

package tugasPerluangan;

public class tugasJv5 {
    public static void main(String[] args) {
        System.out.println("0");
        System.out.println("1");

        int kebab = 0;
        int pizza = 1;

        for (int i = 0; i <14; i++){
            int martabak = kebab + pizza;
            System.out.println(martabak + " ");
            kebab = pizza;
            pizza = martabak;
        }
    }
}

// OUTPUT: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610