package com.example.per_fact.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
<<<<<<< HEAD
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
=======
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

<<<<<<< HEAD
import android.util.Log;
=======
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
=======
import android.widget.CheckBox;
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

<<<<<<< HEAD
import com.example.per_fact.Activity.CompleteActivity;
import com.example.per_fact.Activity.MainActivity;
import com.example.per_fact.Activity.ScheduleActivity;
import com.example.per_fact.Calendar.EventDecorator;
import com.example.per_fact.Calendar.OneDayDecorator;
import com.example.per_fact.Calendar.SaturdayDecorator;
import com.example.per_fact.Calendar.SundayDecorator;
import com.example.per_fact.Repository.CheckListDictionary;
import com.example.per_fact.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//import org.threeten.bp.DayOfWeek;
//import org.w3c.dom.Text;
=======
import com.example.per_fact.Activity.CheckListActivity;
import com.example.per_fact.Activity.CheckListDictionary;
import com.example.per_fact.Activity.MainActivity;

import com.example.per_fact.Activity.ScheduleActivity;
import com.example.per_fact.R;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
<<<<<<< HEAD
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
=======
import java.util.Date;
import java.util.HashMap;
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
import java.util.Locale;
import java.util.Map;

public class HomeFragment extends Fragment {
    MainActivity mainActivity;
<<<<<<< HEAD
=======

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
    // ?????? ???????????? ?????? ?????????.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) getActivity();
    }

    // ?????? ?????????????????? ????????????.
    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }
<<<<<<< HEAD
    private ArrayList<CheckListDictionary> mArrayList;
    private final OneDayDecorator oneDayDecorator = new OneDayDecorator();
    CheckBox checkBox0, checkBox1, checkBox2, checkBox3, checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9;
    ImageButton btn_checkList_add, btn_week_schedule_open, btn_week_schedule_close, today_schedule_btn_option,
            week_schedule_btn_option,week_schedule_btn_option2,week_schedule_btn_option3, today_schedule_btn_traffic;
=======

    private ArrayList<CheckListDictionary> mArrayList;
    //private MaterialCalenderView calendarView;
    //private final OneDayDecorator oneDayDecorator = new OneDayDecorator();

    CheckBox checkBox0, checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9;
    ImageButton btn_checkList_add, btn_week_schedule_open, btn_week_schedule_close, today_schedule_btn_option,
            week_schedule_btn_option, week_schedule_btn_option2, week_schedule_btn_option3, today_schedule_btn_traffic;
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
    Button schedule_add_button;
    LinearLayout week_schedule_item, week_schedule_item2, week_schedule_item3;
    ConstraintLayout today_schedule;
    static RequestQueue requestQueue;
    ImageView ic_weather;
    TextView current_tmp, txt_weather, txt_clothing;

    //?????? ?????? ?????????
    long mNow;
    Date mDate;
    SimpleDateFormat mFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

<<<<<<< HEAD
        btn_week_schedule_open =(ImageButton)v.findViewById(R.id.btn_week_schedule_open);
        btn_week_schedule_close =(ImageButton)v.findViewById(R.id.btn_week_schedule_close);
=======
        btn_week_schedule_open = (ImageButton) v.findViewById(R.id.btn_week_schedule_open);
        btn_week_schedule_close = (ImageButton) v.findViewById(R.id.btn_week_schedule_close);
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
        today_schedule_btn_option = (ImageButton) v.findViewById(R.id.today_schedule_btn_option);
        btn_checkList_add = (ImageButton) v.findViewById(R.id.check_add_button);
        today_schedule_btn_traffic = (ImageButton) v.findViewById(R.id.today_schedule_btn_traffic);
        week_schedule_btn_option = (ImageButton) v.findViewById(R.id.week_schedule_btn_option);
        week_schedule_btn_option2 = (ImageButton) v.findViewById(R.id.week_schedule_btn_option2);
