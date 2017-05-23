package com.example.wangning.juzhen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.wangning.juzhen.jieti.model.Fenshu;
import com.example.wangning.juzhen.jieti.presenter.MyPresenter;
import com.example.wangning.juzhen.jieti.view.IView;

public class LoginActivity extends AppCompatActivity implements IView,View.OnClickListener {
    EditText editText;
    Button wanBtn;
    Button cleBtn;
    Fenshu fenshu;
    MyPresenter myPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText= (EditText) findViewById(R.id.fenshu);
        wanBtn= (Button) findViewById(R.id.wanchenshuru);
        wanBtn.setOnClickListener(this);
        cleBtn= (Button) findViewById(R.id.cleartext);
        cleBtn.setOnClickListener(this);
        myPresenter=new MyPresenter(this);
    }

    @Override
    public void onClear() {
        editText.setText("");
    }

    @Override
    public void onWanchen() {
        fenshu=new Fenshu(editText.getText().toString());
        editText.setText(fenshu.geshihua());
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cleartext:
                myPresenter.clerae();
                break;
            case R.id.wanchenshuru:
                myPresenter.wanchen();
                break;
            default:
                break;
        }
    }
}
