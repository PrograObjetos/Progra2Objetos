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
public class Service {
    private int code;
    private String serviceName;

    public Service(int code, String serviceName) {
        this.code = code;
        this.serviceName = serviceName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    
    
}
