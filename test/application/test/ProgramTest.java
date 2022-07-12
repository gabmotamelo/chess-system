package application.test;

import boardgame.Board;
import boardgame.Position;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ProgramTest {

    @Test
    public void testingPositions(){
        Position pos = new Position(3, 5);

        assertThat(pos.getRow(),equalTo(3));
        assertThat(pos.getColumn(),equalTo(5));
    }

    @Test
    public void testingBoard(){
        Board board = new Board(8,8);

        assertThat(board.getRows(),equalTo(8));
        assertThat(board.getColumns(),equalTo(8));
    }
}
