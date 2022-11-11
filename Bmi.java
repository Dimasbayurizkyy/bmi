/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bmi;

/**
 *
 * @author ASUS
 */
public class Bmi {

    public static void main(String[] args) {
        int beratbadan = 79;
        float tinggibadan =1.76f;
        float bmi=(beratbadan/(tinggibadan*tinggibadan));
        
        System.out.println("BMI ANDA ADALAH\t:"+bmi);
        
        if (bmi<18.5){
            System.out.println("BERAT BADAN KAMU KURANG");
        }
        else if (bmi<24.9){
            System.out.println("BERAT BADAN KAMU IDEAL");
        }
        else if (bmi<29.9){
            System.out.println("BERAT BADAN KAMU LEBIH");
        }
         else{
             System.out.println("OBESITAS");
         }
    }
}
