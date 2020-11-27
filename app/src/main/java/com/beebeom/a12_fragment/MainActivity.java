package com.beebeom.a12_fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements ColorListFrag.OnColorSelectedListener {

    private ColorBoxFrag mColorBoxFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //프래그먼트를 객체화 시킬땐 프래그먼트매니져가 필요함.
        mColorBoxFrag = (ColorBoxFrag) getSupportFragmentManager().findFragmentById(R.id.color_box_frag);

    }

    //리스트 프래그먼트에서 아이템 클릭시 mListener 로 인자값을 전달해주면서 호출됨
    @Override
    public void onColorSelected(int color) {
        //setColor 는 내가 생성한 메소드
        mColorBoxFrag.setColor(color);
    }
}