class Customer{
    int amount=10000;
    synchronized void withdraw(int amount){
        System.out.println("Going to Withdraw......");
        if(this.amount<amount){
            System.out.println("Less Balance");
            try{
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        this.amount=-amount;
        System.out.println("Withdrawl Completed");
    }
    synchronized void deposit(int amount){
        System.out.println("Going to Deposit");
        this.amount+=amount;
        System.out.println("Deposit Completed");
        notify();
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        final Customer c=new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}
