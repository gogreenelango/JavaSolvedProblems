package com.based;

public class SavingsBalance {

	
		 static double savingsBalance;
		private static double annualInterestRate;
		 static double interest;
		 public  double getAnnualInterestRate() {
				return getAnnualInterestRate();
			}
			public static double setAnnualInterestRate(double annualInterestRate) {
				 return SavingsBalance. annualInterestRate = annualInterestRate;
			}
			public static double getSavingsBalance() {
				return savingsBalance;
			}
			public static void setSavingsBalance(double savingsBalance) {
				SavingsBalance.savingsBalance = savingsBalance;
			}
			public double calculateMonthlyInterest()
			{
				interest=(savingsBalance* annualInterestRate)/12;
				savingsBalance=savingsBalance+interest;
				return savingsBalance;
			}
			public static double modifyRate()
			{
				return annualInterestRate;
			}
		public static void main(String[] args) {
			SavingsBalance sb1= new SavingsBalance();
			SavingsBalance sb2= new SavingsBalance();
			sb1.setAnnualInterestRate(4);
			sb2.setAnnualInterestRate(4);
			sb1.setSavingsBalance(3000);
			System.out.println(sb1.calculateMonthlyInterest());
			sb2.setSavingsBalance(5000);
			System.out.println(sb2.calculateMonthlyInterest());
			sb1.setAnnualInterestRate(5);
			sb2.setAnnualInterestRate(5);
			sb1.setSavingsBalance(6000);
			System.out.println(sb1.calculateMonthlyInterest());
			sb2.setSavingsBalance(8000);
			System.out.println(sb2.calculateMonthlyInterest());
		}

			
		}
		



