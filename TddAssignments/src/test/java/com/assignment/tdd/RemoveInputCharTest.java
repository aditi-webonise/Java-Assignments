package com.assignment.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveInputCharTest {

    RemoveInputChar removeInputChar = new RemoveInputChar();

    @Test
    public void testRemoveInputCharCase1() {
        String actualResult = removeInputChar.removeInputChar("abaadfe",'a');
        assertEquals("badfe", actualResult);
    }

    @Test
    public void testRemoveInputCharCase2() {
        String actualResult = removeInputChar.removeInputChar("ab",'a');
        assertEquals("b",actualResult);
    }

    @Test
    public void testRemoveInputCharCase3() {
        String actualResult = removeInputChar.removeInputChar("aaaaa",'a');
        assertEquals("aa",actualResult);
    }

    @Test
    public void testRemoveInputCharCase4() {
        String actualResult = removeInputChar.removeInputChar("AaAaAa",'a');
        assertEquals("AAaAa",actualResult);
    }

    @Test
    public void testRemoveInputCharCase5() {
        String actualResult = removeInputChar.removeInputChar("aaa",'a');
        assertEquals("",actualResult);
    }

    @Test
    public void testRemoveInputCharCase6() {
        String actualResult = removeInputChar.removeInputChar("a",'a');
        assertEquals("",actualResult);
    }

    @Test
    public void testRemoveInputCharCase7() {
        String actualResult = removeInputChar.removeInputChar("",'a');
        assertEquals("",actualResult);
    }

    @Test
    public void testRemoveInputCharCase8() {
        String actualResult = removeInputChar.removeInputChar("Hello",'y');
        assertEquals("Hello",actualResult);
    }
} 