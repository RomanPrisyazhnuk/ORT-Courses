package com.android3.calc;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
//    import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ResulFragment extends Fragment {
    Button back;
    TextView res;
    FragmentTransaction fm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v =inflater.inflate(R.layout.fragment_result,  null);
        res = (TextView) v.findViewById(R.id.txt_result);
        back = (Button) v.findViewById(R.id.btn_back);
        String calcResult = String.valueOf(MainActivity.result);
        res.setText(calcResult);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                getFragmentManager().popBackStack();
            }
        });
        return v;
    }
}