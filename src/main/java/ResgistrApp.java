import java.util.Scanner;

public class ResgistrApp {

    public static boolean registrar(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String str= sc.nextLine();
        if(str.length() == 0){
            System.out.println("Error al iniicar sesion");
            return false;
        }
        return true;
    }

    public static boolean validacion(String str){
        int aiuda = 0, comas = 0;
        for(int i = 0; i < 4; i++){
            if(str.charAt(i) < 48 && str.charAt(i) > 57){
                return false;
            }
        }
        if(str.charAt(4) != '-'){
            return false;
        }
        if(str.charAt(5) != 'I'){
            return false;
        }
        if(str.charAt(5) == 'I' && str.charAt(6) == 'I' && str.charAt(7) != ' '){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'C'){
                aiuda = i;
                break;
            }
        }
        if(str.charAt(aiuda + 1) != 'S'){
            return false;
        }
        aiuda = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                aiuda++;
                if(aiuda == 2){
                    if(str.charAt(i + 1) != 'E'){
                        return false;
                    }
                    if(str.charAt(i+2) != 'N' || str.charAt(i+2) != 'S'){
                        return false;
                    }
                }
            }

        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ','){
                comas++;
            }
        }
        if(comas != 4){
            return false;
        }
        return true;
    }

    public static boolean tituloEnlace(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese titulo: ");
        String str= sc.nextLine();
        if(validacion(str)) {
            System.out.print("Ingrese enlace: ");
            String enlace = sc.nextLine();
            return enlace.contains("https://utec.zoom.us/rec/share/");
        }
        return false;
    }

    public static void main (String [] args) throws FailException {
        if(registrar()){
            if(tituloEnlace()){
                System.out.print("Registro exitoso");
            }
            else{
                throw new FailException("Registro NO exitoso");
            }
        }
    }
}
