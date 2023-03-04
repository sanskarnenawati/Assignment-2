import java.util.Scanner;
public class ArrayMinDist {
    Scanner sc=new Scanner(System.in);
    public int arraymindist(){



        System.out.println("Enter the number of elements you want ");
        int n=sc.nextInt();
        int minindex=0;

        int [ ] array=new int[n];

        for(int i=0;i<n;i++)
        { System.out.println("Enter the element "+i );
            array[i] = sc.nextInt();

        }
        int mindist=array[1]-array[0];
        for (int i=1;i<n;i++){
            int dist=array[i]-array[i-1];
            if (dist<mindist){
                mindist=dist;
                minindex=i-1;
            } else{
                continue;
            }
        }
        return minindex;

    }





    public static void main(String args[]){  ArrayMinDist amd = new ArrayMinDist();
        int mindistindex=amd.arraymindist();
        System.out.println("The element with least distance with neighbour  is at index "+mindistindex);
    }


}
