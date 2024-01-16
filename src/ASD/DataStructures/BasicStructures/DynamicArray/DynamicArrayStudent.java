package src.ASD.DataStructures.BasicStructures.DynamicArray;

public class DynamicArrayStudent {

    private Student [] table;
    private int nElems;

    public DynamicArrayStudent(int maxSize)
    {
        table = new Student[maxSize];
        nElems = 0;
    }

    public void add(Student value)
    {
        if (nElems >= table.length)
        {
            Student [] locTable = new Student[table.length*2];
            for (int i=0; i<table.length; i++) locTable[i]=table[i];
            table = locTable;
        }

        table[nElems] = value;
        nElems++;
    }

    public Student get(int index)
    {
        return table[index];
    }

    public int size()
    {
        return nElems;
    }

    public boolean remove(int index)
    {
        if (nElems==0 || index>=nElems || index<0)
            return false;
        for (int j = index; j < nElems-1; j++)
        {
            table[j] = table[j + 1];
        }
        nElems--;
        return true;
    }

    public int find(Student searchElem)
    {
        for (int j = 0; j < nElems; j++)
        {
            if (table[j].equals(searchElem)) return j;
        }
        return -1;
    }

    public int find2(Student searchElem)
    {
        for (int j = 0; j < nElems; j++)
        {
            if (table[j].getImie().equals(searchElem.getImie())
                    && table[j].getNazwisko().equals(searchElem.getNazwisko())
                    && table[j].getAlbum() == (searchElem.getAlbum())
            )
                return j;
        }
        return -1;
    }

    public void print()
    {
        for (int i = 0; i < nElems; i++)
            System.out.print(get(i).toString()+"\n");
        System.out.println();
    }
    public void print2()
    {
        for (int i = 0; i < nElems; i++)
            System.out.print(get(i).getImie()+" "+get(i).getNazwisko()+" "+get(i).getAlbum());
        System.out.println();
    }

    public static void main(String[] args)
    {
        int maxSize = 1;
        DynamicArrayStudent array = new DynamicArrayStudent(maxSize);

        Student s1;
        s1 = new Student("Ola", "Nowak", 12345);
        array.add(s1);

        Student s2= new Student("Ola2", "Nowak2", 123456);
        array.add(s2);

        Student s3 = new Student();
        s3.setImie("Ala");
        s3.setNazwisko("AAAA");
        s3.setAlbum(6543);
        array.add(s3);

        array.add(new Student("Olek", "Tolek", 6789754));

        array.print();


        System.out.println(array.find(s3));
        System.out.println(array.find(s2));
        System.out.println(array.find(new Student("Ola2", "Nowak2", 123456)));
        Student s5 = s2;
        System.out.println(array.find(s5));

        System.out.println("------------- FIND 2 -------------------");
        System.out.println(array.find2(s3));
        System.out.println(array.find2(s2));
        System.out.println(array.find2(new Student("Ola2", "Nowak2", 123456)));
        Student s6 = s2;
        System.out.println(array.find2(s6));


    }
}
