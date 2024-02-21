package com.example.login;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragment_register extends Fragment {

    EditText username, password, repassword;
    Button signup, signin;
    DBHelper DB;

    public Fragment_register() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register, container, false);
        username = (EditText) v.findViewById(R.id.username);
        password = (EditText) v.findViewById(R.id.password);
        repassword = (EditText) v.findViewById(R.id.repassword);
        signup = (Button) v.findViewById(R.id.btnsignup);
        signin = (Button) v.findViewById(R.id.btnsignin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new Fragment_login();
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.framelayout,fragment).addToBackStack("name").commit();
            }
        });
        if (getActivity() != null) {
            DB = new DBHelper(getActivity());
        } else {
            signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String user = username.getText().toString();
                    String pass = password.getText().toString();
                    String repass = repassword.getText().toString();

                    if (user.equals("") || pass.equals("") || repass.equals(""))
                        Toast.makeText(getContext(), "Please enter all the fields", Toast.LENGTH_SHORT).show();
                    else {
                        if (pass.equals(repass)) {
                            Boolean checkuser = DB.checkusername(user);
                            if (checkuser == false) {
                                Boolean insert = DB.insertData(user, pass);
                                if (insert == true) {
                                    Toast.makeText(getContext(), "registered succcessfully", Toast.LENGTH_SHORT).show();
                                    Fragment_login fragment = new Fragment_login();
                                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                                    transaction.replace(R.id.framelayout, fragment).addToBackStack("name").commit();

                                } else {
                                    Toast.makeText(getContext(), "registration failed", Toast.LENGTH_SHORT).show();

                                }
                            } else {
                                Toast.makeText(getContext(), "user already exists pls go to sign in", Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            Toast.makeText(getContext(), "Password not matching", Toast.LENGTH_SHORT).show();

                        }


                    }
                }
            });

            return v;
        }
        return v;
    }}
