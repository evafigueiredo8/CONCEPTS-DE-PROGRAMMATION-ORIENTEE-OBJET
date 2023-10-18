package RPG;

public class Personnages {
    private String nom;
    public int points = 100;
    public int x;
    public int y;
    private int orientation;
    static int nbtotal;
    public final static int NORD = 1, EST = 2, SUD = 3, OUEST = 4;

    public Personnages(String nom){
        this.nom = nom;
        this.x = 0;
        this.y = 0;
        this.orientation = 1;
        nbtotal += 1;
    }

    public Personnages(String nom, int x, int y){
        this.nom = nom;
        this.x = 0;
        this.y = 0;
        this.orientation = 1;
        nbtotal += 1;
    }

    void modifOrientation(int orientation){
        this.orientation = orientation;
    }

    void deplacer(){
        if (this.orientation == 1 && x <= 0 && y <= 0) {
            this.y += 1;
        } else if (this.orientation == 2 && x <= 0 && y <= 0) {
            this.x += 1;
        } else if (this.orientation == 3 && x < 0 && y < 0) {
            this.y -= 1;
        } else if (this.orientation == 4 && x < 0 && y < 0) {
            this.x -= 1;
            }
        else {
            System.out.println("Le robot ne peut pas aller en négatif.");
        }
        
    }

    void attaquer(Personnages joueur2){
        if ((joueur2.x==x-1 || joueur2.x==x || joueur2.x==x+1) && (joueur2.y==y-1 || joueur2.y==y || joueur2.y==y+1)){
            joueur2.points -= 10 ;
        }
    }

}
