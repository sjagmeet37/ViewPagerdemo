package com.doctor.jagmeet.tabbed;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class BlankFragment extends Fragment implements
        android.view.View.OnClickListener{
    //

    Button save;
    ImageView i1,i2;
    EditText e1;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        e1= v.findViewById(R.id.complaint);

        i1 = v.findViewById(R.id.mic);
        i2 = v.findViewById(R.id.cleartext);

        save = v.findViewById(R.id.save);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        save.setOnClickListener(this);
        Toast.makeText(getContext(),"khekheg",Toast.LENGTH_SHORT).show();

        return v;
    }

    /*@Override
    public void onStart() {

        super.onStart();

        e1= getActivity().findViewById(R.id.complaint);

        i1 = getActivity().findViewById(R.id.mic);
        i2 = getActivity().findViewById(R.id.cleartext);

        save = getActivity().findViewById(R.id.save);

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        save.setOnClickListener(this);
    }*/


    @Override
    public void onClick(View view) {

        Toast.makeText(getContext(),e1.getText().toString(),Toast.LENGTH_LONG).show();

        switch (view.getId()) {
            case R.id.save:
                Toast.makeText(getContext(),e1.getText().toString(),Toast.LENGTH_LONG).show();
                break;

            case R.id.mic:
                Toast.makeText(getContext(),e1.getText().toString(),Toast.LENGTH_LONG).show();
                break;

            case R.id.cleartext:
                e1.setText("");
                break;

            default:
                break;
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

}
