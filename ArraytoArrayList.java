import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArraytoArrayList {
    UserInput userinput=new UserInput();
    void arraytoArrayListMethod1()
    {
        String names[]=userinput.createArray(); // String  names[]={"Amit","Anita","Rahul","Anaya"};
        List<String> list=Arrays.asList(names);
        ArrayList<String> al = new ArrayList<String>(list);  System.out.println(al);
    }
    void arraytoArrayListMethod2()
    {
        String names[]=userinput.createArray(); // String  names[]={"Amit","Anita","Rahul","Anaya"};
        ArrayList <String> namesArrayList= new ArrayList<String>();  for (int i =0;i<names.length;i++)
    {
        namesArrayList.add(names[i]);
    }
        System.out.println("ArrayList is");
        System.out.println(namesArrayList);
    }
    void arraylisttoarray()
    {
        String names[]= new String[4];
        ArrayList <String> namesArrayList= userinput.createAlist();
        for(int i=0;i<namesArrayList.size();i++)
        {
            names[i]=namesArrayList.get(i);
        }
        for(int j=0;j<names.length;j++)
        {
            System.out.println("The index "+j+" element of array is "+names[j]);  }
    }
    public static void main(String [] args)
    {
        ArraytoArrayList obj= new ArraytoArrayList();
        System.out.println("Array to Arraylist using .asList()method: ");  obj.arraytoArrayListMethod1();

        System.out.println("Array to Arraylist using direct method: ");  obj.arraytoArrayListMethod2();
        System.out.println("ArrayList to Array conversion : ");  obj.arraylisttoarray();
    }
}
