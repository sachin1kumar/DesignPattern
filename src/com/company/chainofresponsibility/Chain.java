package com.company.chainofresponsibility;

public interface Chain {
   void nextChain(Chain nextChain);
   void approveAmount(Amount amount);
}
