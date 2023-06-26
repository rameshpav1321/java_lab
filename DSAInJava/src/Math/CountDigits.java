package Math;

public class CountDigits {
    public int countDigits(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    public void main(String[] args){
        System.out.println(countDigits(9235));
    }
}
