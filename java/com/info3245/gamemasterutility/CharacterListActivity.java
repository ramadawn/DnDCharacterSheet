package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class CharacterListActivity extends ListActivity {
    String [] files;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_character_list);

        files = getApplicationContext().fileList();

        setListAdapter(new ArrayAdapter<String>(CharacterListActivity.this,R.layout.activity_character_list,R.id.listOfChars,files));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String fileName = files[position];
        Intent intent = new Intent(CharacterListActivity.this,CharacterDisplayActivity.class);
        String data = load(fileName);
        intent.putExtra("data",data);
        startActivity(intent);
        //Toast.makeText(this, fileName, Toast.LENGTH_LONG).show();
    }

    public String load(String lFileName) {
        //Initialize File Input Stream
        FileInputStream fis = null;

        try {
            //Open the file in the input stream
            fis = openFileInput(lFileName);
            //Initialize Input Stream Reader
            InputStreamReader isr = new InputStreamReader(fis);
            //Initialize Buffered Reader
            BufferedReader br = new BufferedReader(isr);
            //Initialize String Builder
            StringBuilder sb = new StringBuilder();
            //String to temporarily hold text from the file
            String text;

            while((text = br.readLine()) != null) {
                sb.append(text).append("/n");
            }

            return sb.toString();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return e.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return e.toString();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return e.toString();
                }
            }
        }
    }//end load function
}