package com.example.hoeattest;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Calendar;

import java.util.GregorianCalendar;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    private EditText et_id, et_pass, et_name, et_age;
    String et_mbti;
    private Button btn_register,doublecheck;
    private ImageView select,reg_sex;
    int mYear, mMonth, mDay, mHour, mMinute;
    int sex=1;
    String sexs;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // 액티비티 시작시 처음으로 실행되는 생명주기!
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        doublecheck=findViewById(R.id.doublecheck);
        et_id = findViewById(R.id.et_id);
        et_pass = findViewById(R.id.et_pass);
        et_name = findViewById(R.id.et_name);
        reg_sex=findViewById(R.id.reg_sex);

        et_mbti = "";
        et_age=findViewById(R.id.et_age);




        doublecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"사용가능한 아이디입니다",Toast.LENGTH_SHORT).show();
            }
        });

        reg_sex.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                if(sex==1){
                    sex=2;
                    sexs="남";
                    reg_sex.setImageResource(R.drawable.signup_woman);
                }else{
                    sex=1;
                    sexs="여";
                    reg_sex.setImageResource(R.drawable.signup_men);
                }

            }
        });





        // 아이디 값 찾아주기


//        et_sex = findViewById(R.id.et_sex);







        // 회원가입 버튼 클릭 시 수행


        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // EditText에 현재 입력되어있는 값을 get(가져온다)해온다.
//                String userID = et_id.getText().toString();
//                String userPass = et_pass.getText().toString();
//                String userName = et_name.getText().toString();
//                String userMbti = et_mbti;
//                int userAge = Integer.parseInt(et_age.getText().toString());
//                String userSex = sexs;
//                Response.Listener<String> responseListener = new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try {
//                            JSONObject jsonObject = new JSONObject(response);
//                            boolean success = jsonObject.getBoolean("success");
//                            if (success) { // 회원등록에 성공한 경우
//                                Toast.makeText(getApplicationContext(),"회원 등록에 성공하였습니다.",Toast.LENGTH_SHORT).show();
//                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
//                                startActivity(intent);
//                            } else { // 회원등록에 실패한 경우
//                                Toast.makeText(getApplicationContext(),"회원 등록에 실패하였습니다.",Toast.LENGTH_SHORT).show();
//                                return;
//                            }
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//                    }
//                };
//                // 서버로 Volley를 이용해서 요청을 함.
//                RegisterRequest registerRequest = new RegisterRequest(userID,userPass,userName,userMbti, userAge,userSex, responseListener);
//                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
//                queue.add(registerRequest);

                Toast.makeText(getApplicationContext(),"회원가입에 성공했습니다",Toast.LENGTH_SHORT).show();
                finish();
            }
        });



    }



}