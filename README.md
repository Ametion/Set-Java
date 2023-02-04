This is Set data structure.  
This is generic Set created using my custom generic linked list.

Here you have that functions:

int GetSize(); \
void AddItem(T data);\
void Remove(T data);\
void Remove(int index);\
Boolean Contains(T data);\
Set<T> Union(Set<T> otherSet);\
Set<T> Intersection(Set<T> otherSet);\
Set<T> Difference(Set<T> otherSet);\
Boolean IsEmpty();\
Iterator<T> iterator();\