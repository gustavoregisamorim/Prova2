package utfpr.ct.dainf.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 *
 * @author
 */
public class Ponto {
    private double x, y, z;

    /**
     * Retorna o nome não qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public Ponto (){
        
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public Ponto (double x, double y, double z){
        
        this.x = x;
        this.y = y;
        this.z = z;    
    }
    
    public double getX(){
        
        return x;
    }
    
    public double getY(){
        
        return y;
    }
    
    public double getZ(){
        
        return z;
    }
    
    public void setX(double x){
        
        this.x = x;
    }
    
    public void setY(double y){
        
        this.y = y;
    }
    
    public void setZ(double z){
        
        this.z = z;
    }
    
    public boolean equals(Ponto ponto1, Ponto ponto2){
        
        return (ponto1.x == ponto2.x && ponto1.y == ponto2.y && ponto1.z == ponto2.z);
        
    }
    
    public static double dist (Ponto ponto1, Ponto ponto2){
        
        double dist;
        
        dist = Math.sqrt(Math.pow((ponto2.x - ponto1.x),2) + Math.pow((ponto2.y - ponto1.y), 2) + Math.pow((ponto2.z - ponto1.z), 2));
        
        return dist;
    }
    
    public String getNome() {
        
        return getClass().getSimpleName();
    }
    
    @Override
    public String toString(){
        
        String coord = String.format("(%f,%f,%f)", x,y,z);
        
        return getNome()+coord;
        
    }

}
