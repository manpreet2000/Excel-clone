// public class test{
//     public static class bank{
//         // class represent bank structure! 
//         // functions supported are : withdraw, credit and transfer.
        
//         private long amt;
//         // amount is private (encapsulation-> hide data from outer world).
//         public bank(long amt){
//             // constructor 
//             this.amt=amt;
//         }
//         public void credit(long amt){
//             // it is used to credit the data! 
//             this.amt+=amt;
//         }
//         public void withdraw(long amt){
//             // corner case
//             if(this.amt<amt){
//                 System.out.println("Could not deduct due to insufficient amount");
//                 return;
//             }
//             // removing money
//             this.amt-=amt;
//         }
        
//         public void transfer(long transferAmt,bank person){
//             // transferAmt is amount that needs to transfer
//             // person is instance of bank class to which money must be credit

//             // corner case
//             if(this.amt<transferAmt){
//                 System.out.println("Could not deduct due to insufficient amount \n");
//                 return;
//             }
//             // withdraw money
//             withdraw(transferAmt);

//             //credit to "person" class
//             person.credit(transferAmt);
//         }

//         public long getAmount(){
//             // return the amount, "amt" is private so outer world can not use directly!
//             return this.amt;
//         }
        
//     }
//     public static void main(String[] args) {
//         bank manpreet=new bank(1000);
//         bank deepak =new bank(1000);
        
//         // if transfer value is 10,000 and transfered from manpreet
//         manpreet.transfer(10000, deepak);
//         System.out.println("After transfering! amount in manpreet's account is "+manpreet.getAmount()+
//         " and deepak's account is "+deepak.getAmount());

//         manpreet.transfer(500,deepak);
//         System.out.println("After transfering! amount in manpreet's account is "+manpreet.getAmount()+
//         " and deepak's account is "+deepak.getAmount());

//     }
// }

interface b{
    int aa();
}
interface a{
    void aa();
}
class t implements b,a{
    public int aa(){
        System.out.println("fdd");
    }
}
class test{
    public static void main(String[] args) {
        t a=new t();
        a.aa();
    }
}