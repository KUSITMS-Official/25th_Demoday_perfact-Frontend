package com.example.per_fact.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.per_fact.Activity.MypageAsk;
import com.example.per_fact.Activity.MypageLogout;
<<<<<<< HEAD
import com.example.per_fact.Activity.MypagePlace;
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
import com.example.per_fact.Activity.MypageSetting;
import com.example.per_fact.R;


public class MypageFragment extends Fragment {

    Button MypageMain_btn1;
    Button MypageMain_btn2;
    Button MypageMain_btn3;
    Button MypageMain_btn4;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_mypage, container, false);

        MypageMain_btn1 = (Button) v.findViewById(R.id.MypageMain_btn1);
        MypageMain_btn2 = (Button) v.findViewById(R.id.MypageMain_btn2);
        MypageMain_btn3 = (Button) v.findViewById(R.id.MypageMain_btn3);
        MypageMain_btn4 = (Button) v.findViewById(R.id.MypageMain_btn4);

        //마이페이지 설정 선택시
<<<<<<< HEAD
        MypageMain_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MypagePlace.class);
                startActivity(intent);
            }
        });

        //마이페이지 설정 선택시
        MypageMain_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MypageSetting.class);
=======
        MypageMain_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), MypageSetting.class);
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                startActivity(intent);

            }
        });

        //마이페이지 1:1 문의 선택시
        MypageMain_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                Intent intent = new Intent(getActivity(), MypageAsk.class);
=======
                Intent intent = new Intent(getActivity().getApplicationContext(), MypageAsk.class);
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                startActivity(intent);

            }
        });

        //로그아웃 선택시
        MypageMain_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                Intent intent = new Intent(getActivity(), MypageLogout.class);
=======
                Intent intent = new Intent(getActivity().getApplicationContext(), MypageLogout.class);
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                startActivity(intent);

            }
        });


        return v;
    }
}