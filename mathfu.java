class math{
    private double ans;
    
    public void mulit(int num1, int num2){
       ans = num1 * num2;
    }

    public void mulit(double num1, double num2){
        ans = num1 * num2;
    }

    public void mulit(double num1, double num2, double num3){
        ans = num1 * num2 * num3;
    }

    public void display(){
        System.out.println("Result:"+ans);
    }
}



public class mathfu {

    public static void main(String[] args) {
        math m2 = new math();
        math m3 = new math();
        math m4 = new math();

        m2.mulit(2, 2);
        m2.display();
        m3.mulit(3, 3);
        m3.display();
        m4.mulit(4, 4);
        m4.display();
    }
    
}
