import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import Utilitario.spColor;
import Horarios.Horario;
import Horarios.HorarioFormato;

public class App {
    protected static Scanner datosUsuario = new Scanner(System.in);
    public static final String spCedula = "1752192086";
    public static final String spCorreo = "santiago.pinta@epn.edu.ec";
    public static final String spNombre = "santiago ramiro pinta rogel";
    public static final String[] spUsuariosAceptados = {"santiago.pinta@epn.edu.ec", "profe"};
    public static final String[] spClavesAceptadas = {"1752192086", "1234"};
    public static boolean spIngreso = false;

    public static boolean spLogin(String usuario, String clave) {
        int spIntentos = 0;
        int spContadorIntentos = 1;
        spIngreso = false;
        while (spIntentos != 2 && !spIngreso) {
            if ((usuario.equals(spCorreo) && clave.equals(spCedula))||(usuario.equals(spUsuariosAceptados[1]) && clave.equals(spClavesAceptadas[1]))) {
                System.out.println("\t ..........................");
                System.out.println("\t + Usuario: " + usuario);
                System.out.println("\t + Clave: " + clave);
                System.out.println("\t ..........................");
                System.out.println("\t * Nro de intentos: " + (3 - spIntentos));
                spIngreso = true;
            } else {
                spIntentos++;
                System.out.println("\t Intentos restantes: " + (3 - spIntentos));
                System.out.print("Usuario: ");
                usuario = datosUsuario.nextLine();
                System.out.print("Clave: ");
                clave = datosUsuario.nextLine();
            }
        }
        return spIngreso; 
    }
    
    public static void main(String[] args) throws Exception {
        Utilitario.Utility.clearTerminal();
        System.out.println(spColor.spBLUE + "\t - CEDULA: " + spCedula.toLowerCase());
        System.out.println(spColor.spBOLD_BRIGHT_BLUE + "\t - CORREO: " + spCorreo.toLowerCase());
        System.out.println(spColor.spBLUE + "\t - CEDULA: " + spNombre.toUpperCase());
        
        System.out.print("Ingrese su usuario: ");
        String usuario = datosUsuario.nextLine();
        System.out.print("Ingrese su clave: ");    
        String clave = datosUsuario.nextLine();
        spLogin(usuario, clave);
        if (spIngreso) {
            System.out.println(" :: Bienvenido " + usuario.toUpperCase());
        } else {
            System.out.println("Lo sentimos su clave y usuarios son incorrectos..!");
            System.out.println("Gracias");
        }
        
        System.out.println("------------------------------");
        System.out.println("  Carga horaria de Medicos    ");
        System.out.println("------------------------------");
        System.out.print("Usuario: " + usuario.toUpperCase());

        System.out.println("1 Visualizar Alumnos");
        System.out.println("2 Visualizar Asignaturas");
        System.out.println("3 Visualizar Horario");
        System.out.println("4 Visualizar Horario de una asignatura");
        System.out.println("0 SALIR");

        Horario sp = new Horario();
        HorarioFormato spf = new HorarioFormato();

        System.out.print("Ingresa una opcion: ");
        int opcion = datosUsuario.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("\t [+] Listado de alumnos");
                sp.spShowHorario();
                break;
            case 2:
                System.out.println("\t [+] Listado de asignaturas");
                spf.spImpresion();
            break;
            case 3:
            
            break;
            case 4:
                
            break;
            case 0:
                System.out.println("Regresa pronto " + usuario.toUpperCase());
            break;
            default:
                break;
        }

    }
}
