import java.util.*;
class Main{
public void fibonacci(int n,int a,int b){
    if(n>0){
        n=n-1;
        System.out.print(a+b+" ");
        this.fibonacci(n,b,a+b);
    }
}
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    Main m=new Main();
    m.fibonacci(n,-1,1);
}

}