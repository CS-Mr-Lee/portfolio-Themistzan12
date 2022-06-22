
package bankingsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class UserDetail 
{
    String name = "";
    String Contact = "";
    String AccountNumber = "";
    long  Balance = 0;
    long loan = 0;
    int   AccountType; 
    
   private File fileobj = new File("C:\\Users\\Admin\\Desktop\\ZainProject\\BankingSystem\\src\\bankingsystem\\UserDetail.txt");
    
    public UserDetail()
    {
        
    }
    public void setData(String name,String contact,String accountnumber,int accounttype)
    {
        
        this.name = name;
        this.Contact = contact;
        this.AccountNumber = accountnumber;
        this.AccountType = accounttype;
        
    }
    public void SaveBalance(long balance,int type)
    {
        this.Balance = this.Balance + balance;
        
        if (type == 2) 
        {
            System.out.println("******************************");
        System.out.println("Transaction succesfull \n Current Balance: "+this.Balance);
            System.out.println("******************************");
                
        }
        
    }
    public void Withdraw(long ammount)
    {
        
        if (ammount <= this.Balance ) 
        {
            
            if (ammount < getWithdrawLimit()) 
            {
              this.Balance = this.Balance - ammount;
                        System.out.println("******************************");
            System.out.println("Transaction succesfull \n Current Balance: "+this.Balance);
                        System.out.println("******************************");
                
            }
            else
                
            {
                System.out.println("You can't withdraw more than:" + getWithdrawLimit());
            }
        
        }
        else
        {
            System.out.println("Balance not enought !");
        }
    }
    public void GetLoan(long ammount)
    {
        if (ammount <= getLoanLimit()) 
        {
            this.loan = ammount;
            System.out.println("******************************");
            System.out.println("Congratulations you have got loan of RS:"+ammount);
            double ineterest = getInterest();
            long returnammount = getInterest() + ammount;
            
            System.out.println("You have to return RS: "+returnammount);
            System.out.println("******************************");
        }
        else
        {
            System.out.println("You can take maximum loan of:" +getLoanLimit());
        }
        
    }
    public void ReturnLoan(long ammount)
    {
        if (ammount == (getInterest()+this.loan)) 
        {
            this.loan = 0;
            System.out.println("******************************");
            System.out.println("Thankyou for taking our service");
            System.out.println("******************************");
        }
        else
        {
            long returnammount = getInterest() + this.loan;
            System.out.println("You have to return :"+returnammount);
        }
        
    }
    public int getInterest()
    {
        
            if (this.AccountType == 1) 
            {
                CurrenAccount ac = new CurrenAccount();
               
                return (int)((ac.interest)* this.loan);
            }
            else
            {
            SavingAccount sa = new SavingAccount();
            return (int)((sa.interest)*this.loan);
            } 
    }
    public long getLoanLimit()
    {
        
        if (this.AccountType == 1) 
            {
                CurrenAccount ac = new CurrenAccount();
               
                return ac.loanlimit;
            }
        else
        {
            SavingAccount sa = new SavingAccount();
            return sa.loanlimit;
        } 
    }
    public long getWithdrawLimit()
    {
        
        if (this.AccountType == 1) 
            {
                CurrenAccount ac = new CurrenAccount();
                return ac.WithdrawlLimit;
            }
        else
        {
            SavingAccount sa = new SavingAccount();
            return sa.WithdrawlLimit;
        } 
    }
    
    public void Display(int sno)
    {

        System.out.println(sno+":\t"+this.name +"\t\t "+this.Contact +"\t\t"+this.AccountNumber+"\t\t\t"+this.AccountType+"\t"+this.Balance+"\t"+this.loan+"\n");
    }
}


