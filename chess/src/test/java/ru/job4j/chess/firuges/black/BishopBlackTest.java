package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
       BishopBlack bb = new BishopBlack(Cell.A2);
       assertEquals(bb.position(), Cell.A2);
    }

    @Test
    public void copy() {
        BishopBlack bb = new BishopBlack(Cell.A2);
        Figure cc = bb.copy(Cell.A3);
        assertEquals(cc.position(), Cell.A3);
    }

    @Test
    public void isDiagonal() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        assertTrue(bb.isDiagonal(Cell.G5, Cell.C1));
    }

    @Test
    public void isDiagonalFalse() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        assertFalse(bb.isDiagonal(Cell.F4, Cell.C2));
    }

    @Test
    public void way() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] arr = bb.way(Cell.G5);
        Cell[] actual = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(arr, actual);
    }
}