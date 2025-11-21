class Atm{
    private int TotalBalance=10000;
    public void getBalance(){       //getter function
        System.out.println("Balance is: "+TotalBalance);
    }
    public void setTotalBalance(int Amount) {       //Setter funtion
        if (Amount > 0) {
            TotalBalance += Amount;
        }
        System.out.println("Balance is: "+TotalBalance);
    }
    public void setBalance(int Amount) {
        if(Amount>0&&Amount<TotalBalance){
            TotalBalance -= Amount;
        }
        System.out.println("Balance is: "+TotalBalance);
    }

}
class encapsulation{
    public static void main(String[] args){
        Atm atm=new Atm();
        atm.getBalance();
        atm.setTotalBalance(10000);
        atm.setBalance(5000);
    }
}