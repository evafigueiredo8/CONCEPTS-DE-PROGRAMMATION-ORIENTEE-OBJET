package Figures;
public class Rectangle extends Figure2D {
    private int longueur;
    private int largeur;

    public Rectangle(String nom, int longueur, int largeur){
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int perimetre(){
        return (longueur+largeur)*2;
    }

    public int aire(){
        return (longueur*largeur);
    }
}
