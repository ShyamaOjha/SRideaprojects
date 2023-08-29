public class Main{
    public static void array(int a[])
    {
        //output bubble sort
        for(int i=0;i<a.length;i++)
        {
         //   a[i] = output
        }
    }

    public static void main(String[] args) {
        int a[]={1,5,3,2,7};
        //output
        //for(output)
        {
            for(int j=0;j<a.length;j++)
            {
               // if(a[j]< a[j+1] or a[j]> a[j+1])
                {
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
       // array();
    }
}

// a b a  a b hello