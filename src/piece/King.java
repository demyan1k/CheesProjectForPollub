package piece;

import main.GamePanel;

public class King extends Piece  {
    public King(int col, int row, int color) {

        super(col, row, color);

        if (color == GamePanel.WHITE){
            image = getImage("/piece/Chess_klt45");
        }
        else {
            image = getImage("/piece/Chess_kdt45");
        }

    }

}
