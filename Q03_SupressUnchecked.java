import java.util.ArrayList;
public class Q03_SupressUnchecked {
    public static void main(String[] args) {
        try{
            @SuppressWarnings("unchecked")
            ArrayList list = new ArrayList();
            list.add("A");
            list.add("B");
            list.add(1);
            list.add(2);
            for(Object obj : list){
                if(obj instanceof String){
                    System.out.println("String: " + obj);
                }
                else{
                    System.out.println("Integer: " + obj);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception caught"+e);
        }
    }
}
