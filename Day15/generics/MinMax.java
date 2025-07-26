package C2TC_CORE_JAVA_PROGRAM.src.Day15.generics;

public interface MinMax<T extends Comparable<T>> {

    T min();

    T max();
}
