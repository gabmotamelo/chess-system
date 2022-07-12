package pieces.test;

import boardgame.Board;
import boardgame.BoardException;
import boardgame.Position;
import chess.Color;
import chess.pieces.King;
import chess.pieces.Rook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class ChessPieces {

    Board board = new Board(8,8);

    @Test(expected = BoardException.class)
    public void testingIfPositionExistsException(){

        board.placePiece(new Rook(board,Color.WHITE), new Position(9, 1));
        board.placePiece(new King(board,Color.BLACK), new Position(0, 4));

    }
    @Test(expected = BoardException.class)
    public void testingIfThereIsAPieceOnPositionAlreadyException(){

        board.placePiece(new Rook(board,Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board,Color.BLACK), new Position(2, 1));

    }
}
