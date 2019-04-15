package com.example.acer.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Acer on 2016/9/5.
 */
public class RightFragment extends Fragment {
    public RightFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.right,null);
        TextView textView = (TextView) view.findViewById(R.id.tv);
        Bundle bundle = getArguments();
        if (bundle != null){
            String item = bundle.getString("item");
            textView.setText(item);
        }

        return  view;
    }


    @Override
    public void onPause() {
        super.onPause();
    }
}
