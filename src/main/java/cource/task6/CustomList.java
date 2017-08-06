package cource.task6;

import java.util.ArrayList;
import java.util.Collection;


public class CustomList<E> extends ArrayList<E> {

    private static final String EXEPTION_MESSAGE = "Invalid operation";

    @Override
    public E set(int index, Object element) {
        throw new UnsupportedOperationException(EXEPTION_MESSAGE );
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException(EXEPTION_MESSAGE );
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException(EXEPTION_MESSAGE );
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(EXEPTION_MESSAGE );
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException(EXEPTION_MESSAGE );
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException(EXEPTION_MESSAGE );
    }

}

