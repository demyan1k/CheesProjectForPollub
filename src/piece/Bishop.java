package piece;

import main.GamePanel;

public class Bishop extends Piece  {
    public Bishop(int col, int row, int color) {

        super(col, row, color);

        if (color == GamePanel.WHITE){
            image = getImage("/piece/Chess_blt45");
        }
        else {
            image = getImage("/piece/Chess_bdt45");
        }

    }

}
