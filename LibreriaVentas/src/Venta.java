import java.util.Arrays;
import java.util.Scanner;

public class Venta {




    public static void main(String[] args) {

        Libro trae = new Libro();

        String librosventa[] = new String[]{"1. 100 años de soledad\n", "2. Presidencia Imperial\n", "3. La ciudad y los perros"};




        for (int i = 0; i < librosventa.length; i++) {
            System.out.println("Bienvenido al menu... eliga: ");
            System.out.println(" " + Arrays.toString(librosventa));
            Scanner entrada = new Scanner(System.in);

            String nombre;
            int opcion = entrada.nextInt();

            switch (opcion){

                case 1:
                    trae.setIsbn(1);
                    trae.setTitulo(" 100 años de soledad ");
                    trae.setAutor(" Gabriel Garcia Marquez ");
                    trae.setNumPags(600);

                    System.out.println("El libro con ISBN: "+ trae.getIsbn() + " creado por el autor " + trae.getAutor() + "que tiene "+ trae.getNumPags() + " paginas");

                    break;

                case 2:
                    System.out.println("Numero 2....");
                    break;

                case 3:
                    System.out.println("Numero 3....");
                    break;

                case 4:
                    System.out.println("Numero 4....");
                    break;

                case 5:
                    System.out.println("Numero 5....");
                    break;

                case 6:
                    System.out.println("Numero 6....");
                    break;


                case 7:
                    System.out.println("Numero 7....");
                    break;

                case 8:
                    System.out.println("Numero 8....");
                    break;

                case 9:
                    System.out.println("Numero 9....");
                    break;

                case 10:
                    System.out.println("Numero 10....");
                    break;

            }


        }


    }
}
