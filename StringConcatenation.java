public class StringConcatenation {  
    public static void datasets1(){
        System.out.println("time taken by each operations for operations 1000");
        String str="";
        long time1=System.nanoTime();
        
        for(int i=0;i<1000;i++){
            str+="a";
        }
        long time2=System.nanoTime();
        System.out.println("Time taken by string is "+(time2-time1));

        StringBuilder str1=new StringBuilder();
        long time3=System.nanoTime();
        for(int i=0;i<1000;i++){
            str1.append("a");
        }
        long time4=System.nanoTime();
        System.out.println("Time taken by String Builder is : "+(time4-time3));

        StringBuffer sb=new StringBuffer();
        long time5=System.nanoTime();
        for(int i=0;i<1000;i++){
            sb.append("a");
        }
        long time6=System.nanoTime();
        System.out.println("Time taken by String Buffer is : "+(time6-time5));

    }

    public static void datasets2(){
        System.out.println("time taken by each operations for operations 10000");
        String str="";
        long time1=System.nanoTime();
        
        for(int i=0;i<10000;i++){
            str+="a";
        }
        long time2=System.nanoTime();
        System.out.println("Time taken by string is "+(time2-time1));

        StringBuilder str1=new StringBuilder();
        long time3=System.nanoTime();
        for(int i=0;i<10000;i++){
            str1.append("a");
        }
        long time4=System.nanoTime();
        System.out.println("Time taken by String Builder is : "+(time4-time3));

        StringBuffer sb=new StringBuffer();
        long time5=System.nanoTime();
        for(int i=0;i<10000;i++){
            sb.append("a");
        }
        long time6=System.nanoTime();
        System.out.println("Time taken by String Buffer is : "+(time6-time5));

    }

    public static void datasets3(){
        System.out.println("time taken by each operations for operations 100000");
        String str="";
        long time1=System.nanoTime();
        
        for(int i=0;i<1000;i++){
            str+="a";
        }
        long time2=System.nanoTime();
        System.out.println("Time taken by string is "+(time2-time1));

        StringBuilder str1=new StringBuilder();
        long time3=System.nanoTime();
        for(int i=0;i<100000;i++){
            str1.append("a");
        }
        long time4=System.nanoTime();
        System.out.println("Time taken by String Builder is : "+(time4-time3));

        StringBuffer sb=new StringBuffer();
        long time5=System.nanoTime();
        for(int i=0;i<100000;i++){
            sb.append("a");
        }
        long time6=System.nanoTime();
        System.out.println("Time taken by String Buffer is : "+(time6-time5));

    }



    public static void main(String[] args) {
        datasets1();
        datasets2();
        datasets3();
    }
}
