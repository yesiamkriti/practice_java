public class Enum {
    enum Day{
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
    }
    public static class EnumEx{
        Day day;
        EnumEx(Day day){
            this.day=day;
        }
        
        public void dayIsLike(){
            switch(day){
                case Monday:
                    System.out.println("start of the week");
                break; 
                case Friday:
                    System.out.println("better");
                break; 
                case Saturday:
                case Sunday:
                    System.out.println("weekend");
                break;
                default:
                    System.out.println("week days");break;
            }
        }
    }
    public static void main(String[] args) {
        String str ="Monday";
        EnumEx t1 = new EnumEx(Day.valueOf(str));
        t1.dayIsLike();
        for(Day d : Day.values()){
            System.out.println(d + " at index " + d.ordinal());
        }
    }
}
