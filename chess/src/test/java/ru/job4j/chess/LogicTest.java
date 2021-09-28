package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveImpossible()
            throws ImpossibleMoveException, OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.G4);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFound()
            throws ImpossibleMoveException, OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.D2, Cell.G5);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenCellOccupied()
            throws ImpossibleMoveException, OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E3));
        logic.move(Cell.C1, Cell.G5);
    }
}