/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package applicationdivisore;

import java.util.Scanner;

/**
 *
 * @author sarah.pveloso
 */
public class ApplicationDivisore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int N = ler.nextInt();
        for(int i =1; i<=N; i++){
            if (N % i == 0 ){
                if(N % i == 0){
                    System.out.println(i);
                }
            }
        }
        ler.close();
    }
    }