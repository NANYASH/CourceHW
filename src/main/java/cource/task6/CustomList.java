package cource.task6;

import java.util.ArrayList;
import java.util.Collection;

public class CustomList<E> extends ArrayList<E> {

    private static final String EXCEPTION_MESSAGE = "Invalid operation";

    @Override
    public E set(int index, Object element) {throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException(EXCEPTION_MESSAGE);
    }

}

