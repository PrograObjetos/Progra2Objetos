package Exeptions;

/**
 *
 * @author cristian
 */
public class ValidateExeption {

    public ValidateExeption() {
    }
    
    public  void Exeption(String pass) throws CustomExeption{
        char[] charPassword = pass.toCharArray();
        if (!(pass.length() <20)||(pass.length()<6)){
            throw new CustomExeption("Password Fuera de Rango");
        }
        
        int count = 0;
        for (int i = 0; i < charPassword.length; i++) {
             
                int temp = (int) charPassword[i];
                if((temp>47) &&(temp<58) ){
                    count ++;
                }

          }
          if(count == 0){
              throw new CustomExeption("The pass doesn't have integer values.");
          }
        
        
    
    }
    
}
