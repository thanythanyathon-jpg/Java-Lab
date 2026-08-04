// Thanyathon Kitsakun
// 6887101

public class CovidProfile {
    private String date;
    private String location;
    private int accumulatedCases;
    private int curedCases;
    private int deathCases;
    
    public CovidProfile(){
    this.date = "none";
    this.location = "none";
    this.accumulatedCases = 0;
    this.curedCases = 0;
    this.deathCases = 0;
    }

    public CovidProfile(String date, String loc, int noACC, int noCured, int noDeath){
    this.date = date;
    this.location = loc;
    this.accumulatedCases = noACC;
    this.curedCases = noCured;
    this.deathCases = noDeath;
    }

    public String getDate(){
        return date;
    }

    public String getLocation(){
        return location;
    }

    public int getaccCase(){
        return accumulatedCases;
    }

    public int getcuredCases(){
        return curedCases;
    }

    public int getdeathCases(){
        return deathCases;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setLocation(String loc){
        this.location = loc;
    }

    public void setaccCases(int value){
        this.accumulatedCases = value;
    }

    public void setcuredCases(int value){
        this.curedCases = value;
    }

    public void setdeathCases(int value){
        this.deathCases = value;
    }

    public void printCovidInfo(){
        System.out.println(location + " at " + date);
        System.out.println("Accumulative Patient: " + accumulatedCases);
        System.out.println("Cured Patient: " + curedCases);
        System.out.println("Death Case: " + deathCases);
    }
}


