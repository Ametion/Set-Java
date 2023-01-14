import java.util.Iterator;

class Set<T> implements Iterable<T> {
    private LinkedList<T> list = new LinkedList<>();

    public int GetSize(){
        return list.GetSize();
    }

    public void AddItem(T data){
        if(IsEmpty()){
            list.Add(data);
        }

        if(list.Contains(data)){
            return;
        }

        list.Add(data);
    }

    public void Remove(T data){
        list.Remove(data);
    }

    public void Remove(int index){
        list.RemoveAt(index);
    }

    public Boolean Contains(T data){
        return list.Contains(data);
    }

    public Set<T> Union(Set<T> otherSet){
        var newSet = new Set<T>();

        for(var el: list){
            newSet.AddItem(el);
        }

        for(var el: otherSet){
            newSet.AddItem(el);
        }

        return newSet;
    }

    public Set<T> Intersection(Set<T> otherSet){
        var newSet = new Set<T>();

        for(var el: otherSet){
            if(list.Contains(el)){
                newSet.AddItem(el);
            }
        }

        for(var el: list){
            if(otherSet.Contains(el)){
                newSet.AddItem(el);
            }
        }

        return newSet;
    }

    public Set<T> Difference(Set<T> otherSet){
        var newSet = new Set<T>();

        for(var el: list){
            if(!otherSet.Contains(el)){
                newSet.AddItem(el);
            }
        }

        return newSet;
    }

    public Boolean IsEmpty(){
        return list.GetSize() == 0;
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }
}