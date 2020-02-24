package com.example.viewmodel;

import androidx.lifecycle.ViewModel;

public class AuthViewModel extends ViewModel
{

    int a =5;


    public int addThreeNumbers(){

        a = a+3;

        return a;
    }

    @Override
    protected void onCleared() {
        super.onCleared();

        // this method is called when activity is completly destroyed..
    }
}
