// Thanyathon Kitsakun
// 6887101

public class CovidReporter  {
    public static void main(String[] arg){
        CovidProfile profile1 = new CovidProfile();
        profile1.setDate("2050-8-03");
        profile1.setLocation("Vietnam");
        profile1.setaccCases(150000);
        profile1.setcuredCases(2);
        profile1.setdeathCases(149998);
    
    
        CovidProfile profile2 = new CovidProfile("2050-8-04", "Vietnam", 99999999, 2, 99999997);

        System.out.println("====Report 1====");
        profile1.printCovidInfo();
        System.out.println("====Report 2====");
        profile2.printCovidInfo();
    }
}
