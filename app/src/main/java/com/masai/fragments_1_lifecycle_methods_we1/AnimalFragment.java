package com.masai.fragments_1_lifecycle_methods_we1;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class AnimalFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Animal> animalList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void buildList() {
        for (int i = 0; i < 100; i++) {
            Animal animal = new Animal("ZOHO", R.drawable.dog1);
            animalList.add(animal);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerview);
    }
}
//on attach, onCreate, onCreateViews, onViewCreated



















