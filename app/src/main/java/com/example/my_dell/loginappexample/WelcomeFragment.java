package com.example.my_dell.loginappexample;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {
private TextView textView;
private Button Bnlogout;
OnLogoutListner logoutListner ;
public interface OnLogoutListner
    {

        public void  LogoutPerformed();
    }


    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        textView = view.findViewById(R.id.nametextview);
        textView.setText(" Welcome "+MainActivity.prefConfig.readName());
        Bnlogout = view.findViewById(R.id.logoutbtn);
        Bnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
logoutListner.LogoutPerformed();
            }
        });

    return view;
    }
    @Override
    public void onAttach(Context context){
    super.onAttach(context);

        Activity activity = (Activity) context;
        logoutListner = (OnLogoutListner) activity ;
    }


}