<<<<<<< HEAD
        week_schedule_btn_option3 = (ImageButton) v.findViewById(R.id.week_schedule_btn_option3);
        schedule_add_button = (Button) v.findViewById(R.id.schedule_add_button);
        week_schedule_item = (LinearLayout) v.findViewById(R.id.week_schedule_item);
        week_schedule_item2 =(LinearLayout)v.findViewById(R.id.week_schedule_item2);
        week_schedule_item3 =(LinearLayout)v.findViewById(R.id.week_schedule_item3);
        today_schedule =(ConstraintLayout)v.findViewById(R.id.today_schedule);
        ic_weather = (ImageView)v.findViewById(R.id.ic_weather);
=======
        //week_schedule_btn_option3 = (ImageButton) v.findViewById(R.id.week_schedule_btn_option3);
        schedule_add_button = (Button) v.findViewById(R.id.schedule_add_button);
        //week_schedule_item = (LinearLayout) v.findViewById(R.id.week_schedule_item);
        week_schedule_item2 = (LinearLayout) v.findViewById(R.id.week_schedule_item2);
        //week_schedule_item3 = (LinearLayout) v.findViewById(R.id.week_schedule_item3);
        today_schedule = (ConstraintLayout) v.findViewById(R.id.today_schedule);
        ic_weather = (ImageView) v.findViewById(R.id.ic_weather);
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
        current_tmp = (TextView) v.findViewById(R.id.txt_current_tmp);
        txt_weather = (TextView) v.findViewById(R.id.txt_weather);
        txt_clothing = (TextView) v.findViewById(R.id.txt_clothing);
        checkBox0 = (CheckBox) v.findViewById(R.id.checkBox0);
        checkBox1 = (CheckBox) v.findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) v.findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) v.findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) v.findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) v.findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) v.findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) v.findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) v.findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) v.findViewById(R.id.checkBox9);
<<<<<<< HEAD
        CalendarView calendarView = v.findViewById(R.id.calendarView);
=======
        //calendarView = (MaterialCalendarview) v.findViewById(R.id.calendarView);

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

        //?????? ???????????? ?????? ??????
        TextView mTextView = v.findViewById(R.id.date_View);
        mTextView.setText(getTime());

        //?????? ?????? ?????? ??????
<<<<<<< HEAD
        if(requestQueue == null){
=======
        if (requestQueue == null) {
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
            requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());
        }
        CurrentCall();

        //??????????????? ?????? ?????? ????????? ??? ??????????????????????????? ??????
        mArrayList = new ArrayList<>();
        btn_checkList_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkBox0.setVisibility(View.INVISIBLE);
                checkBox1.setVisibility(View.INVISIBLE);
                checkBox2.setVisibility(View.INVISIBLE);
                checkBox3.setVisibility(View.INVISIBLE);
                checkBox4.setVisibility(View.INVISIBLE);
                checkBox5.setVisibility(View.INVISIBLE);
                checkBox6.setVisibility(View.INVISIBLE);
                checkBox7.setVisibility(View.INVISIBLE);
                checkBox8.setVisibility(View.INVISIBLE);
                checkBox9.setVisibility(View.INVISIBLE);

<<<<<<< HEAD
                Intent intent = new Intent(getActivity().getApplicationContext(), com.example.per_fact.Activity.CheckListActivity.class);
                intent.putParcelableArrayListExtra("checklist", mArrayList);
                startActivityForResult(intent,0);
            }
        });

