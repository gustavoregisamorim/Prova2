/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

/**
 *
 * @author a1986775
 */
public class PontoYZ extends Ponto2D{
    
    private double y,z;
    private double x = 0;
            
    public PontoYZ(){}
    
    public PontoYZ(double y, double z){
        
        this.y = y;
        this.z = z;
    }
    
    @Override
    public String getNome() {
        
        return getClass().getSimpleName();
    }
    
    @Override
    public String toString(){
        
        String coord = String.format("(%f,%f)",y,z);
        
        return getNome()+coord;
        
    }
    
}
