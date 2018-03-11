package pl.sdacademy;

public class Sortowanie {
    public static void main(String[] args) {
        int[] tablica ={5,15,2,11,6,1,70,9};
        bubbleSort(tablica);

    }
    public static void bubbleSort(int[] tablica){
        int temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tablica.length-1; i++){
                if(tablica[i]>tablica[i+1]){
                    temp = tablica[i+1];
                    tablica[i+1] = tablica[i];
                    tablica[i] = temp;
                    zmiana++;
                }
            }
        }
        for(int i=0; i<tablica.length; i++){
            System.out.print(tablica[i]+" ");
        }
    }
    }


