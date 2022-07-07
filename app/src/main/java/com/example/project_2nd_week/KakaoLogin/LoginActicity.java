package com.example.project_2nd_week.KakaoLogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.project_2nd_week.R;
import com.example.project_2nd_week.databinding.ActicityLoginBinding;

public class LoginActicity extends AppCompatActivity {

    private ActicityLoginBinding binding;
    private KakaoLoginLogoutManager manager = new KakaoLoginLogoutManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.acticity_login);

        binding.loginButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view){
                manager.signInKakao();
            }
        });

    }


}
