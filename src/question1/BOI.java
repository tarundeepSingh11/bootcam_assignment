package question1;

public class BOI extends bank{
    type bt = type.BOI;
    String name;
    String head_officeAddress;
    String chairmanName;
    int branchCount;
    double fd_interestRate;
    double personal_loan_interestRate;
    double home_loan_interestRate;

    BOI()
    {}

    public void showBank()
    {
        System.out.println("Bank : " + bt);
    }
    public void BOISetter(String name, String head_officeAddress, String chairmanName, int branch_count, double fd_interestRate, double personal_loan_interest_rate, double home_loan_interestRate)
    {
        this.name = name;
        this.head_officeAddress = head_officeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fd_interestRate = fd_interestRate;
        this.personal_loan_interestRate = personal_loan_interestRate;
        this.home_loan_interestRate = home_loan_interestRate;
    }

    public  void BOIGetter()
    {
        System.out.println("Values entered " + name + ", " + head_officeAddress + ", " + chairmanName + ", " + branchCount + ", " + fd_interestRate + ", " + personal_loan_interestRate + ", " + home_loan_interestRate);
    }

    @Override
    public String toString()
    {
        return "Bank - " + bt + ", Name  " + name + ", HeadOfficeAddress  " + head_officeAddress + ", ChairmanName - " + chairmanName + ", BranchCount - " + branchCount + ", FD Loan Interest rate - " + fd_interestRate + ", Personal Loan Interest Rate - " + personal_loan_interestRate + ", Home Loan Interest Rate - " + home_loan_interestRate;
    }
}
