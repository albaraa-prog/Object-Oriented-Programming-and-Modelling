abstract class country{
    String country;
    String capital;

    public country(String country, String capital){
        this.country = country;
        this.capital = capital;
    }

    public String getCountry(){
        return country;
    }

    public String getCapital(){
        return capital;
    }
    public abstract void puplation();
}

class oman extends country{
    public oman (String country, String capital){
        super(country, capital);
    }

    public void puplation(){
        System.out.println(country);
        System.out.println(capital);
        System.out.println("Oman puplation is 5 milion");
    }
}

class US extends country{
    public US (String country, String capital){
        super(country, capital);
    }

    public void puplation(){
        System.out.println(country);
        System.out.println(capital);
        System.out.println("USA puplation is 170 milion");
    }
}

class countrymain{
    public static void main(String argd[]){
        oman pupOman = new oman("Oman", "Muscat");
        pupOman.puplation();
        System.out.println();
        US pupUS = new US("USA", "DC");
        pupUS.puplation();
    }
}