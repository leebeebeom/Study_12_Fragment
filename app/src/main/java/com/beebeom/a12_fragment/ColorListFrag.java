package com.beebeom.a12_fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.Arrays;
import java.util.List;

public class ColorListFrag extends ListFragment {

    //리스너 만들기
    interface OnColorSelectedListener {
        void onColorSelected(int color);
    }
    private OnColorSelectedListener mListener;

    //프래그먼트 생명주기 첫번째 메소드
    //액티비티에 붙을 때 호출됨.
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        // 메인액티비티에 구현을 강제함.
        // 원래는 트라이 캐치로 연결해달라는 에러도 표시해야함
        mListener = (OnColorSelectedListener) context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //리스트에 표시될 데이터
        List<String> colorlist = Arrays.asList("Red", "Green", "Blue");

        //어댑터
        ArrayAdapter<String> adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, colorlist);

        //리스트 프래그먼트는 내부에 리스트뷰를 가지고 있어서 바로 어댑터를 꽂을 수 있음.
        setListAdapter(adapter);
    }

    //리스트 아이템 클릭시
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //색 이름 가져오기
        String colorname = (String) l.getAdapter().getItem(position);
        int color = 0;
        switch (colorname) {
            case "Red":
                color = Color.RED;
                break;
            case "Green":
                color = Color.GREEN;
                break;
            case "Blue":
                color = Color.BLUE;
        }
        //onColorSelected 를 구현하고 있는 액티비티에 인자값을 전달해줌
        mListener.onColorSelected(color);
    }
}
