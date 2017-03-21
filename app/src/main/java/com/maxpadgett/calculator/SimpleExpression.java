package com.maxpadgett.calculator;

import java.util.ArrayList;

public class SimpleExpression {
    private ArrayList<Double> mOperandList = new ArrayList<>();
    private ArrayList<String> mOperatorList = new ArrayList<>();
    private double mValue;

    public SimpleExpression() {
        mOperandList.set(0, 0.0);
        mOperatorList.set(0,"+");
        mValue = 0;
    }

    public int getArraySizeOperand(){
        return mOperandList.size();
    }

    public int getArraySizeOperator(){
        return mOperatorList.size();
    }

    public void setOperand(double v) {
        mOperandList.add(v);
    }

    public double getOperand(int pos) {
        return mOperandList.get(pos);
    }

    public void setOperator(String s) {
        mOperatorList.add(s);
    }

    public String getOperator(int pos) {
        return mOperatorList.get(pos);
    }

    public double getValue() {
        computeValue();
        return mValue;
    }

    /*
     * Clears the operands within an expression
     */
    public void clearOperands() {
        for(int i =0; i<mOperandList.size();i++)
            mOperandList.clear();
    }

    /*
     * Computes the integer value of the expression.
     */
    private void computeValue() {
        mValue = 0;
        for(int j = 0; j < mOperandList.size(); j++) {

            if (mOperatorList.get(j).equals("+")) {
                mValue = mOperandList.get(j)+ mOperandList.get(j+1);
            }
            else if (mOperatorList.get(j).equals("-")) {
                mValue = mOperandList.get(j)- mOperandList.get(j+1);
            }
            else if (mOperatorList.get(j).equals("x")) {
                mValue = mOperandList.get(j)* mOperandList.get(j+1);
            }
            else if (mOperatorList.get(j).equals("/") && mOperandList.get(j+1)!=0){
                mValue = mOperandList.get(j)/mOperandList.get(j+1);
            }
            else{
                mValue = mOperandList.get(j)%mOperandList.get(j+1);
            }

        }
    }

}
