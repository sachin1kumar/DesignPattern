package com.company.chainofresponsibility;

public class PerformReimburse {

    public static void main(String[] args) {
        Chain seniorDev = new SeniorDev();
        Chain teamLead = new TeamLead();
        Chain manager = new Manager();

        seniorDev.nextChain(teamLead);
        teamLead.nextChain(manager);

        Amount amount = new Amount(1000);
        seniorDev.approveAmount(amount);
    }
}
