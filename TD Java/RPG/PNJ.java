package RPG;

public class PNJ extends Personnages {

    public PNJ(String nom, int x, int y){
        super(nom, x, y);
    }

    void soigner(Personnages joueur2){
        if ((joueur2.x==x-1 || joueur2.x==x || joueur2.x==x+1) && (joueur2.y==y-1 || joueur2.y==y || joueur2.y==y+1)){
            joueur2.points += 10 ;
        }
    }
    
}
