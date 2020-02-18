package ca.yorku.eecs.mcalc;

public class MortgageModel {

    private double principle;
    private int amortization;
    private double interest;

    public MortgageModel(String p, String a, String i){
        this.principle = Double.parseDouble(p);
        this.amortization = (int)Double.parseDouble(a);
        this.interest = Double.parseDouble(i);
    }

    public String computePayment(){
        double interestRate = this.interest/100;
        double monthlyInterest = interestRate/12;
        int numOfMonth = this.amortization*12;
        double result = (monthlyInterest*this.principle)/(1-Math.pow(1+monthlyInterest,-numOfMonth));
        return String.format("$%,.2f",result);
    }

    public static void main(String[] args)
    {
        MortgageModel myModel = new MortgageModel("700000","25","2.75");
        System.out.println(myModel.computePayment());

        myModel = new MortgageModel("300000","20","4.50");
        System.out.println(myModel.computePayment());
    }
}
//psvm always go under the Model