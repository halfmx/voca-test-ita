import java.io.*;
/*
 * Fecha de compilación: 2:46PM, 11/23/2014.
 * Versión: 1.2.
 * Autor: Grupo 1 ingenieria en TIC's Instituto Tecnológico de Aguascalientes.
 */
class Vocatest
{
    public static String matriz[];
    public static int Matriz[], realizado=0, prueba=0;
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static int industrial=0, gestion=0, quimica=0, mecanica=0, tics=0, materia=0;
    public static void main(String [] a) throws IOException
    {        
        int opc;
        do
        {
            System.out.println("_______________________________________________________");            
            System.out.println("\tTest vocacional VOCATEC");
            System.out.println("Grupo 1, Ingenieria en TIC's, Turno Matutino.");
            System.out.println(" ");
            if(realizado==0)
            {
                System.out.println("(1) \tRealizar por primera vez el test");
            }
            else
            {
                System.out.println("(1) \tRealizar de nuevo el test");
            }
            if(realizado>0)
            {
                System.out.println("(2) \tRevisa tu resultado");
                System.out.println("(3) \tReiniciar el programa");
            }
            System.out.println("(0) \tSalir");            
            System.out.print("\nIngresa la opcion deseada  -");            
            opc = Integer.parseInt(entrada.readLine());
            switch(opc)
            {
                case 1: test();
                break;
                case 2: resultado();
                break;
                case 3: reset();
                break;
                case 0: salir();
                break;
            }
        }while(opc!=0);
    }
    public static void test() throws IOException
    {
        System.out.println("_______________________________________________________");
        matriz = new String [18];
        Matriz = new int [18];
        matriz[0] = "¿Identificas los problemas que existen en tu entorno?";
        Matriz[0] = 1;
        matriz[1] = "¿Elaboras diagnosticos  en las que identificas las necesidades \n mas urgentes de un problema definido?";
        Matriz[1] = 1;
        matriz[2] = "¿Eres bueno observando analizando y sintetizando informacion?";
        Matriz[2] = 1;
        matriz[3] = "¿Administras tu tiempo?";
        Matriz[3] = 2;
        matriz[4] = "¿Eres sociable?";
        Matriz[4] = 2;
        matriz[5] = "¿Eres ordenado?";
        Matriz[5] = 2;
        matriz[6] = "¿Te preocupa tu medio ambiente?";
        Matriz[6] = 3;
        matriz[7] = "¿Te llama la atencion la composicion de las sustancias?";
        Matriz[7] = 3;
        matriz[8] = "¿Buscas una calidad ambiental?";
        Matriz[8] = 3;
        matriz[9] = "¿Buscas como eficientar procesos?";
        Matriz[9] = 4;
        matriz[10] = "¿Eres creativo?";
        Matriz[10] = 4;
        matriz[11] = "¿Te gusta la fisica?";
        Matriz[11] = 4;
        matriz[12] = "¿Usas la tecnologia para eficientar tus labores?";
        Matriz[12] = 5;
        matriz[13] = "¿Eres lider?";
        Matriz[13] = 5;
        matriz[14] = "¿Buscas nuevas tecnologias a usar?";
        Matriz[14] = 5;
        matriz[15] = "¿Eres metodico?";
        Matriz[15] = 6;
        matriz[16] = "¿Cuentas con bases de matematicas y quimica?";
        Matriz[16] = 6;
        matriz[17] = ("¿Te atrae la investigacion?");
        Matriz[17] = 6;
            System.out.println("Hola, este programa te ayudara a saber si la carrera");
            System.out.println("que estas estudianto o lo que vas a escoger, es la mas");
            System.out.println("adecuada para ti con respecto a tu forma de ser.");
            System.out.println("Contesta las siguientes preguntas con los numeros SI(1) NO(0)");
            for(int i=0;i<18;i++)
            {                
                System.out.println("Pregunta numero "+(i+1));
                System.out.println(matriz[i]);
                System.out.println("Si(1) No(0)");
                int respuesta = Integer.parseInt(entrada.readLine());
                if(Matriz[i]==1)
                {
                    if(respuesta ==1)
                    {
                        industrial=industrial+1;
                    }
                }
                if(Matriz[i]==2)
                {
                    if(respuesta ==1)
                    {
                        gestion=gestion+1;
                    }
                }
                if(Matriz[i]==3)
                {
                    if(respuesta ==1)
                    {
                        quimica=quimica+1;
                    }
                }
                if(Matriz[i]==4)
                {
                    if(respuesta ==1)
                    {
                        mecanica=mecanica+1;
                    }
                }
                if(Matriz[i]==5)
                {
                    if(respuesta ==1)
                    {
                        tics=tics+1;
                    }
                }
                if(Matriz[i]==6)
                {
                    if(respuesta ==1)
                    {
                        materia=materia+1;
                    }
                }
            }
        System.out.println("Haz terminado el test");        
        realizado= realizado+1;
    }
    public static void resultado() throws IOException
    {
        System.out.println("_______________________________________________________");
        int resultado[], cb, toque;
        resultado = new int [6];
        resultado[0]= industrial ;
        resultado[1]= gestion;
        resultado[2]= quimica;
        resultado[3]= mecanica;
        resultado[4]= tics;
        resultado[5]= materia;
        cb = resultado[0];
        for(int i=0;i<6;i++)
        {
            if(cb < resultado[i])
            {
                cb = resultado[i];
            }
        }
        if(prueba>0)
        {
            System.out.println(cb);
            return;
        }
        if(cb==resultado[0])
        {
            System.out.println("Felicidades, resultaste apto para Ingenieria Industrial");
        }
        if(cb==resultado[1])
        {
            System.out.println("Felicidades, resultaste apto para Ingenieria en Gestion Empresarial");
        }
        if(cb==resultado[2])
        {
            System.out.println("Felicidades, resultaste apto para Ingenieria Quimica");
        }
        if(cb==resultado[3])
        {
            System.out.println("Felicidades, resultaste apto para Ingenieria Mecanica");
        }
        if(cb==resultado[4])
        {
            System.out.println("Felicidades, resultaste apto para Ingenieria en TIC's");
        }
        if(cb==resultado[5])
        {
            System.out.println("Felicidades, resultaste apto para Ingenieria en Materiales");
        }
    }
    public static void reset() throws IOException
    {
        System.out.println("_______________________________________________________");
        System.out.println("¿Seguro que quieres resetear la aplicacion? Si(1) No(0)");
        int decision = Integer.parseInt(entrada.readLine());
        if(decision == 1)
        {
            System.out.println("Haz decidido borrar todos los datos");
            industrial=0;
            gestion=0;
            quimica=0;
            mecanica=0;
            tics=0;
            materia=0;
            realizado=0;
            System.out.println("Los datos han sido borrados con exito");
        }
        else
        {
            System.out.println("Los datos no han sido borrados");
        }        
    }
     public static void salir() throws IOException
    {
        System.out.println("_______________________________________________________");
        System.out.println("Gracias por utilizar nuestro software.");
        System.out.println("_______________________________________________________");
    }
}