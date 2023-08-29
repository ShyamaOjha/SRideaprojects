import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of answr to see- ");
       int x21321323= sc.nextInt();
       switch (x21321323)
       {
           case 1:
              // Write a java program to convert a given integer (in seconds) to hours, minutes and seconds.Test Data :
               int seconds= sc.nextInt();
               int Second = seconds % 60;
               int Hour = seconds / 60;
               int Min = Hour % 60;
               Hour = Hour / 60;
               System.out.print( Hour + ":" + Min + ":" + Second);
               break;
           case 2:
               //Write a java program to convert a given integer (in days) to years, months and days, assumes that all months have 30 days and all years have 365 days.
               int month = sc.nextInt();
              int year = month / 365;
               month= month % 365;
               System.out.println("No. of years:"+year);
               int week = month/ 7;
               month = month % 7;
               System.out.println("No. of weeks:"+week);
               int day = month;
               System.out.println("No. of days:"+day);
               break;
           case 3:
              // Write a java program to calculate the distance between the two points.
               int x1= sc.nextInt();
               int x2= sc.nextInt();
               int y1= sc.nextInt();
               int y2= sc.nextInt();
               System.out.print("distance between x1 and x2 = "+Math.abs(x1-x2));
               System.out.print("distance between x1 and x2 = "+Math.abs(x1-y1));
               System.out.print("distance between x1 and x2 = "+Math.abs(x1-y2));
               System.out.print("distance between x1 and x2 = "+Math.abs(y1-x2));
        break;
           case 4:
               //write a java program to read an amount (integer value) and break the amount into smallest possible number of bank notes.

           break;
           case 5:
               int p= sc.nextInt();
               int q= sc.nextInt();
               int r= sc.nextInt();
               int s= sc.nextInt();
               if(q > r && s > p && ((r+s) > (p+q)) && (r > 0) && (s > 0) && (p%2 == 0))
               {
                   System.out.println("CORRECT VALUES");
               }
               else
               {
                   System.out.println("WRONG VALUES");
               }
               break;
           case 6:
               System.out.print("enter the size of an array - ");
               int size= sc.nextInt();
               System.out.print("enter the array number - ");
              int oddsum[]=new int[size];int sum=0;
               for (int i = 0; i <oddsum.length ; i++) {
                   oddsum[i]= sc.nextInt();
               }
               for (int i = 0; i<oddsum.length ; i++) {
                   if(oddsum[i]%2!=0)
                   {
                        sum=sum+oddsum[i];
                   }
               }
               System.out.println(sum);
               break;
           case 7:
               int size1= sc.nextInt();
               System.out.print("enter the array number - ");
               int positivecount[]=new int[size1];int count=0;int count1=0;
               for (int i = 0; i <positivecount.length ; i++) {
                   positivecount[i]= sc.nextInt();
               }
               for (int i = 0; i<positivecount.length ; i++) {
                   if(positivecount[i]%2>0)
                   {
                       count++;
                   }
                  else
                   {
                       count1++;
                   }

               }
               System.out.println("negaticve number "+count+"  "+"positve integer = "+count1);
               break;
           case 8:
           //    Write a java program that read 5 numbers and counts the number of positive numbers and print the average of all positive values.
               int size3= sc.nextInt();
               System.out.print("enter the array number - ");
               int positivecountsum[]=new int[size3];int count3=0;int average=0;int sum3=0;
               for (int i = 0; i <positivecountsum.length ; i++) {
                   positivecountsum[i]= sc.nextInt();
               }
               for (int i = 0; i<positivecountsum.length ; i++) {
                   if(positivecountsum[i]>0)
                   {
                       sum3=sum3+positivecountsum[i];
                       count3++;
                   }}
                   System.out.println("sum of average integera are = "+sum3/count3);
                   System.out.println("count are = "+count3);
           break;
           case 9:
               int nine= sc.nextInt();
                   if(nine>0 && nine%2==0)
                   {
                       System.out.print("posive even");
                   }
                   else if(nine>0 && nine%2!=0)
                   {
                       System.out.print("positive odd");
                   }
                   else if(nine<0 && nine %2==0)
                   {
                       System.out.println("negaitve even");
                   }
                   else if(nine<0 && nine %2!=0){
                       System.out.println("negavtive odd");
                   }
               break;

           case 10:
               //Write a java program that accepts some integers from the user and find the highest value and the input position.
               int size4= sc.nextInt();
               System.out.print("enter the array number - ");
               int inputten[]=new int[size4];int max=0;int maxpoint=0;
               for (int i = 0; i <inputten.length ; i++) {
                   inputten[i]= sc.nextInt();
               }
               for (int i = 0; i <inputten.length ; i++) {
                  if(inputten[i]>max)
                  {
                      max=inputten[i];
                      maxpoint=i;
                  }
               }
               System.out.println("maximum number -"+max+" the vlaue is at "+maxpoint);
               break;
           case 11:
               int password= sc.nextInt();
               int realpass=1234;
               if(password==realpass)
               {
                   System.out.println("coorect passowrd");
               }
               else {
                   System.out.println("wrong password");
               }
               break;
           case 12:
               int x11= sc.nextInt();
               int x12= sc.nextInt();
               if(x11>x12)
               {
                   System.out.println("divisor = "+(x11/x12));
               }
               else {
                   System.out.println("not possible");
               }
               break;
           case 13:
               int thiretenn= sc.nextInt();
               for (int i = 1; i <=thiretenn ; i++) {
                   int square=i*i;int cube=i*i*i;
                       System.out.println(i+" "+square+" "+cube);
                   }
                   System.out.println();
               break;
           case 14:
               //smallest number & location
               int size5= sc.nextInt();
               System.out.print("enter the array number - ");
               int mincheck[]=new int[size5];int min=mincheck[0];
               for (int i = 0; i <mincheck.length ; i++) {
                  mincheck[i]= sc.nextInt();
               }int minpoint=0;
               for (int i = 0; i <mincheck.length ; i++) {
                   if(min<mincheck[i])
                   {
                       mincheck[i]=min;
                       minpoint=i;
                   }
               }
               System.out.println("minimum number -"+min+" the vlaue is at "+minpoint);
               break;
           case 15:
               String daycheck= sc.next();
               if(daycheck.equals("Sunday"))
               {
                   System.out.print("Sun = 0");
               }
               if(daycheck.equals("Monday"))
               {
                   System.out.print("Mon = 1");
               }
               if(daycheck.equals("Tuesday"))
               {
                   System.out.print("Tue = 2");
               }
               if(daycheck.equals("Wednesday"))
                 {
               System.out.print("Wed = 3");
                 }
               if(daycheck.equals("Thursday"))
               {
                   System.out.print("Thur = 4");
               }
               if(daycheck.equals("Friday"))
               {
                   System.out.println("Fri = 5");
               }
               if(daycheck.equals("Thursday"))
                   {
                       System.out.print("Sat = 6");
                   }
               break;
           case 16:
               int principalamount= sc.nextInt();
               float time= sc.nextInt();
               float rateofinterest= sc.nextInt();
               float total=0;
               float simpleinterest=(principalamount*time*rateofinterest)/100;
               total =principalamount+(principalamount*time*rateofinterest)/100;

               System.out.println("total amount = "+(total));
               System.out.println("simple intest - "+simpleinterest);
               break;
           case 17:
               for(int i=1; i<=15; i+=3)
               System.out.println(i+" "+(i+2)+" "+(i+4)+" "+(i+6));
               break;
           case 18:

               break;
           case 19:
               int size6= sc.nextInt();
               System.out.print("enter the array number - ");
               float ninques[]=new float[size6];
               for (int i = 0; i <ninques.length ; i++) {
                   ninques[i]= sc.nextFloat();
               }float sum5=0;float sum6=0;int count5=0,count6=0;
               for (int i = 0; i<ninques.length ; i++) {
                   if(ninques[i]>0)
                   {
                       sum5=sum5+ninques[i];
                       count5++;
                   }
               if (ninques[i]<0)
               {
                   sum6=sum6+ninques[i];
                   count6++;
               }}
               System.out.println(count5+" Number of positive numbers: Average  = "+sum5/count5);
               System.out.println(count6+" Number of negative numbers: Average  = "+sum6/count6);
               break;
           case 20:
               int startfrom= sc.nextInt();
                int n=0;int m=0;int x23=startfrom;
               for (int i = 1; i <=10; i++) {
                   startfrom=startfrom+2;
                   System.out.print(startfrom+" ");
                   }
               System.out.println();
       break;
           case 21:
               System.out.println("enter the size");
               int size21= sc.nextInt();
               int a21[]=new int[size21];
               System.out.println("enter the array - ");
               for (int i = 0; i <a21.length ; i++) {
                   a21[i]= sc.nextInt();
               }
               for (int i = 0; i < a21.length; i++) {
                   for (int j = i+1; j <a21.length ; j++) {
                       if(a21[i]==a21[j]){
                           a21[i]=-1;
                           a21[j]=-1;
                       }
                   }
               }
               for (int i = 0; i <a21.length ; i++) {
                   if(a21[i]>0)
                   {
                       System.out.print(a21[i]+" ");
                   }
               }
               break;
       }
       }

}