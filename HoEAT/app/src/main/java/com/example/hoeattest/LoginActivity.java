package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    private EditText et_id, et_pass;
    private Button btn_login;
    private TextView btn_register;
    //네비
    private ImageView nv_main1,nv_main2,nv_main3;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_id = findViewById(R.id.et_id);
        et_pass = findViewById(R.id.et_pass);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);

        //네비
        nv_main1=findViewById(R.id.nv_main1);
        nv_main2=findViewById(R.id.nv_main2);
        nv_main3=findViewById(R.id.nv_main3);
        //



        // 회원가입 버튼을 클릭 시 수행
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // EditText에 현재 입력되어있는 값을 get(가져온다)해온다.
//                String userID = et_id.getText().toString();
//                String userPass = et_pass.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MbtiStartActivity.class);
                startActivity(intent);
//
//                Response.Listener<String> responseListener = new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try {
//                            // TODO : 인코딩 문제때문에 한글 DB인 경우 로그인 불가
//                            System.out.println("hongchul" + response);
//                            JSONObject jsonObject = new JSONObject(response);
//                            boolean success = jsonObject.getBoolean("success");
//                            if (success) { // 로그인에 성공한 경우
//                                String userID = jsonObject.getString("userID");
//                                String userPass = jsonObject.getString("userPassword");
//                                String userName= jsonObject.getString("userName");
//                                String userMbti= jsonObject.getString("userMbti");
//
//                                Toast.makeText(getApplicationContext(),userName+"님 로그인에 성공하였습니다.",Toast.LENGTH_SHORT).show();
//
//                                if (userMbti.length()>=1){
//                                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                                    intent.putExtra("userID", userID);
//                                    intent.putExtra("userPass", userPass);
//                                    intent.putExtra("userName",userName);
//                                    startActivity(intent);
//                                }else{
//                                    Intent intent = new Intent(LoginActivity.this, MbtiStartActivity.class);
//                                    intent.putExtra("userID", userID);
//                                    intent.putExtra("userPass", userPass);
//                                    intent.putExtra("userMbti", userMbti);
//                                    startActivity(intent);
//                                }
//                                //수정할부분 첫로그인인사람만 적용 아니면 바로 메인으로
//
//                            } else { // 로그인에 실패한 경우
//                                Toast.makeText(getApplicationContext(),"로그인에 실패하였습니다.",Toast.LENGTH_SHORT).show();
//                                return;
//                            }
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                };
//                LoginRequest loginRequest = new LoginRequest(userID, userPass, responseListener);
//                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
//                queue.add(loginRequest);
            }
        });
















    }
}