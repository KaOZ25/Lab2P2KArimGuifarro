/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_karimguifarro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.*;

/**
 *
 * @author karim
 */
public class Lab2P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random R = new Random();
    public static ArrayList<Alumnos> list = new ArrayList();
    public static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    ;
    public static void main(String[] args) throws ParseException {
        list.add(new Alumnos("Administrador", "Admin", "123", "administrador@unitec.edu", 11911105, new Date(1 / 1 / 1980), "administrador"));
        char k = 'c';
        while (k == 'c') {
            System.out.println("Menu\n"
                    + "1)Log in\n"
                    + "2) Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    String[] o1;
                    String usuario, contraseña;
                    System.out.println("Ingrese el usuario:");
                    usuario = KaOz.next();
                    System.out.println("Ingrese la contraseña:");
                    contraseña = KaOz.next();
                    for (Alumnos o : list) {
                        if (o.getUsuario().equals(usuario) && o.getContra().equals(contraseña) && o.getTipo().equals("administrador")) {
                            char w = 'c';
                            while (w == 'c') {
                                admin(usuario, contraseña);
                                w = 'g';
                            }
                        } 
                    }
                }
                break;
                case 2: {
                    k = 'g';
                }
                break;
                default:
                    System.out.println("Ingreso un valor que se excede de lo permitido favor volver a ingresarlo.");
            }
        }
    }

    public static void admin(String usuario, String contraseña) throws ParseException {
        char c = 'k';
        while (c == 'k') {
            System.out.println("Menu\n"
                    + "1)Crear Alumno\n"
                    + "2)Editar Alumnos\n"
                    + "3)Eliminar Alumnos\n"
                    + "4)Listar Alumnos\n"
                    + "5)Mi Perfil\n"
                    + "6)Administrador Random\n"
                    + "7)Log out");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    String nombre, user, contra, correo, tipo = "";
                    int num_cuenta;
                    boolean flag;
                    Date Fecha_ingreso;
                    System.out.println("Ingrese el nombre:");
                    nombre = KaOz.next();
                    System.out.println("Ingrese el usuario:");
                    user = KaOz.next();
                    flag = us(user);
                    while (flag == true) {
                        System.out.println("El usuario ingresado ya existe, ingreselo de nuveo");
                        user = KaOz.next();
                        flag = us(user);
                    }
                    System.out.println("Ingrese la contraseña");
                    contra = KaOz.next();
                    System.out.println("Ingrese el correo");
                    correo = KaOz.next();
                    flag = co(correo);
                    while (flag == true) {
                        System.out.println("El correo ingresado ya existe, ingreselo de nuveo");
                        correo = KaOz.next();
                        flag = co(correo);
                    }
                    System.out.println("Ingrese el numero de cuenta:");
                    KaOz.nextLine();
                    num_cuenta = KaOz.nextInt();
                    flag = cu(num_cuenta);
                    while (flag == true) {
                        System.out.println("El numero de cuenta ingresado ya existe, ingreselo de nuveo");
                        KaOz.nextLine();
                        num_cuenta = KaOz.nextInt();
                        flag = cu(num_cuenta);
                    }
                    tipo = "alumno";
                    System.out.println("Ingrese la fecha de ingreso:");
                    System.out.println("Dia:");
                    String dia = KaOz.next();
                    System.out.println("Mes:");
                    String mes = KaOz.next();
                    System.out.println("Año");
                    String año = KaOz.next();
                    String fecha = dia + "/" + mes + "/" + año;
                    Fecha_ingreso = formato.parse(fecha);
                    list.add(new Alumnos(nombre, user, contra, correo, num_cuenta, Fecha_ingreso, tipo));
                }//fin case 1
                break;
                case 2: {
                    int pos;
                    System.out.println("Ingrese la posicion del alumno que desea editar");
                    listar();
                    pos = KaOz.nextInt();
                    while (pos < 0 || pos > list.size()) {
                        System.out.println("La posicion es incorrecta favor volver a ingresarla");
                        pos = KaOz.nextInt();
                    }//fin while
                    System.out.println("Menu\n"
                            + "1)Editar todos los datos\n"
                            + "2)Editar datos especificos");
                    int p = KaOz.nextInt();
                    switch (p) {
                        case 1: {
                            String nombre, user, contra, correo, tipo = "";
                            int num_cuenta;
                            boolean flag;
                            Date Fecha_ingreso;
                            System.out.println("Ingrese el nombre:");
                            nombre = KaOz.next();
                            System.out.println("Ingrese el usuario:");
                            user = KaOz.next();
                            flag = us(user);
                            while (flag == true) {
                                System.out.println("El usuario ingresado ya existe, ingreselo de nuveo");
                                user = KaOz.next();
                                flag = us(user);
                            }
                            System.out.println("Ingrese la contraseña");
                            contra = KaOz.next();
                            System.out.println("Ingrese el correo");
                            correo = KaOz.next();
                            flag = co(correo);
                            while (flag == true) {
                                System.out.println("El correo ingresado ya existe, ingreselo de nuveo");
                                correo = KaOz.next();
                                flag = co(correo);
                            }
                            System.out.println("Ingrese el numero de cuenta:");

                            num_cuenta = KaOz.nextInt();
                            flag = cu(num_cuenta);
                            while (flag == true) {
                                System.out.println("El numero de cuenta ingresado ya existe, ingreselo de nuveo");
                                KaOz.nextLine();
                                num_cuenta = KaOz.nextInt();
                                flag = cu(num_cuenta);
                            }
                            System.out.println("Ingrese la fecha de ingreso:");
                            System.out.println("Dia:");
                            String dia = KaOz.next();
                            System.out.println("Mes:");
                            String mes = KaOz.next();
                            System.out.println("Año");
                            String año = KaOz.next();
                            String fecha = dia + "/" + mes + "/" + año;
                            Fecha_ingreso = formato.parse(fecha);
                            list.get(pos).setContra(contra);
                            list.get(pos).setCorreo(correo);
                            list.get(pos).setFecha_ingreso(Fecha_ingreso);
                            list.get(pos).setNombre(nombre);
                            list.get(pos).setNum_cuenta(num_cuenta);
                            list.get(pos).setUsuario(usuario);
                        }
                        break;
                        case 2: {
                            boolean flag;
                            System.out.println("Menu\n"
                                    + "1)Editar Nombre\n"
                                    + "2)Editar Usuario\n"
                                    + "3)Editar Contraseña\n"
                                    + "4)Editar Correo\n"
                                    + "5)Editar Numero de cuenta\n"
                                    + "6) Editar Fecha de ingresp\n");
                            int p1 = KaOz.nextInt();
                            switch (p1) {
                                case 1: {
                                    System.out.println("Ingrese el nombre:");
                                    String nombre = KaOz.next();
                                    list.get(pos).setNombre(nombre);
                                }
                                break;
                                case 2: {
                                    System.out.println("Ingrese el usuario:");
                                    String user = KaOz.next();
                                    flag = us(user);
                                    while (flag == true) {
                                        System.out.println("El usuario ingresado ya existe, ingreselo de nuveo");
                                        user = KaOz.next();
                                        flag = us(user);
                                    }
                                    list.get(pos).getUsuario();
                                }
                                break;
                                case 3: {
                                    System.out.println("Ingrese la contraseña");
                                    String contra = KaOz.next();
                                    list.get(pos).setContra(contra);
                                }
                                break;
                                case 4: {
                                    System.out.println("Ingrese el correo");
                                    String correo = KaOz.next();
                                    flag = co(correo);
                                    while (flag == true) {
                                        System.out.println("El correo ingresado ya existe, ingreselo de nuveo");
                                        correo = KaOz.next();
                                        flag = co(correo);
                                    }
                                    list.get(pos).setCorreo(correo);
                                }
                                break;
                                case 5: {
                                    System.out.println("Ingrese el numero de cuenta:");
                                    KaOz.nextLine();
                                    int num_cuenta = KaOz.nextInt();
                                    flag = cu(num_cuenta);
                                    while (flag == true) {
                                        System.out.println("El numero de cuenta ingresado ya existe, ingreselo de nuveo");
                                        num_cuenta = KaOz.nextInt();
                                        flag = cu(num_cuenta);
                                    }
                                    list.get(pos).setNum_cuenta(num_cuenta);
                                }
                                break;
                                case 6: {
                                    System.out.println("Ingrese la fecha de ingreso:");
                                    System.out.println("Dia:");
                                    String dia = KaOz.next();
                                    System.out.println("Mes:");
                                    String mes = KaOz.next();
                                    System.out.println("Año");
                                    String año = KaOz.next();
                                    String fecha = dia + "/" + mes + "/" + año;
                                    Date Fecha_ingreso = formato.parse(fecha);
                                    list.get(pos).setFecha_ingreso(Fecha_ingreso);
                                }
                                break;
                                default:
                                    System.out.println("Ingrese el valor de nuevo");
                            }//fin switch(p1)
                        }//fin case 2 switch(p)
                    }//fin switch(p)
                }//fin scase 2 
                break;
                case 3: {
                    int pos;
                    System.out.println("Ingrese la posicion del alumno que desea editar");
                    listar();
                    pos = KaOz.nextInt();
                    while (pos < 1 || pos > list.size()) {
                        System.out.println("La posicion es incorrecta favor volver a ingresarla");
                        pos = KaOz.nextInt();
                    }
                    list.remove(pos);
                }//fin case 3
                case 4: {
                    listar();
                }//fin case 4
                break;
                case 5: {
                    int pos;
                    pos = find(usuario);
                    System.out.println("Menu\n"
                            + "1) Editar mis datos\n"
                            + "2) Imprimir mis datos\n");
                    int p1 = KaOz.nextInt();
                    switch (p1) {
                        case 1: {
                            System.out.println("Menu\n"
                                    + "1)Editar todos los datos\n"
                                    + "2)Editar datos especificos");
                            int p = KaOz.nextInt();
                            switch (p) {
                                case 1: {
                                    String nombre, user, contra, correo, tipo = "";
                                    int num_cuenta;
                                    boolean flag;
                                    Date Fecha_ingreso;
                                    System.out.println("Ingrese el nombre:");
                                    nombre = KaOz.next();
                                    System.out.println("Ingrese el usuario:");
                                    user = KaOz.next();
                                    flag = us(user);
                                    while (flag == true) {
                                        System.out.println("El usuario ingresado ya existe, ingreselo de nuveo");
                                        user = KaOz.next();
                                        flag = us(user);
                                    }
                                    System.out.println("Ingrese la contraseña");
                                    contra = KaOz.next();
                                    System.out.println("Ingrese el correo");
                                    correo = KaOz.next();
                                    flag = co(correo);
                                    while (flag == true) {
                                        System.out.println("El correo ingresado ya existe, ingreselo de nuveo");
                                        correo = KaOz.next();
                                        flag = co(correo);
                                    }
                                    System.out.println("Ingrese el numero de cuenta:");

                                    num_cuenta = KaOz.nextInt();
                                    flag = cu(num_cuenta);
                                    while (flag == true) {
                                        System.out.println("El numero de cuenta ingresado ya existe, ingreselo de nuveo");
                                        KaOz.nextLine();
                                        num_cuenta = KaOz.nextInt();
                                        flag = cu(num_cuenta);
                                    }
                                    System.out.println("Ingrese la fecha de ingreso:");
                                    System.out.println("Dia:");
                                    String dia = KaOz.next();
                                    System.out.println("Mes:");
                                    String mes = KaOz.next();
                                    System.out.println("Año");
                                    String año = KaOz.next();
                                    String fecha = dia + "/" + mes + "/" + año;
                                    Fecha_ingreso = formato.parse(fecha);
                                    list.get(pos).setContra(contra);
                                    list.get(pos).setCorreo(correo);
                                    list.get(pos).setFecha_ingreso(Fecha_ingreso);
                                    list.get(pos).setNombre(nombre);
                                    list.get(pos).setNum_cuenta(num_cuenta);
                                    list.get(pos).setUsuario(usuario);
                                }//Fin case 1 de switch(p)
                                break;
                                case 2: {
                                    boolean flag;
                                    System.out.println("Menu\n"
                                            + "1)Editar Nombre\n"
                                            + "2)Editar Usuario\n"
                                            + "3)Editar Contraseña\n"
                                            + "4)Editar Correo\n"
                                            + "5)Editar Numero de cuenta\n"
                                            + "6) Editar Fecha de ingresp\n");
                                    int p2 = KaOz.nextInt();
                                    switch (p2) {
                                        case 1: {
                                            System.out.println("Ingrese el nombre:");
                                            String nombre = KaOz.next();
                                            list.get(pos).setNombre(nombre);
                                        }//Fin case 1 dentro de switch(p2)
                                        break;
                                        case 2: {
                                            System.out.println("Ingrese el usuario:");
                                            String user = KaOz.next();
                                            flag = us(user);
                                            while (flag == true) {
                                                System.out.println("El usuario ingresado ya existe, ingreselo de nuveo");
                                                user = KaOz.next();
                                                flag = us(user);
                                            }
                                            list.get(pos).getUsuario();
                                        }//Fin case 2 dentro de switch(p2)
                                        break;
                                        case 3: {
                                            System.out.println("Ingrese la contraseña");
                                            String contra = KaOz.next();
                                            list.get(pos).setContra(contra);
                                        }//Fin case 3 dentro de switch(p2)
                                        break;
                                        case 4: {
                                            System.out.println("Ingrese el correo");
                                            String correo = KaOz.next();
                                            flag = co(correo);
                                            while (flag == true) {
                                                System.out.println("El correo ingresado ya existe, ingreselo de nuveo");
                                                correo = KaOz.next();
                                                flag = co(correo);
                                            }
                                            list.get(pos).setCorreo(correo);
                                        }//Fin case 4 dentro de switch(p2)
                                        break;
                                        case 5: {
                                            System.out.println("Ingrese el numero de cuenta:");
                                            KaOz.nextLine();
                                            int num_cuenta = KaOz.nextInt();
                                            flag = cu(num_cuenta);
                                            while (flag == true) {
                                                System.out.println("El numero de cuenta ingresado ya existe, ingreselo de nuveo");
                                                num_cuenta = KaOz.nextInt();
                                                flag = cu(num_cuenta);
                                            }
                                            list.get(pos).setNum_cuenta(num_cuenta);
                                        }//Fin case 5 dentro de switch(p2)
                                        break;
                                        case 6: {
                                            System.out.println("Ingrese la fecha de ingreso:");
                                            System.out.println("Dia:");
                                            String dia = KaOz.next();
                                            System.out.println("Mes:");
                                            String mes = KaOz.next();
                                            System.out.println("Año");
                                            String año = KaOz.next();
                                            String fecha = dia + "/" + mes + "/" + año;
                                            Date Fecha_ingreso = formato.parse(fecha);
                                            list.get(pos).setFecha_ingreso(Fecha_ingreso);
                                        }//Fin case 6 dentro de switch(p2)
                                        break;
                                        default:
                                            System.out.println("Ingrese el valor de nuevo");
                                    }//Fin switch(p2)
                                }//Fin de case 2 para seleccion de Editar datos personales
                                break;
                            }//Fin del switch(p)
                        }// Fin case 1 de switch(p1)
                        break;
                        case 2: {
                            System.out.println(list.get(pos));
                        }//Fin case 2 de switch(p1)
                    }//Fin switch(p1)
                }//fin case 5
                break;
                case 6: {
                    boolean flag;
                    flag = adminr(usuario);
                    if (flag == true) {
                        String tip2 = "alumno";
                        int pos = find(usuario);
                        list.get(pos).setTipo(tip2);
                    }
                    System.out.println("Administrador Random ejecutado");
                }//fin case 6
                break;
                case 7: {
                    usuario = "";
                    contraseña = "";
                    c = 'g';
                }//fin case 7
                break;
            }
        }
    }

    public static void alumno(String usuario, String contraseña) {
        char k = 'c';
        while (k == 'c') {
            System.out.println("Menu\n"
                    + "1)Mi Perfil\n\n"
                    + "3)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Mi Perfil\n"
                            + "1)Editar\n"
                            + "2)Imprimir");
                    int p1 = KaOz.nextInt();
                    switch (p1) {
                        case 1: {
                            int pos = find(usuario);
                            System.out.println("Menu"
                                    + "1)Editar Usuario\n"
                                    + "2)Editar Contraseña\n"
                                    + "3)Editar Correo");
                            int p2 = KaOz.nextInt();
                            switch (p2) {
                                case 1: {
                                    System.out.println("Ingrese el usuario:");
                                    String user = KaOz.next();
                                    boolean flag = us(user);
                                    while (flag == true) {
                                        System.out.println("El usuario ingresado ya existe, ingreselo de nuveo");
                                        user = KaOz.next();
                                        flag = us(user);
                                    }
                                    list.get(pos).getUsuario();
                                }
                                break;
                                case 2: {
                                    System.out.println("Ingrese la contraseña");
                                    String contra = KaOz.next();
                                    list.get(pos).setContra(contra);
                                }
                                break;
                                case 3: {
                                    System.out.println("Ingrese el correo");
                                    String correo = KaOz.next();
                                    boolean flag = co(correo);
                                    while (flag == true) {
                                        System.out.println("El correo ingresado ya existe, ingreselo de nuveo");
                                        correo = KaOz.next();
                                        flag = co(correo);
                                    }
                                    list.get(pos).setCorreo(correo);
                                }
                            }//fin switch(p2)
                        }//fin case 1
                        break;
                    }//fin switch(p1)
                }
                break;
                case 2: {
                    int pos = find(usuario);
                    System.out.println(list.get(pos));

                }
                break;
                case 3: {
                    usuario = "";
                    contraseña = "";
                    k = 'g';
                }
                break;
                default:
                    System.out.println("Error ingrese el valor de nuevo");
            }
        }
    }

    public static boolean adminr(String usuario) {
        boolean flag = false;
        int pos = 0 + R.nextInt(list.size());
        int pos2 = find(usuario);
        if (pos != pos2) {
            String tip = "Administrador";
            list.get(pos).setTipo(tip);
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    public static boolean us(String user) {
        boolean flag = false;
        for (Alumnos a : list) {
            if (a.getUsuario().equals(user)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean co(String correo) {
        boolean flag = false;
        for (Alumnos a : list) {
            if (a.getCorreo().equals(correo)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean cu(int num_cuenta) {
        boolean flag = false;
        //String n=Integer.toString(num_cuenta)num_cuenta;
        for (Alumnos a : list) {
            if (a.getNum_cuenta() == num_cuenta) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static void listar() {
        int n = 0;
        for (Alumnos o : list) {
            System.out.println(n + " " + o);
            n++;
        }
    }

    public static int find(String usuario) {
        int ind = -1;
        int bound = list.size();
        for (int userInd = 0; userInd < bound; userInd++) {
            if (list.get(userInd).getUsuario().equals(usuario)) {
                ind = userInd;
                break;
            }
        }
        return ind;
    }
}
