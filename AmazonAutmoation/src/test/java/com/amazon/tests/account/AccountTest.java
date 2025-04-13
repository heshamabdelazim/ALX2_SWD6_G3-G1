package com.amazon.tests.account;

import com.amazon.base.BaseTest;
import com.amazon.data.DataBase;
import com.amazon.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {


    @Test
    public void testOpenAccountPage() {

        // Step 1: Click Sign-in
        _2_HomePage.signinLink();
//System.out.print(DataBase.startDataBase().x); //should be 3
//        DataBase.startDataBase().x=6;
//System.out.print(DataBase.startDataBase().x); //should be 6
        // Step 2: Enter username/phone
        _3_1_LoginPage.setUsername("+201096933795");
        _3_1_LoginPage.signinButton();

        // Step 3: Enter password
        _4_ContinuePage.setPassword("aA1!testest00");
        _4_ContinuePage.clickContinueButton();

        // Step 4: Confirm login success
        Assert.assertTrue(_2_HomePage.isAccountLinkVisible(), "Login failed: Account link not visible.");

        // Step 5: Click account link
        _2_HomePage.openAccountPage();

        // Step 6: Confirm account page
        _5_AccountPage.isYourAccountVisible();



    }
    public static void main(String[] args){
        DataBase first = DataBase.startDataBase();
        System.out.println(first.x);//2
        first.x=5;
        System.out.println(first.x);//5
        //second connection with database
        DataBase sec= DataBase.startDataBase();
        System.out.println(sec.x); //5
        System.out.println(first.x); //5
        if(first==sec)System.out.println(first==sec);
    }
}


