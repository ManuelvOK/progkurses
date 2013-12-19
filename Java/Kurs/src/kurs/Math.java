package kurs;

/**
 *
 * @author morion
 */
public class Math {
    public String test(){
        return "Hallo Welt!";
    }
    public void count(int a){
        for(int i=0;i<=a;i++){
            System.out.println(i);
        }
    }
    public int mod(int a, int b){
        while(b<=a){
            a -= b;
        }
        return a;
    }
}
