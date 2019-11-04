package com.mm.appstatus.TabLayoutWhatsApp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.mm.appstatus.MainMain;
import com.mm.appstatus.R;


public class Feeds extends Fragment   {
    private Context acontext;
    ImageButton bt;
    SwipeRefreshLayout mSwipeRefreshLayout;
    public  Feeds(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fregment_feeds, container, false);
        bt = v.findViewById(R.id.DisplayImagesButton);



      bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity().getApplication(), MainMain.class);
                startActivity(i);
            }
        });

        return v;
    }

}