public class ConcatenateUsingStringBuffer {
    public static void main(String[] args) {
        String arr[]={"hello","this","is","the","String"};
        StringBuffer sb=new StringBuffer();
        for(String s:arr){
            sb.append(s);
        }
        System.out.println("concatenated string is: "+sb);
    }
}
