import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Scanner sc=new Scanner(System.in);

        double nota;

        int Suspendidos=0,Aprovados=0,Condicionados=0,Notaincorrecta=0;


        for (int i=0;i<5; i++)
        {
            System.out.println("introduce la nota del alumno " +(i+1)+": ");
            nota=sc.nextDouble();


            if (nota<4)
                Suspendidos++;
            else{
                if(nota==4)
                Condicionados++;
                else{
                    if(nota>4&&nota<10)
                    Aprovados++;
                    else{
                        System.out.println("Nota incorrecta");
                        Notaincorrecta++;
                    }
                }

            }
        }
        System.out.println("La cantidad de alumnos aprovados es: " +Aprovados);
        System.out.println("La cantidad de alumnos condicionalmente aprovados es: " +Condicionados);
        System.out.println("La cantidad de alumnos suspendidos es: " +Suspendidos);
        System.out.println("La cantidad de notas introducidas incorrectamente es: " +Notaincorrecta);
} }
