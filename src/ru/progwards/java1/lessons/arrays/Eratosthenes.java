package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;

public class Eratosthenes {

    private boolean[] sieve;
    public Eratosthenes(int N){
        sieve = new boolean[N];
        Arrays.fill(sieve,true);
        sift();
    }

    private void sift(){
        for(int i = 2; i< sieve.length; i++){
            if(isSimple(i)){
                for(int j = i+1; i*j< sieve.length; j++){
                    sieve[i*j] = false;
                }
            }
        }
    }
    public boolean isSimple(int n){
        return sieve[n];
    }

    public static void main(String[] args) {


    }
}
