/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convert;

/**
 *
 * @author cristian
 */
public class ConvertCurrency {
    private int currentexchange;

    public ConvertCurrency(int currentexchange) {
        this.currentexchange = currentexchange;
    }

    public int getCurrentexchange() {
        return currentexchange;
    }

    public void setCurrentexchange(int currentexchange) {
        this.currentexchange = currentexchange;
    }
    public long convert (String tipo,int monto){
        String currency ="colones";
        int result=0;
        if(tipo.equals(currency)){
            result = monto* this.currentexchange;
        }else{
            result = monto/this.currentexchange;
        }
        return result;
    }
}
