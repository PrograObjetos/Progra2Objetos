/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2objetos;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *Integer.toString(tempdate.get(1))+" / "+ año
  Integer.toString(tempdate.get(2))+" / "+ mes
  Integer.toString(tempdate.get(5)) diA
 * @author kevin
 */
public class SeasonFactory implements SeasonFactoryCreator {
         GregorianCalendar startDateG = new GregorianCalendar();
         GregorianCalendar endDateG = new GregorianCalendar();
         
    
    @Override
    public Season CreateSeason(String name, int code, Date startDate, Date endDate) {
       
        startDateG.setTime(startDate);
        int mesStartDate = startDateG.get(2);
        int diaStartDate = startDateG.get(5);
        endDateG.setTime(endDate);
        int mesEndDate = endDateG.get(2);
        int diaEndDate = endDateG.get(5);
        
        if((mesStartDate < 6)&&(diaStartDate < 15)) {
            if((mesEndDate < 6)&&(diaEndDate < 15)) {
                return new LowSeason(name, code, startDate, endDate);
            }
        }else if((mesStartDate > 6)&&(diaStartDate > 15)){
            if((mesEndDate > 6)&&(diaEndDate > 15)) {
                return new HighSeason(name, code, startDate, endDate);
            }
        }   
        else{
               return new SpecialSeason(name, code, startDate, endDate);
        }
        return null;
    }
    
}
