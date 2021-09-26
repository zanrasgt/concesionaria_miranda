package autos_1;

import java.util.Scanner;

public class Autos_1 {

    /*int sedanEconomico = 18940;
    int sedan = 23570;
    int deportivo = 24100;
    int hibrido = 25100;
    int coupe = 19350;
    int coupeDeportivo = 24100;
    int compacto = 16190;
    int hatchback = 20150;
    int economicoVersionRally = 34700;*/
    //El metodo void main contiene el menu principal
    public static void main(String[] args) {

        int sedanEconomico = 18940;
        int sedan = 23570;
        int deportivo = 24100;
        int hibrido = 25100;
        int coupe = 19350;
        int coupeDeportivo = 24100;
        int compacto = 16190;
        int hatchback = 20150;
        int economicoVersionRally = 34700;

        Scanner teclado = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("   CONCESIONARIO DE AUTOS MIRANDA    ");
        System.out.println("        - MENU PRINCIPAL -           ");
        System.out.println("*************************************");
        System.out.println("* 1.- Tipo de Automóvil             *");
        System.out.println("* 2.- salir                         *");
        System.out.println("*************************************");

        int menuPrincipal = teclado.nextInt();
        if (menuPrincipal == 1) {
            menuGama();
        }

    }

    public static void menuGama() {
        
        System.out.println("*************************************");
        System.out.println("   CONCESIONARIO DE AUTOS MIRANDA    ");
        System.out.println("        - MENU PRINCIPAL -           ");
        System.out.println("*************************************");
        System.out.println("1.- Sedán Económico");
        System.out.println("2.- Sedán");
        System.out.println("3.- Deportivo");
        System.out.println("4.- Híbrido");
        System.out.println("5.- Coupe");
        System.out.println("6.- Coupe Deportivo");
        System.out.println("7.- Compacto");
        System.out.println("8.- Hatchback");
        System.out.println("9.- Económico Versión Rally");
        System.out.println("*************************************");
        

        Scanner teclado1 = new Scanner(System.in);
        int ventas = teclado1.nextInt();

        switch (ventas) {
            case 1:
                System.out.println("*************************************");
                System.out.println("   CONCESIONARIO DE AUTOS MIRANDA    ");
                System.out.println("        - VENTA DE VEHICULO -        ");
                System.out.println("*************************************\n");
                sE();
                break;

            case 2:
                System.out.println("*************************************");
                System.out.println("   CONCESIONARIO DE AUTOS MIRANDA    ");
                System.out.println("        - VENTA DE VEHICULO -        ");
                System.out.println("*************************************\n");
                sed();
                break;
            case 3:
                System.out.println("*************************************");
                System.out.println("   CONCESIONARIO DE AUTOS MIRANDA    ");
                System.out.println("        - VENTA DE VEHICULO -        ");
                System.out.println("*************************************\n");
                dep();
                break;
                case 4:
                System.out.println("*************************************");
                System.out.println("   CONCESIONARIO DE AUTOS MIRANDA    ");
                System.out.println("        - VENTA DE VEHICULO -        ");
                System.out.println("*************************************\n");
                dep();
                break;
                case 5:
                System.out.println("*************************************");
                System.out.println("   CONCESIONARIO DE AUTOS MIRANDA    ");
                System.out.println("        - VENTA DE VEHICULO -        ");
                System.out.println("*************************************\n");
                dep();
                break;
            default:
        }
        

        
    }

    public static void sE() {

        Scanner teclado1 = new Scanner(System.in);
        int ventas = teclado1.nextInt();

        int sedanEconomico = 18940;

        System.out.println("La gama seleccionada es: Sedán Economico      " + sedanEconomico);
        System.out.println("Amenidades: Ninguna ");
        System.out.println("Total:                                        " + sedanEconomico);

    }

    public static void sed() {

        Scanner teclado1 = new Scanner(System.in);
        int ventas = teclado1.nextInt();

        int sedan = 23570;

        System.out.println("La gama seleccionada es: Sedán Economico      " + sedan);
        System.out.println("Amenidades: Ninguna ");
        System.out.println("Total:                                        " + sedan);

    }

    public static void dep() {

        Scanner teclado1 = new Scanner(System.in);
        int ventas = teclado1.nextInt();

        int deportivo = 24100;

        System.out.println("La gama seleccionada es: Sedán Economico      " + deportivo);
        System.out.println("Amenidades: Ninguna ");
        System.out.println("Total:                                        " + deportivo);

    }
    
    public static void hib() {

        Scanner teclado1 = new Scanner(System.in);
        int ventas = teclado1.nextInt();

        int hibrido = 25100;

        System.out.println("La gama seleccionada es: Híbrido              " + hibrido);
        System.out.println("Amenidades: Ninguna ");
        System.out.println("Total:                                        " + hibrido);

    }
    
    public static void cou() {

        Scanner teclado1 = new Scanner(System.in);
        int ventas = teclado1.nextInt();

        int coupe = 19350;

        System.out.println("La gama seleccionada es: Coupe                " + coupe);
        System.out.println("Amenidades: Ninguna ");
        System.out.println("Total:                                        " + coupe);

    }

}
