
package Semana1;
import java.util.Scanner;

public class NumeroBinario {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int residuo=0;
        int cociente=0;
        int tamaño;
        String numBinario="";
        String res="";
        
        System.out.println("Ingrese numero a convertir a binario: ");
        int num =lea.nextInt();
        
        do{
        residuo =(int)num%2;
        cociente=num/2;
        num=(int)cociente;
        numBinario=residuo + numBinario;
        
        }while(num!=0);
        
        tamaño=numBinario.length();
        
        for(int x=tamaño-1;x>=0;x--){
            res+=numBinario.charAt(tamaño);
        }
        
        System.out.print("Numero binario: "+res);        
    }
}
