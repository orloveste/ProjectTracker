package Rusi_26_02_2020;

public interface Dao<T, T1> {
    void create(T account);

    T queryForId(T1 ramzes);
}
