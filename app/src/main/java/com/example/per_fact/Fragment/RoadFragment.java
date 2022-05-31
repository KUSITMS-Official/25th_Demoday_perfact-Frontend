package com.example.per_fact.Fragment;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
<<<<<<< HEAD
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
=======
import android.widget.TextView;
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
<<<<<<< HEAD
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

import com.example.per_fact.Activity.MapsActivity;
import com.example.per_fact.Activity.ODsayBackend;
import com.example.per_fact.Activity.OfficeActivity;
import com.example.per_fact.Activity.ScheduleActivity;
<<<<<<< HEAD
import com.example.per_fact.Adapter.RoadViewAdapter;
import com.example.per_fact.Data.RoadData;
import com.example.per_fact.R;

=======
import com.example.per_fact.R;

import com.odsay.odsayandroidsdk.API;

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class RoadFragment extends Fragment {
    ODsayBackend oDsayBackend;
    EditText startStation, endStation;
<<<<<<< HEAD
    Button   btnBus, btnSubway, btnTotal, btnSelect;
    ImageButton btnHome, btnBuilding,switchStation, btnRoadFind;
    TextView tvHome, tvBuilding, total, tv_min, tv_busNumber, tv_startStation, tv_midStation, tv_endStation;
    ScrollView scrollView;

    ArrayList<RoadData> list2 = new ArrayList<>();
    private RoadViewAdapter adapter;

=======
    Button switchStation, btnRoadFind, btnBus, btnSubway, btnTotal, btnSelect;
    ImageButton btnHome, btnBuilding;
    TextView tvHome, tvBuilding, total, tv_min, tv_busNumber, tv_startStation, tv_midStation, tv_endStation;
    //String APIKEY_ID = "ar7zysdloh";
    //String APIKEY = "MHEi%2FORnStzohsN6KcJhPoE4GgAiFnUu6gXHIQzb7F";
    String start, end;
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
    private LocationManager locationManager;

    //출발지 경도, 위도
    public double longitude = 126.97790971650069;
    public double latitude = 37.57069834711464;

    //도착지 경도, 위도
    public double dst_longitude = 127.10048819629597;
    public double dst_latitude = 37.514466827932594;

    JSONArray path = new JSONArray();

<<<<<<< HEAD
    //path 변수
    static int time, busCount, subwayCount, subwayBusCount, trafficType;
    String firstStartStation, lastEndStation;
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

    public RoadFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_road, container, false);

        startStation = v.findViewById(R.id.et_startStation);
        endStation = v.findViewById(R.id.et_endStation);
        switchStation = v.findViewById(R.id.switchStation);
        btnRoadFind = v.findViewById(R.id.btnRoadFind);
        btnBus = v.findViewById(R.id.btnBus);
        btnSubway = v.findViewById(R.id.btnSubway);
        btnTotal = v.findViewById(R.id.btnTotal);
        btnHome = v.findViewById(R.id.btnHome);
        btnBuilding = v.findViewById(R.id.btnBuilding);
        btnSelect = v.findViewById(R.id.btnSelect);
        tvHome = v.findViewById(R.id.tvHome);
        tvBuilding = v.findViewById(R.id.tvBuilding);
        total = v.findViewById(R.id.total);
        tv_min = v.findViewById(R.id.tv_min);
        tv_busNumber = v.findViewById(R.id.tv_busNumber);
        tv_startStation = v.findViewById(R.id.tv_startStation);
        tv_midStation = v.findViewById(R.id.tv_midStation);
        tv_endStation = v.findViewById(R.id.tv_EndStation);
<<<<<<< HEAD
        scrollView = v.findViewById(R.id.scrollView);
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

        clickListener();

        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);

        if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 101);
        }

        return v;
    }

    private void clickListener() {
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                startActivity(intent);
            }
        });

        btnBuilding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OfficeActivity.class);
                startActivity(intent);
            }
        });

<<<<<<< HEAD
        btnRoadFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollView.setVisibility(View.VISIBLE);

                btnSelect.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(view.getContext(), "경로가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getActivity(), ScheduleActivity.class);
                        startActivity(intent);
                    }
                });
