package com.company.chainofresponsibility;

public class SeniorDev implements Chain {

    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void approveAmount(Amount amount) {
        if (amount.getAmount() <= 500) {
            System.out.println("$"+amount.getAmount()+" approved by SeniorDev");
        } else {
            nextChain.approveAmount(amount);
        }
    }
}