//        //??????//
//        // ??? ?????? ????????? ???????????? ????????? ??????
//        calendarView.state()
//                .edit()
//                .setFirstDayOfWeek(DayOfWeek.of(Calendar.SATURDAY))
//                .commit();
//
//        // ???, ????????? ?????????????????? ????????? ?????? (MonthArrayTitleFormatter??? ????????? ??????????????? ?????? setTitleFormatter()??? ?????????)
//        calendarView.setWeekDayFormatter(new ArrayWeekDayFormatter(getResources().getTextArray(R.array.custom_weekdays)));
//
//        //????????? ??????, ????????? ???????????? ????????? + ???????????? ??????
//        calendarView.addDecorators(
//                new SundayDecorator(),
//                new SaturdayDecorator(),
//                new OneDayDecorator());
//
//        // ?????? ?????? ??? ?????? ????????? ??????????????? ??????????????? ??????
//        calendarView.addDecorators(new DayDecorator(getActivity().getApplicationContext()));
//
//
=======
                Intent intent = new Intent(getActivity().getApplicationContext(), CheckListActivity.class);
                intent.putParcelableArrayListExtra("checklist", mArrayList);
                startActivityForResult(intent, 0);
            }
        });
        /*

        //??????//

        // ??? ?????? ????????? ???????????? ????????? ??????
        calendarView.state()
                .edit()
                .setFirstDayOfWeek(DayOfWeek.of(Calendar.SATURDAY))
                .commit();

        // ???, ????????? ?????????????????? ????????? ?????? (MonthArrayTitleFormatter??? ????????? ??????????????? ?????? setTitleFormatter()??? ?????????)
//        calendarView.setTitleFormatter(new MonthArrayTitleFormatter(getResources().getTextArray(R.array.custom_months)));
        calendarView.setWeekDayFormatter(new ArrayWeekDayFormatter(getResources().getTextArray(R.array.custom_weekdays)));
        //????????? ??????, ????????? ???????????? ????????? + ???????????? ??????
        calendarView.addDecorators(
                new SundayDecorator(),
                new SaturdayDecorator(),
                new OneDayDecorator());
        // ?????? ?????? ??? ?????? ????????? ??????????????? ??????????????? ??????
        calendarView.addDecorators(new DayDecorator(getActivity().getApplicationContext()));


//        calendarView.setOnDateChangedListener(new OnDateSelectedListener() {
//            @Override
//            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
//                calendarView.addDecorator(EventDecorator(Collections.singleton(date)));
//            }
//        });

         */

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
        //?????? ?????? ?????? ?????????(????????? ??????)
        schedule_add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                mainActivity.change_to_RoadFragment();
            }
        });

        //TODAY ?????????//
=======
                Intent intent = new Intent(getActivity(), ScheduleActivity.class);
                startActivity(intent);
            }
        });

        //TODAY ?????????
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
        //TODAY ????????? ?????? ?????????
        today_schedule_btn_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                PopupMenu popup= new PopupMenu(getActivity().getApplicationContext(), view, Gravity.CENTER);
=======
                PopupMenu popup = new PopupMenu(getActivity().getApplicationContext(), view, Gravity.CENTER);

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                popup.getMenuInflater().inflate(R.menu.option_menu, popup.getMenu());
                popup.setForceShowIcon(true);

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.menu1:
<<<<<<< HEAD

                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getActivity(), ScheduleActivity.class);
                                startActivity(intent);

                                break;
                            case R.id.menu2:

                                today_schedule.setVisibility(View.GONE);
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show();
=======
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show(); //???????????? ??????


                                break;
                            case R.id.menu2:
                                today_schedule.setVisibility(View.GONE);
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show(); //???????????? ??????
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

                                break;
                        }
                        return false;
                    }
                });
                popup.show();
            }
        });

        //???????????? ???????????? ??????
        today_schedule_btn_traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                mainActivity.change_to_RoadFragment();
            }
        });

        //WEEK ?????????//
        //WEEK ????????? ?????? ?????????
        week_schedule_btn_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup= new PopupMenu(getActivity().getApplicationContext(), view, Gravity.CENTER);
=======
               // mainActivity.change_to_RoadFragment();
            }
        });

        //WEEK ?????????
        week_schedule_btn_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(getActivity().getApplicationContext(), view, Gravity.CENTER);

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                popup.getMenuInflater().inflate(R.menu.option_menu, popup.getMenu());
                popup.setForceShowIcon(true);

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.menu1:
<<<<<<< HEAD

                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getActivity(), ScheduleActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.menu2:

                                week_schedule_item.setVisibility(View.GONE);
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show();
=======
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show(); //???????????? ??????


                                break;
                            case R.id.menu2:
                                week_schedule_item.setVisibility(View.GONE);
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show(); //???????????? ??????
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

                                break;
                        }
                        return false;
                    }
                });
                popup.show();
<<<<<<< HEAD
=======

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
            }
        });
        week_schedule_btn_option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                PopupMenu popup= new PopupMenu(getActivity().getApplicationContext(), view, Gravity.CENTER);
