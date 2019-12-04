package operador;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validator{
    Scanner input = new Scanner(System.in);
  
    public static boolean validator(String cpf){
        Pattern pattern = Pattern.compile("^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}+$");
        Matcher matcher = pattern.matcher(cpf);   
        return matcher.matches();
    }
}