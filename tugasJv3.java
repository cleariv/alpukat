// SOAL:  1 1 3 7 13 21 31 43 57 73 91 111 133 157 183 211


package tugasPerluangan;

public class tugasJv3 {
    public static void main(String[] args) {   
        System.out.println("1");
        
        int pisang = 1;
        int batagor = 0;
        
        for (int i= 0; i <15; i++) {
            System.out.println(pisang + " ");
            batagor += pisang;
            pisang += batagor;
        }
    }
}

// OUTPUT:  1 1 3 7 13 21 31 43 57 73 91 111 133 157 183 211