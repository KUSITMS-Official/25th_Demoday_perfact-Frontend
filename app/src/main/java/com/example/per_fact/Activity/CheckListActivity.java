package com.example.per_fact.Activity;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.util.Log;
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;

import androidx.appcompat.app.AlertDialog;

import com.example.per_fact.Api.CheckListService;
import com.example.per_fact.Data.CheckListData;
import com.example.per_fact.R;
import com.example.per_fact.Repository.CheckListDictionary;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CheckListActivity extends AppCompatActivity {
    ImageButton buttonInsert, btn_back;
    private ArrayList<CheckListDictionary> mArrayList, mArrayList_check;
    private com.example.per_fact.Adapter.CheckListCustomAdapter mAdapter;
=======
import androidx.appcompat.app.AlertDialog;

import com.example.per_fact.Adapter.CheckListCustomAdapter;
import com.example.per_fact.R;


public class CheckListActivity extends AppCompatActivity {
    ImageButton buttonInsert;
    ImageButton btn_back;

    private ArrayList<CheckListDictionary> mArrayList;
    private ArrayList<CheckListDictionary> mArrayList_check;
    private CheckListCustomAdapter mAdapter;
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
    private int count = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);

<<<<<<< HEAD
        //리싸이클러 뷰 설정
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_main_list);
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mArrayList = new ArrayList<>();

        //mAdapter = new CustomAdapter( mArrayList);
        mAdapter = new com.example.per_fact.Adapter.CheckListCustomAdapter( this, mArrayList);
        mRecyclerView.setAdapter(mAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(), mLinearLayoutManager.getOrientation());
=======
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_main_list);
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);


        mArrayList = new ArrayList<>();

        //mAdapter = new CustomAdapter( mArrayList);
        mAdapter = new CheckListCustomAdapter( this, mArrayList);
        mRecyclerView.setAdapter(mAdapter);


        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                mLinearLayoutManager.getOrientation());
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
        mRecyclerView.addItemDecoration(dividerItemDecoration);

        //메인에서 체크리스트 받아와 화면에 출력
        mArrayList_check = new ArrayList<>();
        Intent intent = getIntent();
        mArrayList_check = intent.getParcelableArrayListExtra("checklist");
        for (int i = 0; i < mArrayList_check.size(); i++) {
<<<<<<< HEAD

            String item = mArrayList_check.get(i).getId();
            Boolean checked = mArrayList_check.get(i).isSelected();
            CheckListDictionary dict = new CheckListDictionary(item, checked);

            mArrayList.add(dict); //마지막 줄에 삽입
            mAdapter.notifyDataSetChanged(); //변경된 데이터를 화면에 반영
        }

        //Retrofit 객체 생성
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://34.64.220.224:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CheckListService checkListService = retrofit.create(CheckListService.class);
=======
            String item = mArrayList_check.get(i).getId();

            CheckListDictionary dict = new CheckListDictionary(item);

            mArrayList.add(0, dict); //첫 줄에 삽입
            //mArrayList.add(dict); //마지막 줄에 삽입
            mAdapter.notifyDataSetChanged(); //변경된 데이터를 화면에 반영

        }

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012


        buttonInsert = (ImageButton)findViewById(R.id.button_main_insert);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            //화면 아래쪽에 있는 추가 버튼 클릭시
            @Override
            public void onClick(View v) {

                //edit_box를 불러와서 입력
                AlertDialog.Builder builder = new AlertDialog.Builder(CheckListActivity.this);
                View view = LayoutInflater.from(CheckListActivity.this)
                        .inflate(R.layout.edit_box, null, false);
                builder.setView(view);
                final Button ButtonSubmit = (Button) view.findViewById(R.id.button_dialog_submit);
                final EditText editTextID = (EditText) view.findViewById(R.id.edittext_dialog_id);
<<<<<<< HEAD
=======


>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                ButtonSubmit.setText("확인");


                final AlertDialog dialog = builder.create();
                ButtonSubmit.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        String strID = editTextID.getText().toString();

<<<<<<< HEAD
//                        //Api 호출(POST)
//                        CheckListData checkListData = new CheckListData(0, strID, "false");
//                        checkListService.postCheckList(checkListData).enqueue(new Callback<CheckListData>() {
//                            @Override
//                            public void onResponse(Call<CheckListData> call, Response<CheckListData> response) {
//                                CheckListData data = response.body();
//                                if (response.isSuccessful()) {
//                                    if (response.body() != null) {
//                                        Log.d("TEST", data.toString());
//                                    }
//                                } else {
//                                    Log.d("TEST", "error");
//                                }
////                                Log.d("TEST", "Post 성공");
//
//                            }
//
//                            @Override
//                            public void onFailure(Call<CheckListData> call, Throwable t) {
//
//                            }
//                        });

                        Boolean checked = false;
                        CheckListDictionary dict = new CheckListDictionary(strID,checked);
                        mArrayList.add(dict); //마지막 줄에 삽입
                        mAdapter.notifyDataSetChanged(); //변경된 데이터를 화면에 반영
=======
                        CheckListDictionary dict = new CheckListDictionary(strID);

                        mArrayList.add(0, dict); //첫 줄에 삽입
                        //mArrayList.add(dict); //마지막 줄에 삽입
                        mAdapter.notifyDataSetChanged(); //변경된 데이터를 화면에 반영

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

<<<<<<< HEAD

=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
        //뒤로가기 버튼 클릭시
        btn_back = (ImageButton) findViewById(R.id.Check_list_back_btn);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD

                //체크박스 상태를 배열에 담아 전달
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                Intent data = new Intent();
                data.putParcelableArrayListExtra("checklist", mArrayList);
                setResult(0,data);

<<<<<<< HEAD
                checkListService.getAllData(1).enqueue(new Callback<List<CheckListData>>() {
                    @Override
                    public void onResponse(Call<List<CheckListData>> call, Response<List<CheckListData>> response) {
                        if (response.isSuccessful()) {
                            List<CheckListData> data = response.body();
                            Log.d("TEST", "성공");
                            Log.d("TEST", data.get(0).getContent());
                        }else{
                            Log.d("TEST", "실패");
                        }
                    }

                    @Override
                    public void onFailure(Call<List<CheckListData>> call, Throwable t) {

                    }
                });


                finish();


=======
                finish();
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
            }
        });
    }
}
