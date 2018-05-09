
import utfpr.ct.dainf.pratica.Ponto;
import utfpr.ct.dainf.pratica.PontoXY;
import utfpr.ct.dainf.pratica.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author 
 */
public class Pratica {

    public static void main(String[] args) {
        
        PontoXZ pontoXZ = new PontoXZ(-3,2);
        PontoXY pontoXY = new PontoXY(0,2);
        Ponto ponto = new Ponto();
        
        System.out.println("Distancia = " + Ponto.dist(pontoXZ, pontoXY));
           
    } 
}
