package com.example.android_week06;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoseFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShoseFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShoseFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShoseFragment newInstance(String param1, String param2) {
        ShoseFragment fragment = new ShoseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private ListView listView;
    private ShoesAdapter adt;
    private ArrayList<Shoes> arrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_shose, container, false);


        listView= view.findViewById(R.id.isListView);

        arrayList= new ArrayList<>();
        arrayList.add(new Shoes(1,"","Pls touch to see detail","Nike shoes-discount 50%",R.drawable.shoes_rm_preview_b));
        arrayList.add(new Shoes(2,"","Pls touch to see detail","Adidas shoes-discount 80%",R.drawable.shoes_rm_purple));
        arrayList.add(new Shoes(3,"","Pls touch to see detail","Nike Bicycle-discount 30%",R.drawable.shoes_rm_preview_a));
        arrayList.add(new Shoes(4,"","Pls touch to see detail","Yonex shoes-discount 50%",R.drawable.shoes_rm_preview));
        arrayList.add(new Shoes(5,"","Pls touch to see detail","Victor shoes-discount 50%",R.drawable.shoes_rm_yellow));
        arrayList.add(new Shoes(6,"","Pls touch to see detail","Lining shoes-discount 50%",R.drawable.shoes_white_removebg_preview));
        arrayList.add(new Shoes(7,"","Pls touch to see detail","Binh Minh shoes-discount 90%",R.drawable.color_removebg_preview));

        adt= new ShoesAdapter(getActivity(),R.layout.item,arrayList);

        listView.setAdapter(adt);
        return view;
    }
}