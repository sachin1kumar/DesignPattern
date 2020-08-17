package com.company.chainofresponsibility;

public class Manager implements Chain {

    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void approveAmount(Amount amount) {
        if (amount.getAmount() <= 2000) {
            System.out.println("$"+amount.getAmount()+" approved by Manager");
        } else {
            nextChain.approveAmount(amount);
        }
    }
}
