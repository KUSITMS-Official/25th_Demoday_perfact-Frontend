package com.example.per_fact.Activity;

import android.app.Activity;
<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
=======
import android.os.Bundle;
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
import android.view.Window;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.per_fact.R;

public class MypageLogout extends Activity {

    Button btn_cancel;
    Button btn_logout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.mypage_logout);

        btn_cancel = (Button) findViewById(R.id.button);
        btn_logout = (Button) findViewById(R.id.button2);

<<<<<<< HEAD
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MypageLogout.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
//    @Override
//    public void onBackPressed() {
//        //안드로이드 백버튼 막기
//        return;
//    }
=======

    }

    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
}
