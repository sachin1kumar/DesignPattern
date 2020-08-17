package com.company.chainofresponsibility;

public class TeamLead implements Chain {

    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void approveAmount(Amount amount) {
        if (amount.getAmount() <= 1000) {
            System.out.println("$"+amount.getAmount()+" approved by TeamLead");
        } else {
            nextChain.approveAmount(amount);
        }
    }
}
