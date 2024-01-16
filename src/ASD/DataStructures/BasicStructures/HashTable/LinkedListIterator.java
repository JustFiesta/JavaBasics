package src.ASD.DataStructures.BasicStructures.HashTable;

import src.ASD.DataStructures.BasicStructures.LinkedList.DoubleLinkedList;

public class LinkedListIterator {
    private ListElem currentElem;

    public LinkedListIterator(LinkedList linkedList)
    {
        currentElem = linkedList.getFirst();
    }

    public boolean hasNext()
    {
        if (currentElem==null) return false;
        return currentElem!=null;
    }

    public src.ASD.DataStructures.BasicStructures.HashTable.ListElem next()
    {
        if (currentElem==null) return null;
        src.ASD.DataStructures.BasicStructures.HashTable.ListElem currElem = currentElem;
        currentElem = currentElem.next;
        return currElem;
    }
}
