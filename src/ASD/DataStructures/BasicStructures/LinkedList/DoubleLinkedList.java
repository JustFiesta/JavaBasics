package src.ASD.DataStructures.BasicStructures.LinkedList;
public class DoubleLinkedList
{
    private ListElem first;
    private ListElem last;

    public DoubleLinkedList()
    {
        first = null;
        last = null;
    }

    public boolean isEmpty()
    {
        return (first == null);
    }
    public ListElem getFirst()
    {
        return first;
    }
    public void insertFirst(int value)
    {
        ListElem newElem = new ListElem(value);

        if(isEmpty()) last = newElem;
        else first.previous = newElem;

        newElem.next = first;
        first = newElem;
    }

    public void insertLast(int value)
    {
        ListElem newElem = new ListElem(value);
        if (isEmpty()) first = newElem;
        else
        {
            last.next = newElem;
            newElem.previous = last;
        }
        last = newElem;
    }


    public ListElem deleteFirst()
    {
        if (isEmpty()) return null;

        ListElem temp = first;
        if(first.next == null) last = null;
        else first.next.previous = null;
        first = first.next;
        return temp;
    }

    public ListElem deleteLast()
    {
        if (isEmpty()) return null;

        ListElem temp = last;
        if(first.next == null) first = null;
        else last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public void print()
    {
        System.out.print("Lista: ");
        ListElem current = first;
        while (current != null)
        {
            System.out.print(current.toString()+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoubleLinkedList theList = new DoubleLinkedList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        theList.print();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.print();

        theList.deleteLast();

        theList.print();

    }
}
