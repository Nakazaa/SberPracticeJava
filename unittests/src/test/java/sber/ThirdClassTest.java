package sber;

import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ThirdClassTest {

    @Test
    public void testWithMock() {
        FirstClass objectOne = mock(FirstClass.class);
        doNothing().when(objectOne).work();
        doNothing().when(objectOne).check();

        SecondClass objectTwo = mock(SecondClass.class);
        doNothing().when(objectTwo).work();
        doNothing().when(objectTwo).check();

        ThirdClass mainObject = new ThirdClass();

        assertEquals("Done.", mainObject.work(objectOne, objectTwo));
        verify(objectOne, times(1)).check();
        verify(objectTwo, times(1)).check();
    }

    @Test
    public void countCalls() {
        FirstClass fObj = new FirstClass();
        SecondClass sObj = new SecondClass();
        ThirdClass thObj = new ThirdClass();

        thObj.work(fObj, sObj);
        assertEquals(1, fObj.count);
        assertEquals(1, sObj.count);
    }

    @Test
    public void throwingExceptionTest() {
        ThirdClass object = new ThirdClass();
        Exception exception = assertThrows(Exception.class, object::exception);
        assertTrue(exception.getMessage().contains("Екзептион!"));
    }

    @Test
    public void privateMethodTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ThirdClass object = new ThirdClass();
        Method method = ThirdClass.class.getDeclaredMethod("work");
        method.setAccessible(true);
        String result = (String) method.invoke(object);
        assertEquals("Приватная работа третьего класса", result);
    }

}