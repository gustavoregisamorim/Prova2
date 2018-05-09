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
public class PontoXY extends Ponto2D{
    
    private double x,y;
    private double z = 0;
    
    public PontoXY(){}
    
    public PontoXY(double x, double y){
        
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String getNome() {
        
        return getClass().getSimpleName();
    }
    
    @Override
    public String toString(){
        
        String coord = String.format("(%f,%f)",x,y);
        
        return getNome()+coord;
        
    }
    
}
