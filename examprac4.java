class  huh{
    double length, breadth; 

    void mectangle(double r){
        length = r;
        breadth = r;
       
    } 

    void mectangle(double l, double b){
        length = l;
        breadth = b; 
    } 

    void printperimeter(){
        double printperimeter = 2 * (length + breadth);
        System.out.println("perimeter:"+ printperimeter);
    }
}

public class examprac4 {
    public static void main(String args[]){
        huh lb = new huh();
        lb.mectangle(2,4);
        lb.printperimeter();
    }
}