=======

        btnRoadFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

                oDsayBackend = ODsayBackend.getInstance(getActivity().getApplicationContext());

                List<String> list = new ArrayList<>();

                //ODsayAPI 호출
                path = oDsayBackend.requestRoute(longitude, latitude, dst_longitude, dst_latitude);

<<<<<<< HEAD
                firstStartStation = startStation.getText().toString();
                lastEndStation = endStation.getText().toString();

=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                //Log.d("ROUTE_PATH", path.toString());

                for (int i = 0; i < path.length(); i++) {
                    StringBuilder strpath = new StringBuilder();
                    strpath.append("\n");
                    //Log.d("SUBPATH", String.valueOf(i));
                    try {
                        //JSON 응답에서 subPath 로 array 추출, info 로 바디 추출
                        JSONArray subPath = path.getJSONObject(i).getJSONArray("subPath");
                        JSONObject info = path.getJSONObject(i).getJSONObject("info");

                        //확장 노드의 갯수만큼 for문 돌리면서 상세 정보 추출
                        for (int j = 0; j < subPath.length(); j++) {

                            JSONObject item = subPath.getJSONObject(j);
                            Log.d("SUBPATH", item.toString());

<<<<<<< HEAD

                            trafficType = item.getInt("trafficType");
                            //만약 traffic type ==3 이면 지하철+버스
                            if (item.getInt("trafficType") == 3) {
                                strpath.append("걷기 : " + String.valueOf(item.getInt("distance")) + "m\n");
                                subwayBusCount++;
=======
                            //만약 traffic type ==3 이면 지하철+버스
                            if (item.getInt("trafficType") == 3) {
                                strpath.append("걷기 : " + String.valueOf(item.getInt("distance")) + "m\n");
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                            } else {
                                //버스와 지하철 모두 lane 배열에 담겨서 넘어오기 때문에 일단 lane array에 담아서 추출
                                JSONArray lanes = item.getJSONArray("lane");
                                if (item.getInt("trafficType") == 1) {
<<<<<<< HEAD
                                    subwayCount++;
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                                    strpath.append("지하철 : ");
                                    //lane Array에서 지하철 역 추출
                                    JSONArray stations = item.getJSONObject("passStopList").getJSONArray("stations");
                                    for (int k = 0; k < lanes.length(); k++) {
                                        //몇호선인지랑, 승하차역 추출하여 route 에 추가
                                        strpath.append(lanes.getJSONObject(k).getString("name") + " \n" + String.valueOf(item.getString("startName")) + " 탑승 \n" + String.valueOf(item.getString("endName")) + " 하차");
                                    }
                                } else {
                                    //trafficType이 2이면 버스로만 이동가능
                                    strpath.append("버스 : ");
<<<<<<< HEAD
                                    busCount++;
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                                    for (int l = 0; l < lanes.length(); l++) {
                                        //busNo 로 추출하여 몇번 버스 탑승하는지, 승차 및 하차 정류장 표시
                                        strpath.append(lanes.getJSONObject(l).getString("busNo") + " \n" + String.valueOf(item.getString("startName")) + " 탑승 \n" + String.valueOf(item.getString("endName")) + " 하차");
                                    }
                                }
                                strpath.append("\n");

                            }
                        }
<<<<<<< HEAD
                        time = path.getJSONObject(i).getJSONObject("info").getInt("totalTime");
                        Log.i("sooyeon", String.valueOf(time));
=======
                        int time = path.getJSONObject(i).getJSONObject("info").getInt("totalTime");
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                        int pay = path.getJSONObject(i).getJSONObject("info").getInt("payment");
                        strpath.append("소요시간 : " + String.valueOf(time) + "분\n");
                        strpath.append("금액 : " + String.valueOf(pay) + "원\n");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
<<<<<<< HEAD
                    list.add(strpath.toString());
=======

                    list.add(strpath.toString());

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                }

                for (int j = 0; j < list.size(); j++) {
                    Log.i("data", list.get(j));
                }
<<<<<<< HEAD
=======


                btnSelect.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getActivity(), ScheduleActivity.class);
                        startActivity(intent);
                    }
                });
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
            }
        });
    }
}