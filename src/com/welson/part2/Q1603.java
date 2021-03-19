package com.welson.part2;

/**
 * 1603.设计停车系统
 */
public class Q1603 {
    private int mBig;
    private int mMedium;
    private int mSmall;

    public Q1603(int big, int medium, int small) {
        mBig = big;
        mMedium = medium;
        mSmall = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (mBig > 0) {
                    mBig--;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (mMedium > 0) {
                    mMedium--;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (mSmall > 0) {
                    mSmall--;
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }
}
