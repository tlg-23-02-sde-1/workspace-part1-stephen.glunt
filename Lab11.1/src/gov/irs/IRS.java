/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package gov.irs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
    //private TaxPayer[] payers = new TaxPayer[100];
    private Collection<TaxPayer> payers = new ArrayList<>();
    private int currentIndex = 0;  // for dealing with the array

    public void collectTaxes() {
        for (TaxPayer pyr : payers) {
            double deduction = pyr.getStandardDeduction();
            System.out.printf("Tax payer's deduction is: %,.2f\n", deduction);
            pyr.fileReturn();
            pyr.payTaxes();
        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer, TaxPayer ...rest) {
        payers.add(payer);
        for(TaxPayer pyr : rest){
            payers.add(pyr);
        }
    }
}