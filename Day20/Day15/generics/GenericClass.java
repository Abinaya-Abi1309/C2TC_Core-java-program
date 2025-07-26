package C2TC_CORE_JAVA_PROGRAM.src.Day15.generics;
class GenericClass<T>
{
    T data;
    void set(T data)
    {
        this.data=data;
    }

    T get()
    {
        return data;
    }
}