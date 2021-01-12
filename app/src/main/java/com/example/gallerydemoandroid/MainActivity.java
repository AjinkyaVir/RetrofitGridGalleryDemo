package com.example.gallerydemoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {




    private GridView mGridView;
    private GalleryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adapter=new MyAdapter(getApplicationContext(),list_data);
        getData();

    }

    private void populateGridView(List<Result> spacecraftList) {
        mGridView = findViewById(R.id.galleryGridView);

        adapter = new GalleryAdapter(this,spacecraftList);
        mGridView.setAdapter(adapter);
    }

    private void getData() {
        ApiServices services = RetrofitClientInstance.getRetrofitInstance(this).create(ApiServices.class);
        Call<List<Result>> call = services.getProperties((long) 2);
        Log.i("@ajinkya","success === >>> " + call.request().url());
       call.enqueue(new Callback<List<Result>>() {
           @Override
           public void onResponse(Call<List<Result>> call, Response<List<Result>> response) {
               Log.i("@ajinkya","response =>> " + response.body());
               populateGridView(response.body());

           }

           @Override
           public void onFailure(Call<List<Result>> call, Throwable t) {
               Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
           }
       });

    }
}