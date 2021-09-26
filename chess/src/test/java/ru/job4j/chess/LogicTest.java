package ru.job4j.chess;

import org.junit.Ignore;
import static org.junit.Assert.*;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test
    public void free()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        try {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E3));
        logic.move(Cell.C1, Cell.G5);
        } catch (OccupiedCellException ex) {
            assertEquals(ex.getMessage(), "The way to cell E3 is occupied");
        }
    }
}