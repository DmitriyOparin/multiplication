package multiplication;

import java.util.Random;
import java.util.Scanner;

public class Multiplication {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int exit = 1;
        Random dice = new Random();
        int ocenka;
        int numberTree;
        int ball=0;
        int answer = 0;
        boolean n = true;
       
        while(n){
            int numberOne = dice.nextInt(10);
            int numberTwo = dice.nextInt(10);
            
            System.out.println("Сколько будет: " + numberOne + "*" + numberTwo + "=");
            numberTree = numberOne * numberTwo;
            Scanner otvet = new Scanner(System.in);
            System.out.println("Введите ответ");
            int x = otvet.nextInt();
            int out = 111;
            answer++;
            if(x==numberTree){
                ball++;
                System.out.println("Правильно!");
            }else if(x == out){
                answer--;
                break;
            }else{               
                System.out.println("Ответ не верный!");
            }
                     
        }
        ocenka = (ball*100)/answer;
        
        if (ocenka >=80){
            System.out.println("Вы отлично знаете таблицу умножения");
        }else if(ocenka<=40){
            System.out.println("Вы плохо знаете");
        }else{
            System.out.println("Вы хорошо знаете");
            
        }
            
    }
    
    
}