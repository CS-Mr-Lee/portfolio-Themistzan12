package bankingsystem;
import java.io.FileWriter;
import java.util.Scanner;

public class BankingSystem 
{
static UserDetail[] UserInfo;
    
    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
        
       int Userno = 0,choice = 1;
         int no_of_users = 1; 
        System.out.println("________________________________________");
        
        System.out.print("Enter no of users: ");
        no_of_users = scan.nextInt();
        
        UserInfo = new UserDetail[no_of_users];
       
        do 
        {
            choice = Message();
            switch(choice)
            {
                case 1:
                    if (Userno == no_of_users) 
                    {
                        System.out.println("You can't add more users");  
                    }
                    else
                    {
                    AddData(Userno);
                    Userno++;
                    }  
                    break;
                
                case 2:
                    DisplayData(Userno);
                break;
                case 3:
                    Withdraw(Userno);
                break;
                 case 4:
                    CashDeposit(Userno);
                    break;
                 case 5:
                     Getloan(Userno);       
                 break;
                 case 6:
                     Returnloan(Userno);
                  break;
                 case 7:
                     System.out.println("Thankyou for using our software !");
                     SaveAllData(Userno);
                     break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            
        } while (choice != 7);
    
    }
    public static int Message()
    {   
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.println("\n________________________________________");
        System.out.println("Enter your choice");
        System.out.println("1.  Add User");
        System.out.println("2.  Display Data");
        System.out.println("3.  Withdraw");
        System.out.println("4.  Cash deposit");
        System.out.println("5.  Get loan");
        System.out.println("6.  Return loan");
        System.out.println("7.  Exit");
        System.out.print("Choice: ");
        
        choice = scan.nextInt();
        
        return choice;
    }
    public static void AddData(int Userno)
    {
            Scanner scan = new Scanner(System.in);
            String name,contact,accountnumber;
            int accounttype; long balance;
            System.out.println("\n________________________________________");
            System.out.print("Enter name: ");
            name = scan.next();
            System.out.print("\nEnter contact: ");
            contact = scan.next();
            System.out.print("\nEnter AccountNumber: ");
            accountnumber = scan.next();
            System.out.println("\nSelect Account Type: ");
            System.out.println("\t 1.Current Account");
            System.out.println("\t 2.Saving Account");
            System.out.print("Account Type: ");
            accounttype = scan.nextInt();
            System.out.print("\nEnter cash to deposit: ");
            balance = scan.nextLong();
            
            UserInfo[Userno] = new UserDetail();
            UserInfo[Userno].setData(name, contact,accountnumber,accounttype);
     
            UserInfo[Userno].SaveBalance(balance,1);
            System.out.println("******************************");
            System.out.println("| User added successfully ! |");
            System.out.println("******************************");
            
    }
    public static void CashDeposit(int Userno)
    {
        Scanner scan = new Scanner(System.in);
        if (Userno == 0) 
        {
            System.out.println("No users/data found");
        }
        else
        {
            String accountnumber;
            System.out.print("Enter Account number: ");
            accountnumber = scan.next();
            System.out.println("");
            int userid = FindUser(Userno,accountnumber);
            if (userid != -1) 
            {
                System.out.print("Enter ammount to deposit: ");
                long balance = scan.nextLong();
                UserInfo[userid].SaveBalance(balance,2);
            }
              else
            {
                    System.out.println("Account not found!");
            }
        }
    }
    public static void DisplayData(int Userno)
    {
        System.out.println("____________________________________________________________________________");
        System.out.println("------------------------------------User Detail-----------------------------");
        System.out.println("Sn \t Name \t\t Contact \t Account# \t AccountType \t Balance \t Loan");
        if (Userno == 0) 
        {
            System.out.println("No users/data found");
        }
        else
        {
            for (int i = 0; i < Userno; i++) 
            {
                UserInfo[i].Display(i+1);
            }
        }
    }
    public static void Withdraw(int Userno)
    {
        Scanner scan = new Scanner(System.in);
        String accountnumber;
        if (Userno == 0) 
        {
            System.out.println("No users/data found");
        }
        else
        {
            System.out.print("Enter Account number: ");
            accountnumber = scan.next();
            System.out.println("");
            int userid = FindUser(Userno,accountnumber);
            if (userid != -1) 
            {
                    long  withdrawAmmount;
                    System.out.print("Enter withdrawl ammount: ");
                    withdrawAmmount = scan.nextLong();
                    UserInfo[userid].Withdraw(withdrawAmmount);
            }
             else
           {
                    System.out.println("Account not found!");
            }
        
        }
    }
    public static void Getloan(int Userno)
    {
        Scanner scan = new Scanner(System.in);
        String accountnumber;
        if (Userno == 0) 
        {
            System.out.println("No users/data found");
        }
        else
        {
            System.out.print("Enter Account number: ");
            accountnumber = scan.next();
            System.out.println("");
            int userid = FindUser(Userno,accountnumber);
            if (userid != -1) 
            {
                if (UserInfo[userid].loan == 0) 
                {
                    long  LoanAmmount;
                    System.out.print("Enter loan ammount: ");
                    LoanAmmount = scan.nextLong();
                    UserInfo[userid].GetLoan(LoanAmmount);
                }
                else
                {
                    System.out.println("You can't get more loan, Return previous loan first");
                }
                    
            }
             else
            {
                    System.out.println("Account not found!");
            }  
        }
    }
    public static void Returnloan(int Userno)
    {
        Scanner scan = new Scanner(System.in);
        String accountnumber;
        if (Userno == 0) 
        {
            System.out.println("No users/data found");
        }
        else
        {
            System.out.print("Enter Account number: ");
            accountnumber = scan.next();
            System.out.println("");
            int userid = FindUser(Userno,accountnumber);
            if (userid != -1) 
            {
                    long  LoanAmmount;
                    System.out.print("Enter loan return ammount: ");
                    LoanAmmount = scan.nextLong();
                    UserInfo[userid].ReturnLoan(LoanAmmount);
            }
             else
            {
                    System.out.println("Account not found!");
            }  
        }
    }
    public static int FindUser (int Userno,String accountnumber)
    {
        for (int i = 0; i < Userno; i++) 
            
            {
                if (UserInfo[i].AccountNumber.equals(accountnumber)) 
                {
                    return i;
  
                } 
            }
        return -1;
    }
    public static void SaveAllData(int Userno)
    {
        String Alldata="";
        for (int i = 0; i < Userno; i++) 
        {
             
             Alldata = Alldata + UserInfo[i].name +"\t\t "+
                    UserInfo[i].Contact +"\t\t"
                    +UserInfo[i].AccountNumber
                    +"\t\t\t"+UserInfo[i].AccountType
                    +"\t"+UserInfo[i].Balance+"\t"
                    +UserInfo[i].loan+"\n";
         
        }
         try 
        {
           
        FileWriter filewriter = new FileWriter("C:\\Users\\Admin\\Desktop\\ZainProject\\BankingSystem\\src\\bankingsystem\\UserDetail.txt");   
        filewriter.write(Alldata);
        filewriter.close();
            System.out.println("All Data saved");
        }
        catch(Exception e)
        {
            System.out.println("File not found");  
        } 
        }
    
}
