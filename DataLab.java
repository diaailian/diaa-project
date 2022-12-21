package data.lab;


public class DataLab {

   
    public static void main(String[] args) {
        
    }
        public static int Q1(int []arr){
        int small=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<small)small=arr[i];
        }
        return small;
    }
    public  static  float Q2(float x){
        return 0-x;
    }
    public static boolean contain3(String x,String array[]){
        boolean found =false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                found = true;
                break;
            }
            }
        return found;
        }

         public static void Q3(String S){
             String[] words = S.split("\\s+");
          for(int i = 0; i < words.length; i++) {
        words[i] = words[i].replaceAll("[^\\w]", "");
            }
             StringBuilder sb = new StringBuilder();
             sb.append("[");
             for (int i = 0; i < words.length; i++) {
                 sb.append(words[i]).append(",");
             }
             if(sb.length()>1) {
                 sb.deleteCharAt(sb.length()-1);
             }
             sb.append("]");
             for (int i = 0; i < words.length; i++) {
                 System.out.print(words[i]+",");
             }
         }

         public static int Q33(int temp) {
             int a = 0;
             while (temp > 0) {
                 int rem = temp % 10;
                 a = a * 10 + rem;
                 temp = temp / 10;
             }
             return a;
         }
    public static void Q4(String x) {
        int A[]=new int[10];
        int size=0;
        int i=0;
        int num=Integer.parseInt(x);
            int temp = 0;
            while (num > 0) {
                int digit = num % 10;
                //if digit is 0, make it 5
                if (digit >5) {
                    digit = 1;
                }

              else if (digit<5){
                    digit=0;
                }
                A[i]=digit;
                num = num / 10;
                i++;
                size++;
            }
        for (int j = 0; j <= size; j++) {
            System.out.print(A[j]);
        }

        }
        public static int Q5(char B[]){
        int sum=0;
        int x =0;
            for (int i = 0; i <B.length ; i++) {
              x=Character.getNumericValue(B[i]);
              if (x<0)
                sum+=B[i];
              else sum+=x;
            }
        return sum;
        }

        public static void Q6(int aw[]){
        int a[]=new int[aw.length];
            for (int i = 0; i < aw.length ; i++) {
                a[i]=2*aw[i];
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+",");
            }
        }
        public static int Q7(double N){
        int ax=(int)N/2;
        return ax;
        }
        public static int Q8(String a){
            int NUM=Integer.parseInt(a);
            return NUM;
        }
        public static String Q9(double w,double t){
        double time=w/(t*2);
        if (time<18.5)return "Underweight";
        else if (time<25)return "Normal";
        else if (time<30)return "Overweight";
        else return "Obese";
        }
        public static int Q11(int z){
        int x=z*(z+1)/2;
        return x;
        }
        public static String Q12(String z,String y){
        if (z=="red")return "yellow";
       else if (z=="green")return "yellow";
       else if(z=="yellow"&&y=="green")return "red";
       else return "green";
        }
        public static int Q13(int a[]){
        int x=a[0];
            for (int i = 1; i < a.length; i++) {
                if (x+1!=a[i])return a[i];
                else x++;
            }
            return -1;
        }
     public static void Q14(int z,int x){
        int a[]=new int[x];
         for (int i = 0; i <a.length ; i++) {
             a[i]=z*(i+1);
         }
         for (int i = 0; i <a.length ; i++) {
             System.out.print(a[i]+",");
         }
     }
     public static boolean Q15(int x,int y){
        return y%x==0;
     }
     public static int Q16(int x){
        if (x%100==0)return x/100;
        return (x/100)+1;
     }
    