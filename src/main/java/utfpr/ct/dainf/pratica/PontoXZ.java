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
public class PontoXZ extends Ponto2D{
    
    private double x,z;
    private double y = 0;
    
    public PontoXZ(){}
    
    public PontoXZ(double x, double z){
        
        this.x = x;
        this.z = z;
    }
    
    @Override
    public String getNome() {
        
        return getClass().getSimpleName();
    }
    
    @Override
    public String toString(){
        
        String coord = String.format("(%f,%f)",x,z);
        
        return getNome()+coord;
        
    }
}
