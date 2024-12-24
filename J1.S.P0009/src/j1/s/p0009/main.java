/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0009;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci");
        fibo_v2(45, 1, 0);
    }
    
    public static void show_v1(){
        int f0 = 0;
        int f1 = 1;
        for (int i = 0; i < 45; i++) {
            System.out.print(f0 + f1 + ", ");
            int tmp = f0 + f1;
            f0 = f1;
            f1 = tmp;
        }
    }
    
    public static int fibo_v2(int term, int lower, int higher){
        if(term < 2){
            return higher;
        }
        System.out.print(higher + " ");
        return fibo_v2(term - 1, higher, higher + lower);
    }
    
}