package com.oson.tuple;

/**
 * A {@code Hexakaidecad} is a fixed-size tuple of 16 {@link Comparable} elements.
 *
 * @param <I> the type of elements in this tuple; must implement {@link Comparable}
 */
public class Hexakaidecad<I extends Comparable<I>> extends Tuple<I> {
    @SuppressWarnings("unchecked")
    public Hexakaidecad(
            I item1,
            I item2,
            I item3,
            I item4,
            I item5,
            I item6,
            I item7,
            I item8,
            I item9,
            I item10,
            I item11,
            I item12,
            I item13,
            I item14,
            I item15,
            I item16
    ) {
        super(
                16,
                (I[]) new Comparable[]{
                        item1,
                        item2,
                        item3,
                        item4,
                        item5,
                        item6,
                        item7,
                        item8,
                        item9,
                        item10,
                        item11,
                        item12,
                        item13,
                        item14,
                        item15,
                        item16
                }
        );
    }

    @Override
    public I fetch(int idx) {
        if ((idx < 0) || (idx > 15)) {
            throw new IndexOutOfBoundsException("A hexakaidecad contains 16 elements!");
        }
        return super.fetch(idx);
    }
}