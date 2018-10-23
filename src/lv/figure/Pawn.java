package lv.figure;

public class Pawn extends Figure {

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    public String toString(){
        if(this.isWhite){
            return "\u2659";
        } else {
            return "\u265F";
        }
    }

}
