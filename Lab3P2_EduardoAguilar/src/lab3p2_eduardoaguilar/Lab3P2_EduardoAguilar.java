package lab3p2_eduardoaguilar;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_EduardoAguilar {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        

        
        ArrayList admins = new ArrayList();
        ArrayList motos = new ArrayList();
        ArrayList clientes = new ArrayList();
        ArrayList prograss = new ArrayList();
        System.out.println("1. Ingresar\n"
        +"2. Salir");
        int opcionn = sc.nextInt();
        while(opcionn != 2){
            
        
            System.out.println("Ingres usuario: ");
            String user = sc.next();
            System.out.println("Ingrese password: ");
            String password = sc.next();
            System.out.println("Ingrese entidad: ");
            System.out.println("1. Admin\n"
                    +"2. Programador\n"
                    + "3. Motorista\n"
                    +"4. Cliente");
            int entidad = sc.nextInt();
            switch (entidad){
                case 1:{

                    System.out.println("Ingrese nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese apellido: ");
                    String apellido = sc.next();
                    System.out.println("Ingrese ID: ");
                    int ID = sc.nextInt();
                    System.out.println("Ingrese puesto: ");
                    sc.nextLine();
                    String puesto = sc.nextLine();
                    System.out.println("Ingrese anios en el cargo: ");
                    int anios = sc.nextInt();
                    System.out.println("Ingrese salario: ");
                    int salario = sc.nextInt();
                    System.out.println("Ingrese anios de experiencia en ventas: ");
                    int experiencia = sc.nextInt();

                    Administradores a = new Administradores(nombre, apellido, ID, puesto, anios, salario, experiencia);
                    admins.add(a);



                    System.out.println("Desea modificar su informacion? [S]/[N]");
                    char modif = sc.next().charAt(0);
                    if (modif == 'S'){
                        System.out.println("Ingrese numero de admin a modificar: ");
                        int admin = sc.nextInt();

                        System.out.println("Ingrese cualidad a mejorar: (0-6)");
                        int opcion = sc.nextInt();


                        
                        switch (opcion){ /* David, en estas modificaciones, todas las variables para las nuevas cosas se llaman nombre1
                                                    me dio pereza cambiarle el nombre a cada una*/
                            case 0:{
                                if(admins.get(admin) instanceof Administradores){
                                    System.out.println("Ingrese nuevo nombre: ");
                                    String nombre1 = sc.next();
                                    ((Administradores)admins.get(admin)).setNombre(nombre1);
                                }
                                break;
                            }case 1:{
                                if(admins.get(admin) instanceof Administradores){
                                    System.out.println("Ingrese nuevo apellido: ");
                                    String nombre1 = sc.next();
                                    ((Administradores)admins.get(admin)).setApellido(nombre1);
                                }

                                break;
                            }case 2:{
                                if(admins.get(admin) instanceof Administradores){
                                    System.out.println("Ingrese nuevo ID: ");
                                    int nombre1 = sc.nextInt();
                                    ((Administradores)admins.get(admin)).setID(nombre1);
                                }

                                break;
                            }case 3:{
                                if(admins.get(admin) instanceof Administradores){
                                    System.out.println("Ingrese nuevo puesto: ");
                                    String nombre1 = sc.next();
                                    ((Administradores)admins.get(admin)).setPuesto(nombre1);
                                }

                                break;
                            }case 4:{
                                if(admins.get(admin) instanceof Administradores){
                                    System.out.println("Ingrese nuevo anio: ");
                                    int nombre1 = sc.nextInt();
                                    ((Administradores)admins.get(admin)).setAnios(nombre1);
                                }
                                break;
                            }case 5:{
                                if(admins.get(admin) instanceof Administradores){
                                    System.out.println("Ingrese nuevo salario: ");
                                    int nombre1 = sc.nextInt();
                                    ((Administradores)admins.get(admin)).setSalario(nombre1);
                                }

                                break;
                            }case 6:{
                                if(admins.get(opcion) instanceof Administradores){
                                    System.out.println("Ingrese nuevo anios de experiencia: ");
                                    int nombre1 = sc.nextInt();
                                    ((Administradores)admins.get(admin)).setExperiencia(nombre1);
                                }


                            }
                        }
                       

                    }

                    break;
                }case 2:{
                    System.out.println("Ingrese nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese apellido: ");
                    String apellido = sc.next();
                    System.out.println("Ingrese ID: ");
                    int ID = sc.nextInt();
                    System.out.println("Ingrese puesto: ");
                    sc.nextLine();
                    String puesto = sc.nextLine();
                    System.out.println("Ingrese anios en el cargo: ");
                    int anios = sc.nextInt();
                    System.out.println("Ingrese salario: ");
                    int salario = sc.nextInt();
                    System.out.println("Ingrese lenguaje de programacion que domina: ");
                    String lenguaje = sc.next();
                    System.out.println("Ingrese horario de trabajo: ");
                    sc.nextLine();
                    String horario = sc.nextLine();

                    Programadores p = new Programadores (nombre, apellido, ID, puesto, anios, salario, lenguaje, horario);
                    prograss.add(p);
                    
                    
                    System.out.println("1. Crear\n"
                    +"2. Eliminar\n"
                    +"3. Modificar\n"
                    +"4. Listar\n"
                    +"5. Salir");
                    
                    int option12= sc.nextInt();
                    while (option12!= 5){
                        switch(option12){
                            case 1:{
                                System.out.println("Ingrese Entidad de usuario a crear:\n"
                                +"1. Admin\n"
                                +"2. Motoristas\n"
                                +"3. Clientes\n"
                                +"4. Programadores");
                                int creacion = sc.nextInt();
                                switch(creacion){
                                    case 1:{
                                        System.out.println("Ingrese nombre: ");
                                        String nombree = sc.next();
                                        System.out.println("Ingrese apellido: ");
                                        String apellidoe = sc.next();
                                        System.out.println("Ingrese ID: ");
                                        int IDE = sc.nextInt();
                                        System.out.println("Ingrese puesto: ");
                                        sc.nextLine();
                                        String puestoe = sc.nextLine();
                                        System.out.println("Ingrese anios en el cargo: ");
                                        int aniose = sc.nextInt();
                                        System.out.println("Ingrese salario: ");
                                        int salarioe = sc.nextInt();
                                        System.out.println("Ingrese anios de experiencia en ventas: ");
                                        int experiencia = sc.nextInt();

                                        Administradores a = new Administradores(nombree, apellidoe, IDE, puestoe, aniose, salarioe, experiencia);
                                        admins.add(a);
                                        break;
                                    }case 2:{
                                        System.out.println("Ingrese nombre: ");
                                        nombre = sc.next();
                                        System.out.println("Ingrese apellido: ");
                                        apellido = sc.next();
                                        System.out.println("Ingrese ID: ");
                                        ID = sc.nextInt();
                                        System.out.println("Ingrese puesto: ");
                                        sc.nextLine();
                                        puesto = sc.nextLine();
                                        System.out.println("Ingrese anios en el cargo: ");
                                        anios = sc.nextInt();
                                        System.out.println("Ingrese salario: ");
                                        salario = sc.nextInt();
                                        System.out.println("Ingrese medio de transporte: ");
                                        String transporte = sc.next();

                                        Motoristas m = new Motoristas (nombre, apellido, ID, puesto, anios, salario, transporte);
                                        motos.add(m);
                                        break;
                                    }case 3:{
                                        System.out.println("Ingrese nombre: ");
                                        String nombre1 = sc.next();
                                        System.out.println("Ingrese apellido: ");
                                        String apellido1 = sc.next();
                                        System.out.println("Ingrese ID: ");
                                        int ID1 = sc.nextInt();
                                        System.out.println("Ingrese domicilio: ");
                                        sc.nextLine();
                                        String domicilio = sc.nextLine();

                                        Clientes c = new Clientes (nombre1, apellido1, domicilio, ID1);
                                        clientes.add(c);
                                        break;
                                    }case 4:{
                                        System.out.println("Ingrese nombre: ");
                                       nombre = sc.next();
                                        System.out.println("Ingrese apellido: ");
                                        apellido = sc.next();
                                        System.out.println("Ingrese ID: ");
                                         ID = sc.nextInt();
                                        System.out.println("Ingrese puesto: ");
                                        sc.nextLine();
                                       puesto = sc.nextLine();
                                        System.out.println("Ingrese anios en el cargo: ");
                                        anios = sc.nextInt();
                                        System.out.println("Ingrese salario: ");
                                        salario = sc.nextInt();
                                        System.out.println("Ingrese lenguaje de programacion que domina: ");
                                        lenguaje = sc.next();
                                        System.out.println("Ingrese horario de trabajo: ");
                                        sc.nextLine();
                                        horario = sc.nextLine();

                                        p = new Programadores (nombre, apellido, ID, puesto, anios, salario, lenguaje, horario);
                                        prograss.add(p);
                                        
                                        break;
                                    }
                                }
                                
                                
                                break;
                            }case 2:{
                                System.out.println("Ingrese Entidad de usuario a eliminar:\n"
                                +"1. Admin\n"
                                +"2. Motoristas\n"
                                +"3. Clientes\n"
                                +"4. Programadores");
                                int creacion = sc.nextInt();
                                switch(creacion){
                                    
                                    case 1:{
                                        System.out.println("Ingrese posicion eliminar");
                                        int position = sc.nextInt();
                                        admins.remove(position);
                                        break;
                                    }case 2:{
                                        System.out.println("Ingrese posicion eliminar");
                                        int position = sc.nextInt();
                                        motos.remove(position);
                                        break;
                                    }case 3:{
                                        System.out.println("Ingrese posicion eliminar");
                                        int position = sc.nextInt();
                                        clientes.remove(position);
                                        break;
                                    }case 4:{
                                        System.out.println("Ingrese posicion eliminar");
                                        int position = sc.nextInt();
                                        prograss.remove(position);
                                        break;
                                    }
                                    
                                    
                                }
                                

                                break;
                            }case 3:{
                                System.out.println("Ingrese Entidad de usuario a modificar:\n"
                                +"1. Admin\n"
                                +"2. Motoristas\n"
                                +"3. Clientes\n"
                                );
                                int creacion = sc.nextInt();
                                switch(creacion){
                                    case 1:{
                                        System.out.println("Ingrese numero de admin a modificar: ");
                                        int admin = sc.nextInt();

                                        System.out.println("Ingrese cualidad a mejorar: (0-6)");
                                        int opcion = sc.nextInt();



                                        switch (opcion){ /* David, en estas modificaciones, todas las variables para las nuevas cosas se llaman nombre1
                                                                    me dio pereza cambiarle el nombre a cada una*/
                                            case 0:{
                                                if(admins.get(admin) instanceof Administradores){
                                                    System.out.println("Ingrese nuevo nombre: ");
                                                    String nombre1 = sc.next();
                                                    ((Administradores)admins.get(admin)).setNombre(nombre1);
                                                }
                                                break;
                                            }case 1:{
                                                if(admins.get(admin) instanceof Administradores){
                                                    System.out.println("Ingrese nuevo apellido: ");
                                                    String nombre1 = sc.next();
                                                    ((Administradores)admins.get(admin)).setApellido(nombre1);
                                                }

                                                break;
                                            }case 2:{
                                                if(admins.get(admin) instanceof Administradores){
                                                    System.out.println("Ingrese nuevo ID: ");
                                                    int nombre1 = sc.nextInt();
                                                    ((Administradores)admins.get(admin)).setID(nombre1);
                                                }

                                                break;
                                            }case 3:{
                                                if(admins.get(admin) instanceof Administradores){
                                                    System.out.println("Ingrese nuevo puesto: ");
                                                    String nombre1 = sc.next();
                                                    ((Administradores)admins.get(admin)).setPuesto(nombre1);
                                                }

                                                break;
                                            }case 4:{
                                                if(admins.get(admin) instanceof Administradores){
                                                    System.out.println("Ingrese nuevo anio: ");
                                                    int nombre1 = sc.nextInt();
                                                    ((Administradores)admins.get(admin)).setAnios(nombre1);
                                                }
                                                break;
                                            }case 5:{
                                                if(admins.get(admin) instanceof Administradores){
                                                    System.out.println("Ingrese nuevo salario: ");
                                                    int nombre1 = sc.nextInt();
                                                    ((Administradores)admins.get(admin)).setSalario(nombre1);
                                                }

                                                break;
                                            }case 6:{
                                                if(admins.get(opcion) instanceof Administradores){
                                                    System.out.println("Ingrese nuevo anios de experiencia: ");
                                                    int nombre1 = sc.nextInt();
                                                    ((Administradores)admins.get(admin)).setExperiencia(nombre1);
                                                }


                                            }
                                        }
                                        
                                        break;
                                    }case 2:{
                                        System.out.println("Ingrese posicion de motorista a mejorar: ");
                                        int moto = sc.nextInt();

                                        System.out.println("Ingrese cualidad a modificar: (0-6)");
                                        int opcion = sc.nextInt();

                                        switch(opcion){
                                            case 0:{
                                                if(motos.get( moto) instanceof Motoristas){
                                                    System.out.println("Ingrese nuevo nombre: ");
                                                    String nombre1 = sc.next();
                                                    ((Motoristas)motos.get(moto)).setNombre(nombre1);
                                                }
                                                break;
                                            }case 1:{
                                                if(motos.get( moto) instanceof Motoristas){
                                                    System.out.println("Ingrese nuevo apellido: ");
                                                    String nombre1 = sc.next();
                                                    ((Motoristas)motos.get(moto)).setApellido(nombre1);
                                                }

                                                break;
                                            }case 2:{
                                                if(motos.get( moto) instanceof Motoristas){
                                                    System.out.println("Ingrese nuevo ID: ");
                                                    int nombre1 = sc.nextInt();
                                                    ((Motoristas)motos.get(moto)).setID(nombre1);
                                                }

                                                break;
                                            }case 3:{
                                                if(motos.get( moto) instanceof Motoristas){
                                                    System.out.println("Ingrese nuevo puesto: ");
                                                    String nombre1 = sc.next();
                                                    ((Motoristas)motos.get(moto)).setPuesto(nombre1);
                                                }

                                                break;
                                            }case 4:{
                                                if(motos.get( moto) instanceof Motoristas){
                                                    System.out.println("Ingrese nuevo anio: ");
                                                    int nombre1 = sc.nextInt();
                                                    ((Motoristas)motos.get(moto)).setAnios(nombre1);
                                                }
                                                break;
                                            }case 5:{
                                                if(motos.get( moto) instanceof Motoristas){
                                                    System.out.println("Ingrese nuevo salario: ");
                                                    int nombre1 = sc.nextInt();
                                                    ((Motoristas)motos.get(moto)).setSalario(nombre1);
                                                }
                                                break;
                                            }case 6:{
                                                if(motos.get(moto) instanceof Motoristas){
                                                    System.out.println("Ingrese nuevo medio de transporte: ");
                                                    String nombre1 = sc.next();
                                                    ((Motoristas)motos.get(moto)).setMedio(nombre1);
                                                }
                                            }
                                        }
                                        
                                        break;
                                    }case 3:{
                                        System.out.println("Ingresar posicion de usuario: ");
                                        int usuario = sc.nextInt();

                                        System.out.println("Ingresar opcion a modoficar (0-3)");
                                        int modif = sc.nextInt();

                                        switch(modif){
                                            case 0:{
                                                if(clientes.get(usuario) instanceof Clientes){
                                                    System.out.println("Ingrese nuevo nombre: ");
                                                    String name = sc.next();
                                                    ((Clientes)clientes.get(usuario)).setNombre(name);
                                                }
                                                break;
                                            }case 1:{
                                                if(clientes.get(usuario) instanceof Clientes){
                                                    System.out.println("Ingrese nuevo apellido: ");
                                                    String name = sc.next();
                                                    ((Clientes)clientes.get(usuario)).setApellido(name);
                                                }

                                                break;
                                            }case 2:{
                                                if(clientes.get(usuario) instanceof Clientes){
                                                    System.out.println("Ingrese nuevo domicilio: ");
                                                    sc.nextLine();
                                                    String name = sc.nextLine();
                                                    ((Clientes)clientes.get(usuario)).setDomicilio(name);
                                                }

                                                break;
                                            }case 3:{
                                                if(clientes.get(usuario) instanceof Clientes){
                                                    System.out.println("Ingrese nuevo ID: ");
                                                    int name = sc.nextInt();
                                                    ((Clientes)clientes.get(usuario)).setID(name);
                                                }

                                                break;
                                            }



                                        }
                                        
                                        
                                    }
                                }

                                break;
                            }case 4:{
                                System.out.println("Ingrese Entidad de usuario a listar:\n"
                                +"1. Admin\n"
                                +"2. Motoristas\n"
                                +"3. Clientes\n"
                                +"4. Programadores");
                                int creacion = sc.nextInt();
                                switch(creacion){
                                    case 1:{
                                        System.out.println(admins);
                                        break;
                                    }case 2:{
                                      System.out.println(motos);
                                        break;
                                    }case 3:{
                                        System.out.println(clientes);
                                        break;
                                    }case 4:{
                                        System.out.println(prograss);
                                        
                                    }
                                }
                                
                            }
                        }
                    }
                    
                    
                    

                    break;
                }case 3:{
                    System.out.println("Ingrese nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese apellido: ");
                    String apellido = sc.next();
                    System.out.println("Ingrese ID: ");
                    int ID = sc.nextInt();
                    System.out.println("Ingrese puesto: ");
                    sc.nextLine();
                    String puesto = sc.nextLine();
                    System.out.println("Ingrese anios en el cargo: ");
                    int anios = sc.nextInt();
                    System.out.println("Ingrese salario: ");
                    int salario = sc.nextInt();
                    System.out.println("Ingrese medio de transporte: ");
                    String transporte = sc.next();

                    Motoristas m = new Motoristas (nombre, apellido, ID, puesto, anios, salario, transporte);
                    motos.add(m);
                    
                    System.out.println("Desea modificar su informacion? [S]/[N]");
                    char modif = sc.next().charAt(0);

                    if(modif == 'S'){
                        System.out.println("Ingrese posicion de motorista a mejorar: ");
                        int moto = sc.nextInt();

                        System.out.println("Ingrese cualidad a modificar: (0-6)");
                        int opcion = sc.nextInt();

                        switch(opcion){
                            case 0:{
                                if(motos.get( moto) instanceof Motoristas){
                                    System.out.println("Ingrese nuevo nombre: ");
                                    String nombre1 = sc.next();
                                    ((Motoristas)motos.get(moto)).setNombre(nombre1);
                                }
                                break;
                            }case 1:{
                                if(motos.get( moto) instanceof Motoristas){
                                    System.out.println("Ingrese nuevo apellido: ");
                                    String nombre1 = sc.next();
                                    ((Motoristas)motos.get(moto)).setApellido(nombre1);
                                }

                                break;
                            }case 2:{
                                if(motos.get( moto) instanceof Motoristas){
                                    System.out.println("Ingrese nuevo ID: ");
                                    int nombre1 = sc.nextInt();
                                    ((Motoristas)motos.get(moto)).setID(nombre1);
                                }

                                break;
                            }case 3:{
                                if(motos.get( moto) instanceof Motoristas){
                                    System.out.println("Ingrese nuevo puesto: ");
                                    String nombre1 = sc.next();
                                    ((Motoristas)motos.get(moto)).setPuesto(nombre1);
                                }

                                break;
                            }case 4:{
                                if(motos.get( moto) instanceof Motoristas){
                                    System.out.println("Ingrese nuevo anio: ");
                                    int nombre1 = sc.nextInt();
                                    ((Motoristas)motos.get(moto)).setAnios(nombre1);
                                }
                                break;
                            }case 5:{
                                if(motos.get( moto) instanceof Motoristas){
                                    System.out.println("Ingrese nuevo salario: ");
                                    int nombre1 = sc.nextInt();
                                    ((Motoristas)motos.get(moto)).setSalario(nombre1);
                                }
                                break;
                            }case 6:{
                                if(motos.get(moto) instanceof Motoristas){
                                    System.out.println("Ingrese nuevo medio de transporte: ");
                                    String nombre1 = sc.next();
                                    ((Motoristas)motos.get(moto)).setMedio(nombre1);
                                }
                            }
                        }
                    }
                    break;
                }case 4:{
                    System.out.println("Ingrese nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese apellido: ");
                    String apellido = sc.next();
                    System.out.println("Ingrese ID: ");
                    int ID = sc.nextInt();
                    System.out.println("Ingrese domicilio: ");
                    sc.nextLine();
                    String domicilio = sc.nextLine();

                    Clientes c = new Clientes (nombre, apellido, domicilio, ID);
                    clientes.add(c);
                    
                    System.out.println("1. Modificar\n"
                    +"2. Eliminar\n"
                    +"3. Listar Info\n"
                    +"4. Comprar\n"
                    +"5. Salir");
                    int option = sc.nextInt();
                    
                    while(option !=5){
                        switch (option){
                            case 1:{
                                System.out.println("Ingresar posicion de usuario: ");
                                int usuario = sc.nextInt();
                                
                                System.out.println("Ingresar opcion a modoficar (0-3)");
                                int modif = sc.nextInt();
                                
                                switch(modif){
                                    case 0:{
                                        if(clientes.get(usuario) instanceof Clientes){
                                            System.out.println("Ingrese nuevo nombre: ");
                                            String name = sc.next();
                                            ((Clientes)clientes.get(usuario)).setNombre(name);
                                        }
                                        break;
                                    }case 1:{
                                        if(clientes.get(usuario) instanceof Clientes){
                                            System.out.println("Ingrese nuevo apellido: ");
                                            String name = sc.next();
                                            ((Clientes)clientes.get(usuario)).setApellido(name);
                                        }
                                        
                                        break;
                                    }case 2:{
                                        if(clientes.get(usuario) instanceof Clientes){
                                            System.out.println("Ingrese nuevo domicilio: ");
                                            sc.nextLine();
                                            String name = sc.nextLine();
                                            ((Clientes)clientes.get(usuario)).setDomicilio(name);
                                        }
                                        
                                        break;
                                    }case 3:{
                                        if(clientes.get(usuario) instanceof Clientes){
                                            System.out.println("Ingrese nuevo ID: ");
                                            int name = sc.nextInt();
                                            ((Clientes)clientes.get(usuario)).setID(name);
                                        }
                                        
                                        break;
                                    }
                                    
                                    
                                   
                                }
                                
                                break;
                            }case 2:{
                                System.out.println("Ingrese cliente a eliminar");
                                int eliminar = sc.nextInt();
                                clientes.remove(eliminar);
                                
                                break;
                            }case 3:{
                                System.out.println("Ingrese posicion a listar: ");
                                int posicion = sc.nextInt();
                                System.out.println(clientes.get(posicion));
                                break;
                            }case 4:{
                                        System.out.println("1. Restaurantes\n"
                                        +"2. Tiendas");
                                        int oopcion = sc.nextInt();
                                        
                                        switch(oopcion){
                                            case 1:{
                                                System.out.println("1. Burger King\n"
                                                +"2. Pizza Hut");
                                                int comida = sc.nextInt();
                                                
                                                switch(comida){
                                                    case 1:{
                                                        String ubicacion = "Aeropuerto";
                                                        String restaurante = "Burger King";
                                                        String RTN ="12345";
                                                        String slogan = "El rey de las hamburguesas";
                                                        ArrayList <String> comidas = new ArrayList();
    
                                                        comidas.add("Hamburguesa de Pollo");comidas.add("Hamburguesa de Res");
                                                        Restaurantes r = new Restaurantes(ubicacion, restaurante, RTN, slogan, comidas);
                                                        System.out.println("1. Hamburguesa de pollo L.200\n"
                                                        +"2. Hamburguesa Res L.250");
                                                        int burger = sc.nextInt();
                                                        
                                                        switch (burger){
                                                            case 1:{
                                                                System.out.println("Ingrese cantidad: ");
                                                                String quantity = sc.next();
                                                                String IDD = "124ms";
                                                                String nombree = "Hamburguesa de pollo";
                                                                String precioo="200";
                                                                String cantidad = quantity;
                                                                
                                                                ArrayList acomp1 = new ArrayList();
                                                                acomp1.add("Papas");acomp1.add("Tostones");
                                                                
                                                                Comidas com = new Comidas(IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                
                                                                
                                                                System.out.println("Desea acompaniamiento? [S]/[N]");
                                                                char acomp = sc.next().charAt(0);
                                                                if(acomp == 'S'){
                                                                    System.out.println("1. Papas. L95"
                                                                    +"2. Tostones L. 50");
                                                                    int acompa= sc.nextInt();
                                                                    
                                                                    switch (acompa){
                                                                        case 1:{
                                                                            System.out.println("1. Fritas\n"
                                                                            +"2. Sazonadas");
                                                                            int frite= sc.nextInt();
                                                                            switch(frite){
                                                                                case 1:{
                                                                                    String acompname = "Papas";
                                                                                    String type = "Fritas";
                                                                                    int precio = 95;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                                    break;
                                                                                }case 2:{
                                                                                    String acompname = "Papas";
                                                                                    String type = "Sazonadas";
                                                                                    int precio = 95;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                                    
                                                                                }
                                                                            }
                                                                            break;
                                                                        }case 2:{
                                                                            System.out.println("1. Fritos\n"
                                                                            +"2. Sazonados");
                                                                            int frite= sc.nextInt();
                                                                            switch(frite){
                                                                                case 1:{
                                                                                    String acompname = "Tostones";
                                                                                    String type = "Fritos";
                                                                                    int precio = 50;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                                    break;
                                                                                }case 2:{
                                                                                    String acompname = "Tostones";
                                                                                    String type = "Sazonados";
                                                                                    int precio = 50;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                                    
                                                                                }
                                                                            }
                                                                            
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            }case 2:{
                                                                System.out.println("Ingrese cantidad: ");
                                                                String quantity = sc.next();
                                                                String IDD = "124ms";
                                                                String nombree = "Hamburguesa de Res";
                                                                String precioo="250";
                                                                String cantidad = quantity;
                                                                
                                                                ArrayList acomp1 = new ArrayList();
                                                                acomp1.add("Papas");acomp1.add("Tostones");
                                                                
                                                                Comidas com = new Comidas(IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                
                                                                
                                                                System.out.println("Desea acompaniamiento? [S]/[N]");
                                                                char acomp = sc.next().charAt(0);
                                                                if(acomp == 'S'){
                                                                    System.out.println("1. Papas. L95"
                                                                    +"2. Tostones L. 50");
                                                                    int acompa= sc.nextInt();
                                                                    
                                                                    switch (acompa){
                                                                        case 1:{
                                                                            System.out.println("1. Fritas\n"
                                                                            +"2. Sazonadas");
                                                                            int frite= sc.nextInt();
                                                                            switch(frite){
                                                                                case 1:{
                                                                                    String acompname = "Papas";
                                                                                    String type = "Fritas";
                                                                                    int precio = 95;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                                    break;
                                                                                }case 2:{
                                                                                    String acompname = "Papas";
                                                                                    String type = "Sazonadas";
                                                                                    int precio = 95;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                                    
                                                                                }
                                                                            }
                                                                            break;
                                                                        }case 2:{
                                                                            System.out.println("1. Fritos\n"
                                                                            +"2. Sazonados");
                                                                            int frite= sc.nextInt();
                                                                            switch(frite){
                                                                                case 1:{
                                                                                    String acompname = "Tostones";
                                                                                    String type = "Fritos";
                                                                                    int precio = 50;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                                    break;
                                                                                }case 2:{
                                                                                    String acompname = "Tostones";
                                                                                    String type = "Sazonados";
                                                                                    int precio = 50;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion,restaurante,RTN,slogan,comidas);
                                                                                    
                                                                                }
                                                                            }
                                                                            
                                                                        }
                                                                    }
                                                                }
                                                                
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }case 2:{
                                                        String ubicacion1 = "Boulvard Juan Pablo";
                                                                
                                                        String restaurante1 = "Pizza Hut";
                                                              
                                                        String RTN1 ="12wsb345";
                                                           
                                                        String slogan1 = "El rey de las pizzas";
                                                           
                                                        ArrayList <String> comidas1 = new ArrayList();
                                                        comidas1.add("Pizza Peperoni");comidas1.add("Pizza Jamon");
                                                        Restaurantes r = new Restaurantes(ubicacion1, restaurante1, RTN1, slogan1, comidas1);
                                                        
                                                        
                                                       System.out.println("1. Pizzza Peperoni L.200\n"
                                                        +"2. Pizza Jamon L.250");
                                                        int pizza = sc.nextInt();
                                                        switch(pizza){
                                                            case 1:{
                                                            
                                                                System.out.println("Ingrese cantidad: ");
                                                                String quantity = sc.next();
                                                                String IDD = "124ms";
                                                                String nombree = "Pizza de Peperoni";
                                                                String precioo="200";
                                                                String cantidad = quantity;
                                                                
                                                                ArrayList acomp1 = new ArrayList();
                                                                acomp1.add("Papas");acomp1.add("Tostones");
                                                                
                                                                Comidas com = new Comidas(IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                
                                                                
                                                                System.out.println("Desea acompaniamiento? [S]/[N]");
                                                                char acomp = sc.next().charAt(0);
                                                                if(acomp == 'S'){
                                                                    System.out.println("1. Papas. L95"
                                                                    +"2. Tostones L. 50");
                                                                    int acompa= sc.nextInt();
                                                                    
                                                                    switch (acompa){
                                                                        case 1:{
                                                                            System.out.println("1. Fritas\n"
                                                                            +"2. Sazonadas");
                                                                            int frite= sc.nextInt();
                                                                            switch(frite){
                                                                                case 1:{
                                                                                    String acompname = "Papas";
                                                                                    String type = "Fritas";
                                                                                    int precio = 95;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                                    break;
                                                                                }case 2:{
                                                                                    String acompname = "Papas";
                                                                                    String type = "Sazonadas";
                                                                                    int precio = 95;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                                    
                                                                                }
                                                                            }
                                                                            break;
                                                                        }case 2:{
                                                                            System.out.println("1. Fritos\n"
                                                                            +"2. Sazonados");
                                                                            int frite= sc.nextInt();
                                                                            switch(frite){
                                                                                case 1:{
                                                                                    String acompname = "Tostones";
                                                                                    String type = "Fritos";
                                                                                    int precio = 50;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                                    break;
                                                                                }case 2:{
                                                                                    String acompname = "Tostones";
                                                                                    String type = "Sazonados";
                                                                                    int precio = 50;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            }case 2:{
                                                                System.out.println("Ingrese cantidad: ");
                                                                String quantity = sc.next();
                                                                String IDD = "124ms";
                                                                String nombree = "Pizza de Jamon";
                                                                String precioo="250";
                                                                String cantidad = quantity;
                                                                
                                                                ArrayList acomp1 = new ArrayList();
                                                                acomp1.add("Papas");acomp1.add("Tostones");
                                                                
                                                                Comidas com = new Comidas(IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                
                                                                
                                                                System.out.println("Desea acompaniamiento? [S]/[N]");
                                                                char acomp = sc.next().charAt(0);
                                                                if(acomp == 'S'){
                                                                    System.out.println("1. Papas. L95"
                                                                    +"2. Tostones L. 50");
                                                                    int acompa= sc.nextInt();
                                                                    
                                                                    switch (acompa){
                                                                        case 1:{
                                                                            System.out.println("1. Fritas\n"
                                                                            +"2. Sazonadas");
                                                                            int frite= sc.nextInt();
                                                                            switch(frite){
                                                                                case 1:{
                                                                                    String acompname = "Papas";
                                                                                    String type = "Fritas";
                                                                                    int precio = 95;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                                    break;
                                                                                }case 2:{
                                                                                    String acompname = "Papas";
                                                                                    String type = "Sazonadas";
                                                                                    int precio = 95;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                                    
                                                                                }
                                                                            }
                                                                            break;
                                                                        }case 2:{
                                                                            System.out.println("1. Fritos\n"
                                                                            +"2. Sazonados");
                                                                            int frite= sc.nextInt();
                                                                            switch(frite){
                                                                                case 1:{
                                                                                    String acompname = "Tostones";
                                                                                    String type = "Fritos";
                                                                                    int precio = 50;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                                    break;
                                                                                }case 2:{
                                                                                    String acompname = "Tostones";
                                                                                    String type = "Sazonados";
                                                                                    int precio = 50;
                                                                                    Acompaniamiento acompp = new Acompaniamiento(acompname,type,precio,IDD, nombree, precioo, cantidad,acomp1,ubicacion1,restaurante1,RTN1,slogan1,comidas1);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                
                                                                
                                                            }
                                                        }
                                                break;
                                            }
                                        }
                                        break;
                                    }case 2:{
                                            System.out.println("1.Nike\n"
                                            +"2. Happy Socks");
                                            int optionn = sc.nextInt();
                                            switch(optionn){
                                                case 1:{
                                                    String nombret = "Nike";
                                                    String ubicaciont = "City Mall";
                                                    int empleados = 20;
                                                    int espera = 10;
                                                    ArrayList arti= new ArrayList();
                                                    arti.add("Air Force 1");arti.add("Camisa Barcelona Messi");
                                                    
                                                    Tiendas t = new Tiendas(nombret,ubicaciont,empleados,espera,arti);

                                                    System.out.println("1. Air Force 1\n"+
                                                            "2. Camisa Barcelona Messi");
                                                    int compra = sc.nextInt();
                                                    switch(compra){
                                                        case 1:{
                                                            String articulo = "Air Force 1";
                                                            String categoria = "Zapatos";
                                                            int precio = 2000;
                                                            Articulos art = new Articulos(articulo, categoria, precio, nombret,ubicaciont,empleados,espera,arti);
                                                            break;
                                                        }case 2:{
                                                            String articulo = "Camisa Barcelona Messi";
                                                            String categoria= "Deportes";
                                                            int precio =2500;
                                                            Articulos art = new Articulos(articulo, categoria, precio, nombret,ubicaciont,empleados,espera,arti);
                                                            
                                                        }//fin case 2 
                                                        
                                                        
                                                    }// fin switch compra
                                                    break;
                                                }case 2:{
                                                    String nombret = "Happy Socks";
                                                    String ubicaciont = "Mall Multi Plaza";
                                                    int empleados = 2;
                                                    int espera = 5;
                                                    ArrayList arti= new ArrayList();
                                                    arti.add("Calcetines The Beatles");arti.add("Calzoneta Palmeras");
                                                    
                                                    Tiendas t = new Tiendas(nombret,ubicaciont,empleados,espera,arti);
                                                    System.out.println("1. Calcetines The Beatles\n"+
                                                            "2. Calzoneta Palmeras");
                                                    int eleccion = sc.nextInt();
                                                    switch (eleccion){
                                                        case 1:{
                                                            String articulo = "Calcetines The Beatles";
                                                            String categoria = "Calcetines";
                                                            int precio = 800;
                                                            Articulos art = new Articulos(articulo, categoria, precio, nombret,ubicaciont,empleados,espera,arti);
                                                            
                                                            break;
                                                        }case 2:{
                                                            String articulo = "Calzoneta Palmeras";
                                                            String categoria = "Shorts";
                                                            int precio = 1500;
                                                            Articulos art = new Articulos(articulo, categoria, precio, nombret,ubicaciont,empleados,espera,arti);
                                                        }//fin case 2
                                                    }// fin case eleccion 
                                                }// fin case 2
                                            }// fin switch tiendas
                                    }
                                      
                                        }
                            }
                        }
                    }
                }// fin cases
            }// fin switch entidad
            System.out.println("1. Ingresar\n"
                    +"2. Salir");
            opcionn = sc.nextInt();

        }
    
    }
    
        
    
}

    
