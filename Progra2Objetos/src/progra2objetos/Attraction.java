/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2objetos;

/**
 *
 * @author kevin
 */
public class Attraction {
    private int ID;
    private String attractionName;

    public Attraction(int ID, String attractionName) {
        this.ID = ID;
        this.attractionName = attractionName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }
    
    
}

