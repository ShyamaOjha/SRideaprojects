import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int CheckPassword(char str[], int n) {
        int nd=0;
        int l=0;

        for(int i=0; i<n; i++) {
            if(str[i]>='0'&&str[i]<='9') {
                nd=1;
            }
            if(str[i]>='A'&&str[i]<='Z') {
                l=1;
            }
            if(str[i]==' '||str[i]<='/') {
                return 0;
            }
            if(str[0]>='0'&&str[0]<='9') {
                return 0;
            }
        }
        if(n>=4&&nd==1&&l==1) {
            return 1;
        }
        return 0;
    }
    public int[] producrExceptself(int a[])
    {
        int n=a.length;
        int []result = new int[n];
        int leftproduct=1;
        for (int i = 0; i <n ; i++) {
            result[i] = leftproduct;
            leftproduct *= a[i];
        }
        int rightproduct=1;
        for (int i = n-1; i >=0 ; i--) {
            result[i] *= rightproduct;
            rightproduct*=a[i];
        }
        return result;
    }
   public static String MoveHyphen(char str[],int n){
        String x="";
       for (int i = 0; i < n ; i++) {
           if(str[i] == '-'){
               x+=str[i];
           }}
       for (int i = 0; i < n ; i++){
           if(str[i]!='-')
           {
            x+=str[i];
           }
       }
       return x;
   }
   public static void ReplaceCharacter(char str[], int n, char ch1, char ch2){
       for (int i = 0; i <n; i++) {
           if(str[i] == ch1)
           {
               str[i] = ch2;
           }
           else if(str[i] == ch2){
               str[i] = ch1;
           }
       }
       for (int i = 0; i <n ; i++) {
           System.out.print(str[i]);
       }
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the question you want to run - ");
        int x234=sc.nextInt();
        switch (x234)
        {
            case 1:
                String s= sc.next();
                int d=sc.nextInt();
                int c=0;
                String [] arr= {"sun","mon","teu","wed","thus","fri","set"};
                for(int i=0; i<arr.length; i++) {
                    if(arr[i].equals(s)) {
                        int y=arr.length-(i+1);
                        while(d!=0&&d>=6) {
                            d=d-y;
                            y=6;
                            c++;
                        }

                    }
                }
                System.out.print(c);
                break;
            case 2:
                
                break;
            case 3:
            String case3= sc.next();
            int count=0;int count1=0;
                for (int i = 0; i <case3.length() ; i++) {
                    if(case3.charAt(i)=='#')
                    {
                        count++;
                    }
                    if(case3.charAt(i)=='*')
                    {
                        count1++;
                    }
                }
                if(count==count1)
                {
                    System.out.println("valid");
                }
                else{
                    System.out.println("invalid");
                }

                break;
            case 4:
                String c1=sc.next();
                String c2=sc.next();
                String c3=sc.next();
                char a1[]=c1.toCharArray();
                char a02[]=c2.toCharArray();
                char a03[]=c3.toCharArray();

                for (int i = 0; i <a1.length ; i++) {
                    if(a1[i]=='a'||a1[i]=='e'||a1[i]=='i'||a1[i]=='o'||a1[i]=='u'){
                        System.out.print(c1.replace(a1[i],'%'));
                    }}

                for (int i = 0; i <a02.length ; i++) {
                    if(a02[i]=='a'||a02[i]=='e'||a02[i]=='i'||a02[i]=='o'||a02[i]=='u'){

                    }
                    else {
                        System.out.print(c2.replace(a02[i],'#'));
                    }
                }
                System.out.println(c3.toUpperCase());
                    System.out.println();

                break;
            case 5:
                // same as above question 4th.
                break;
            case 6:
                String s6= sc.next();
                char c06[]=s6.toCharArray();
                int n01=c06.length;
                System.out.println(CheckPassword(c06,n01));

                break;
            case 7:
                String sc7=sc.next();
                char c7[]=sc7.toCharArray();
                int n=c7.length;
                System.out.println(MoveHyphen(c7,n));
                break;
            case 8:
                System.out.print("enter the string - ");
                String sc8=sc.next();
                char c8[]=sc8.toCharArray();
                int n1=c8.length;

                System.out.print("enter 1st character - ");
                char c121=sc.next().charAt(0);
                System.out.print("enter 2nd character - ");
                char c122=sc.next().charAt(0);
                ReplaceCharacter(c8,n1,c121,c122);
                break;
            case 11:
            int a2[]={1,2,3,4};
            Main m1=new Main();
            int re[]=m1.producrExceptself(a2);
                System.out.println(Arrays.toString(re));
                break;
        }
    }
}