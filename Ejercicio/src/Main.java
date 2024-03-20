import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la Calculadora");

        Scanner sc = new Scanner(System.in);
        int option;
       do
    {
           System.out.println("Que quiere hacer?");
           System.out.printf("1.sumar%n2.Restar%n3.Multiplicar%n4.Dividir%n5.Salir %n");
        System.out.print("Opcion:");
           option = sc.nextInt();
           switch (option){
               case 1:
                   System.out.println("quiere sumar,ponga los 2 valores para sumarlos:");
                   System.out.print("Valor 1:");
                   int a = sc.nextInt();
                   System.out.print("Valor 2:");
                   int b = sc.nextInt();
                   System.out.print("respuesta:");
                   System.out.println(sumar(a,b));                   break;
               case 2:
                   System.out.println("quiere restar,ponga los 2 valores para restarlos:");
                   System.out.print("Valor 1:");
                   int c = sc.nextInt();
                   System.out.print("Valor 2:");
                   int d = sc.nextInt(); System.out.print("respuesta:");
                   System.out.println(restar(c,d));
                   break;
               case 3:
                   System.out.println("quiere multiplicar,ponga los 2 valores para  multiplicarlos:");
                   System.out.print("Valor 1:");
                   int e = sc.nextInt();
                   System.out.print("Valor 2:");
                   int f = sc.nextInt(); System.out.print("respuesta:");
                   System.out.println(Multiplicar(e,f));

                   break;
               case 4:
                   System.out.println("quiere dividir,ponga los 2 valores para dividirlos:");
                   System.out.print("Valor 1:");
                   int g = sc.nextInt();
                   System.out.print("Valor 2:");
                   int h = sc.nextInt(); System.out.print("respuesta:");
                   System.out.println(dividir(g,h));
                   break;
               case 5:
                   System.out.println("Salio con exito");

                   break;

           }
       }while(option != 5);


    }
    public static int sumar(int a,int b){
        return a + b;
    }
    public static int restar(int c,int d){
        return c - d;
    }
    public static int Multiplicar(int e,int f){
        return e * f;
    }
    public static int dividir(int g,int h){
        return g / h;
    }




}



