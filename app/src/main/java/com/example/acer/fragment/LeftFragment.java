package com.example.acer.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acer on 2016/9/4.
 */
public class LeftFragment extends ListFragment {

    private ArrayAdapter<String> adapter;
    private FragmentManager manager;
    private FragmentTransaction transaction;
public List<String> getData(){
        List<String> list = new ArrayList<String>();
            for (int i = 0;i < 30; i++){
                list.add("文章" + i);// 模拟文章的标题
            }
        return  list;
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_expandable_list_item_1,getData());
        manager = getFragmentManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.leftfragment,null);
       setListAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String item = adapter.getItem(position);
        RightFragment fragment = new RightFragment();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.right, fragment, "fragment");
        transaction.addToBackStack("fragment");
        Bundle bundle = new Bundle();
        bundle.putString("item",item);
        fragment.setArguments(bundle);
        transaction.commit();

    }
}
