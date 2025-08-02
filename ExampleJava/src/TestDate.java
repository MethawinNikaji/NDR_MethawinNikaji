public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(2025, 8, 2);
        System.out.println(d1);//call string method 
        
        d1.setYear(2013);
        d1.setMonth(8);
        d1.setDay(12);
        System.out.println(d1);//call string method

        System.out.println("Year is" + d1.getYear());
        System.out.println("Month is" + d1.getMonth());
        d1.setDate(2013, 8, 12);
        System.out.println(d1);//call string method 
    }
    
}
