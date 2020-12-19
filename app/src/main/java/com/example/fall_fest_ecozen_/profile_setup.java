package com.example.fall_fest_ecozen_;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class profile_setup extends AppCompatActivity {

    private DatabaseReference CustomerRef;
    EditText Name, Address, Email, Phone_no;
    Button save;
    FirebaseAuth mAuth;
    DatabaseReference userRef;
    String currUserId,token;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setup);

        Name = findViewById(R.id.name);
        Address = findViewById(R.id.address);
        Email = findViewById(R.id.email);
        Phone_no = findViewById(R.id.phone_no);
        save = findViewById(R.id.save_button);

        mAuth = FirebaseAuth.getInstance();

        currUserId = mAuth.getCurrentUser().getUid();

        userRef = FirebaseDatabase.getInstance().getReference().child("Customers").child(currUserId);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveAccountInfo();
            }
        });



    }

    private void SaveAccountInfo() {





                String uName = Name.getText().toString();
                String Add = Address.getText().toString();
                String Emailid = Email.getText().toString();
                String Phno = Phone_no.getText().toString();

                if (uName.isEmpty()) {
                    Name.setError("Enter Name!");
                    Name.requestFocus();
                    return;
                }
                if (Add.isEmpty()) {
                    Address.setError("Enter Address!");
                    Address.requestFocus();
                    return;
                }
                if (Emailid.isEmpty()) {
                    Email.setError("Enter Email!");
                    Email.requestFocus();
                    return;
                }
                if (Phno.isEmpty()) {
                    Phone_no.setError("Enter Admission Number!");
                    Phone_no.requestFocus();
                    return;
                } else {


                    HashMap user = new HashMap();
                    user.put("username", uName);
                    user.put("Address", Add);
                    user.put("Email", Emailid);
                    user.put("Phone_number", Phno);

                    userRef.updateChildren(user).addOnCompleteListener(new OnCompleteListener() {
                        @Override
                        public void onComplete(@NonNull Task task) {
                            if (task.isSuccessful()) {

                                Toast.makeText(profile_setup.this, "Details Saved", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(profile_setup.this, MainActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                                finish();

                            } else {
                                Toast.makeText(profile_setup.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }

    }
}