=======
                PopupMenu popup = new PopupMenu(getActivity().getApplicationContext(), view, Gravity.CENTER);

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                popup.getMenuInflater().inflate(R.menu.option_menu, popup.getMenu());
                popup.setForceShowIcon(true);

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.menu1:
<<<<<<< HEAD

                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getActivity(), ScheduleActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.menu2:

                                week_schedule_item2.setVisibility(View.GONE);
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show();
=======
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show(); //???????????? ??????


                                break;
                            case R.id.menu2:
                                week_schedule_item2.setVisibility(View.GONE);
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show(); //???????????? ??????
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

                                break;
                        }
                        return false;
                    }
                });
                popup.show();
<<<<<<< HEAD
            }
        });
        week_schedule_btn_option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup= new PopupMenu(getActivity().getApplicationContext(), view, Gravity.CENTER);
=======

            }
        });
        /*
        week_schedule_btn_option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(getActivity().getApplicationContext(), view, Gravity.CENTER);

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                popup.getMenuInflater().inflate(R.menu.option_menu, popup.getMenu());
                popup.setForceShowIcon(true);

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.menu1:
<<<<<<< HEAD

                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getActivity(), ScheduleActivity.class);
                                startActivity(intent);

                                break;
                            case R.id.menu2:

                                week_schedule_item3.setVisibility(View.GONE);
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show();
=======
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show(); //???????????? ??????


                                break;
                            case R.id.menu2:
                                week_schedule_item3.setVisibility(View.GONE);
                                Toast.makeText(view.getContext(), "??????", Toast.LENGTH_SHORT).show(); //???????????? ??????
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

                                break;
                        }
                        return false;
                    }
                });
                popup.show();
<<<<<<< HEAD
            }
        });
=======

            }
        });
        */


        //?????? ????????? ????????? ??????
        btn_week_schedule_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_week_schedule_open.setVisibility(btn_week_schedule_open.GONE);
                btn_week_schedule_close.setVisibility(btn_week_schedule_close.VISIBLE);

                week_schedule_item2.setVisibility(week_schedule_item2.VISIBLE);
                week_schedule_item3.setVisibility(week_schedule_item3.VISIBLE);
            }
        });
        //?????? ????????? ?????? ??????
        btn_week_schedule_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_week_schedule_open.setVisibility(btn_week_schedule_open.VISIBLE);
                btn_week_schedule_close.setVisibility(btn_week_schedule_close.GONE);

                week_schedule_item2.setVisibility(week_schedule_item2.GONE);
                week_schedule_item3.setVisibility(week_schedule_item3.GONE);
            }
        });

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012

        return v;
    }//end of onCreateView

    //DATE??? ?????? ??????
<<<<<<< HEAD
    private String getTime(){
=======
    private String getTime() {
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
        mNow = System.currentTimeMillis();
        mDate = new Date(mNow);
        return mFormat.format(mDate);
    }

    //?????? ?????? ?????? ??????
    private void CurrentCall() {
<<<<<<< HEAD
        String url = "http://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=31594f3577ef731e2ce17c60a34f04a3";
=======


        String url = "http://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=31594f3577ef731e2ce17c60a34f04a3";

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(String response) {
                try {
                    //api??? ?????? ?????? jsonobject??? ????????? ?????? ??????
                    JSONObject jsonObject = new JSONObject(response);

                    //?????? ?????? ??????
                    String city = jsonObject.getString("name");

                    //?????? ?????? ??????
                    JSONArray weatherJson = jsonObject.getJSONArray("weather");
                    JSONObject weatherObj = weatherJson.getJSONObject(0);
                    String weather = weatherObj.getString("description");
                    txt_weather.setText(weather);

                    //?????? ?????? ??????
                    JSONObject tempK = new JSONObject(jsonObject.getString("main"));

                    //?????? ?????? ?????? ????????? ?????? ????????? ??????
<<<<<<< HEAD
                    double tempDo = (Math.round((tempK.getDouble("temp")-273.15)*100)/100.0);
                    String tempDo_s = String.format("%.0f", tempDo);
                    current_tmp.setText(tempDo_s +  "??C");
=======
                    double tempDo = (Math.round((tempK.getDouble("temp") - 273.15) * 100) / 100.0);
                    String tempDo_s = String.format("%.0f", tempDo);
                    current_tmp.setText(tempDo_s + "??C");
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                    if (tempDo <= 4) {
                        txt_clothing.setText("??? ??????\n??? ?????? ???\n??? ?????????\n");

                    }
                    if (4 < tempDo && tempDo <= 16) {
                        txt_clothing.setText("??? ?????????\n??? ??????\n??? ???????????????\n");

                    }
                    if (16 < tempDo && tempDo <= 22) {
                        txt_clothing.setText("??? ?????????\n??? ?????? ???\n??? ????????????\n");

                    }
                    if (22 <= tempDo) {
                        txt_clothing.setText("??? ?????? ??????\n??? ?????? ???\n??? ??????\n");

                    }

                    //?????? ????????? ??????
                    JSONArray weather_object = jsonObject.getJSONArray("weather");
<<<<<<< HEAD
                    JSONObject weather_icon= weather_object.getJSONObject(0);
                    String icon = weather_icon.getString("icon");
                    int resID = getResId("icon_"+icon, R.drawable.class);
=======
                    JSONObject weather_icon = weather_object.getJSONObject(0);
                    String icon = weather_icon.getString("icon");
                    int resID = getResId("icon_" + icon, R.drawable.class);
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
                    ic_weather.setImageResource(resID);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();

                return params;
            }

        };
<<<<<<< HEAD
        request.setShouldCache(false);
        requestQueue.add(request);
    }
=======

        request.setShouldCache(false);
        requestQueue.add(request);

    }

