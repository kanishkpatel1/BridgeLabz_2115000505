public class q06_SpringSeason {
    public static boolean isSpring(int month,int day){
        if((month==3 && day>=20 && day<=31)||(month==4 && day>=1 && day<=30) || (month==5 && day>=1 && day<=31) || (month==6 && day>=1 && day<=20)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Please enter both  month and day");
            return;
        }
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        System.out.println(isSpring(month, day));
        boolean spring=isSpring(month, day);
        System.out.println(spring?"Its Spring Season":"Not a Spring Season");
    }
    
}
