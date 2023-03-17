package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<exampleitem> exampleItems;
    private Button buttonAdd, buttonDelete;
    private EditText editTextAdd, editTextDelete;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonDelete = findViewById(R.id.buttondelete);
        editTextAdd = findViewById(R.id.edittextadd);
        editTextDelete = findViewById(R.id.edittextdelete);

        generatedata();
        recyclervieConfig();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = Integer.parseInt(editTextAdd.getText().toString());
                addCard(position);
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = Integer.parseInt(editTextDelete.getText().toString());
                deletecard(position);
            }
        });
    }


    public void generatedata(){
        exampleItems = new ArrayList<>();
        exampleItems.add(new exampleitem(R.drawable.first, "clicked in in india"));
        exampleItems.add(new exampleitem(R.drawable.second, "clicked in india"));
        exampleItems.add(new exampleitem(R.drawable.third, "clicked in india"));
        exampleItems.add(new exampleitem(R.drawable.four, "clicked in india"));
        exampleItems.add(new exampleitem(R.drawable.five, "clicked in india"));
        exampleItems.add(new exampleitem(R.drawable.six, "clicked in india"));
    }

    public void recyclervieConfig(){
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleItems);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    public void addCard(int position){
        exampleItems.add(position, new exampleitem(R.drawable.first, "clicked on cmp campus"));
        adapter.notifyItemInserted(position);
    }
    public void deletecard(int position){
        exampleItems.remove(position);
        adapter.notifyItemRemoved(position);
    }
}



