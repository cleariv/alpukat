// SOAL: 1 2 4 7 11 16 22 29 37 46 56 67 79 92 106 121

package tugasPerluangan;

public class tugasJv4 {
    public static void main(String[] args) {
        
        int petir = 1, 
        angin = 1;

        while (petir <= 121){
            System.out.println( petir + " ");
            petir = petir + angin;
            angin = angin + 1;

        }  
    }
}

// OUTPUT: 1 2 4 7 11 16 22 29 37 46 56 67 79 92 106 121