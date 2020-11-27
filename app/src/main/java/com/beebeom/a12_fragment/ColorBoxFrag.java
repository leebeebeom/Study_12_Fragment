package com.beebeom.a12_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ColorBoxFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //다른 뷰가 필요 없으므로 그냥 뷰 하나만 생성해서 리턴해줌.
        return new View(getContext());
    }

    //메소드 생성
    public void setColor(int color) {
        //리턴해준 뷰에 컬러 입혀줌
        getView().setBackgroundColor(color);
    }

}
