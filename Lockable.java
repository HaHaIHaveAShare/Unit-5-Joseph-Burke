public interface Lockable  {
    void setKey(int l);
    void lock(int l);
    void unlock(int l);
    boolean locked();

}