>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
    public static int getResId(String resName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    //End of ?????????????????? ??????

    //????????????????????????????????? ????????? ????????? ??????
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == 0) {
            mArrayList = new ArrayList<>();
            mArrayList = data.getParcelableArrayListExtra("checklist");
<<<<<<< HEAD
            checkout_switch();
        }
    }

//    /* ????????? ????????? background??? ???????????? Decorator ????????? */
//    private static class DayDecorator implements DayViewDecorator {
//
//        private final Drawable drawable;
//        public DayDecorator(Context context) {
//            drawable = ContextCompat.getDrawable(context, R.drawable.calendar_selector);
//        }
//
//        // true??? ?????? ??? ?????? ????????? ?????? ????????? ??????????????? ????????????
//        @Override
//        public boolean shouldDecorate(CalendarDay day) {
//            return true;
//        }
//
//        // ?????? ?????? ??? ?????? ????????? ??????????????? ??????????????? ??????
//        @Override
//        public void decorate(DayViewFacade view) {
//            view.setSelectionDrawable(drawable);
//        }
//    }

    //??????????????? switch???
=======


            //checkout_switch();
        }
    }

/*
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
    private void checkout_switch() {
        for (int i = 0; i < mArrayList.size(); i++) {
            switch (i) {
                case 0:
                    checkBox0.setVisibility(View.VISIBLE);
                    checkBox0.setText(mArrayList.get(0).getId());
                    checkBox0.setChecked(mArrayList.get(0).isSelected());
                    break;
                case 1:
                    checkBox1.setVisibility(View.VISIBLE);
                    checkBox1.setText(mArrayList.get(1).getId());
                    checkBox1.setChecked(mArrayList.get(1).isSelected());
                    break;
                case 2:
                    checkBox2.setVisibility(View.VISIBLE);
                    checkBox2.setText(mArrayList.get(2).getId());
                    checkBox2.setChecked(mArrayList.get(2).isSelected());
                    break;
                case 3:
                    checkBox3.setVisibility(View.VISIBLE);
                    checkBox3.setText(mArrayList.get(3).getId());
                    checkBox3.setChecked(mArrayList.get(3).isSelected());
                    break;
                case 4:
                    checkBox4.setVisibility(View.VISIBLE);
                    checkBox4.setText(mArrayList.get(4).getId());
                    checkBox4.setChecked(mArrayList.get(4).isSelected());
                    break;
                case 5:
                    checkBox5.setVisibility(View.VISIBLE);
                    checkBox5.setText(mArrayList.get(5).getId());
                    checkBox5.setChecked(mArrayList.get(5).isSelected());
                    break;
                case 6:
                    checkBox6.setVisibility(View.VISIBLE);
                    checkBox6.setText(mArrayList.get(6).getId());
                    checkBox6.setChecked(mArrayList.get(6).isSelected());
                    break;
                case 7:
                    checkBox7.setVisibility(View.VISIBLE);
                    checkBox7.setText(mArrayList.get(7).getId());
                    checkBox7.setChecked(mArrayList.get(7).isSelected());
                    break;
                case 8:
                    checkBox8.setVisibility(View.VISIBLE);
                    checkBox8.setText(mArrayList.get(8).getId());
                    checkBox8.setChecked(mArrayList.get(8).isSelected());
                    break;
                case 9:
                    checkBox9.setVisibility(View.VISIBLE);
                    checkBox9.setText(mArrayList.get(9).getId());
                    checkBox9.setChecked(mArrayList.get(9).isSelected());
                    break;
            }
        }
    }
<<<<<<< HEAD
}
=======

 */

    /*

     ????????? ????????? background??? ???????????? Decorator ?????????
    private static class DayDecorator implements DayViewDecorator {

        private final Drawable drawable;

        public DayDecorator(Context context) {
            drawable = ContextCompat.getDrawable(context, R.drawable.calendar_selector);
        }

        // true??? ?????? ??? ?????? ????????? ?????? ????????? ??????????????? ????????????
        @Override
        public boolean shouldDecorate(CalendarDay day) {
            return true;
        }

        // ?????? ?????? ??? ?????? ????????? ??????????????? ??????????????? ??????
        @Override
        public void decorate(DayViewFacade view) {
            view.setSelectionDrawable(drawable);
//            view.addSpan(new StyleSpan(Typeface.BOLD));   // ?????? ?????? ?????? ???????????? ?????? ?????????
        }
    }
    */


