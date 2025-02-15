public class CompareTime {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();
        // nanao time
            long startTime=System.nanoTime();
            for(int i=0;i<100000;i++){
                stringBuffer.append("a");
            }
            long endTime=System.nanoTime();
            System.out.println("stringBuffer time "+(endTime-startTime)+"ns");
        
            long startTime1=System.nanoTime();
            for(int i=0;i<100000;i++){
                stringBuilder.append("a");
            }
            long endTime1=System.nanoTime();
            System.out.println("stringBuilder time "+(endTime1-startTime1)+"ns");
    }
}
