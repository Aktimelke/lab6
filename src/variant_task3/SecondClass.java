package variant_task3;

public class SecondClass implements Numbers{
    public SecondClass(){}
    @Override
    public boolean match(int number1, int number2){
        int l=0;
        for(int i = 1; i<=number1;i++){
            if(number1 % i ==0){
                l++;
            }
        }
        for(int i = 1; i<=number2;i++){
            if(number2 % i ==0){
                l++;
            }
        }
        if(l == 4){
            return true;
        }
        else{
            return false;
        }
    }
}
