package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CellTest {

    @Test
    void testCell() {
        Cell cell = new Cell();
        assertNotNull(cell);
        assertEquals(MarkType.EMPTY, cell.getMark());
    }

    @Test
    void testIsEmpty() {
        Cell cell = new Cell();
        assertTrue(cell.isEmpty());

        try {
            cell.setMark(MarkType.X);
            assertFalse(cell.isEmpty());
        } catch (CellAlreadyMarkedException e) {
            fail("CellAlreadyMarkedException was thrown unexpectedly");
        }
    }

    @Test
    void testGetMark() {
        Cell cell = new Cell();
        assertEquals(MarkType.EMPTY, cell.getMark());

        try {
            cell.setMark(MarkType.O);
            assertEquals(MarkType.O, cell.getMark());
        } catch (CellAlreadyMarkedException e) {
            fail("CellAlreadyMarkedException was thrown unexpectedly");
        }
    }

    @Test
    void testSetMark() {
        Cell cell = new Cell();
        try {
            cell.setMark(MarkType.X);
            assertEquals(MarkType.X, cell.getMark());

            assertThrows(CellAlreadyMarkedException.class, () -> {
                cell.setMark(MarkType.O);
            });
        } catch (CellAlreadyMarkedException e) {
            fail("CellAlreadyMarkedException was thrown unexpectedly");
        }
    }
}