// https://59595959.tistory.com/4
//    private class ApiSimulator extends AsyncTask<Void, Void, List<CalendarDay>> {
//
//        String[] Time_Result;
//
//        ApiSimulator(String[] Time_Result) {
//            this.Time_Result = Time_Result;
//        }
//
//        @Override
//        protected List<CalendarDay> doInBackground(@NonNull Void... voids) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            Calendar calendar = Calendar.getInstance();
//            ArrayList<CalendarDay> dates = new ArrayList<>();
//
//
//            /*???????????? ????????? ?????????????????????*/
//            /*?????? 0??? 1??? ???,?????? ?????????*/
//            //string ???????????? Time_Result ??? ???????????? ,??? ???????????? ????????? string??? int ??? ??????
//            for (int i = 0; i < Time_Result.length; i++) {
//
//
//                //??????????????? day??? ???????????? ?????? ?????? ?????? ?????? ????????? ????????????.
//                //?????? ?????? ???????????? ??? ?????? ????????? ?????? ????????? ???????????? ????????? ?????? ????????? ???????????? ???????????? ??????, ?????? ?????? ???????????? ?????? ???.
//                // day?????? ????????????
//
//                //                CalendarDay day = CalendarDay.from(calendar);
//                //                Log.e("????????? ??????","day"+day);
//                String[] time = Time_Result[i].split(",");
//
//                int year = Integer.parseInt(time[0]);
//                int month = Integer.parseInt(time[1]);
//                int dayy = Integer.parseInt(time[2]);
//
//                //???????????? ????????? ?????? ????????? ??????
//                //?????? .set ?????? ???????????? ????????? ?????? CalendarDay day = CalendarDay.from(calendar); ??????????????? ??? ?????? ????????? ?????? ????????? ???????????? ?????? ???.
//                calendar.set(year, month - 1, dayy);
//                CalendarDay day = CalendarDay.from(calendar);
//                dates.add(day);
//
//            }
//
//
//            return dates;
//        }
//
//        @Override
//        protected void onPostExecute(@NonNull List<Calendarday> calendarDays) {
//            super.onPostExecute(CalendarDays);
//
//            if (isFinishing()) {
//                return;
//            }
//
//            materialCalendarView.addDecorator(new EventDecorator(Color.RED, calendarDays));        }
//    }


}
>>>>>>> d0f3f43876eb9cb8916071aef217cd59b7e3a012
