package Figures;
public class Cercle extends Figure2D {
    private int rayon;

    public Cercle(String nom, int rayon){
        super(nom);
        this.rayon = rayon;
    }

    public double perimetre(){
        return 2*Math.PI*rayon;
    }
    
    public double aire(){
        return Math.PI*rayon*rayon;
    }

}
