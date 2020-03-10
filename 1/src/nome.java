import java.util.Scanner;

public class nome {
    public String formataNome(String nome){

        char [] array = nome.toLowerCase().trim().toCharArray();
        char [] retorno = new char[array.length];

        for(int i=0; i < array.length; i++){

            if(i==0){
                retorno[i] = Character.toUpperCase(array[i]);
            }

            if(Character.isSpace(array[i])){
                retorno[i] = Character.toUpperCase(array[i]);
            }
            else{
                retorno[i] = array[i];
            }
        }

        return new String(retorno);
    }
}
