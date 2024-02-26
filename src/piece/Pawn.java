package piece;

import main.GamePanel;

public class Pawn extends Piece  {
    public Pawn(int col, int row, int color) {

        super(col, row, color);

        if (color == GamePanel.WHITE){
            image = getImage("/piece/Chess_plt45");
        }
        else {
            image = getImage("/piece/Chess_pdt45");
        }

    }

}
