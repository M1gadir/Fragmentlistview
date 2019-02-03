package com.magad.fragmentlistview.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.magad.fragmentlistview.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class listFragment extends Fragment {
    FragmentManager fm;
    String[] Hewan = {"Gajah", "Macan", "Beruang", "Jerapah"};
    String[] category ={"herbivora","karnivora","karnivora","herbivora"};
    int[] imagehewan = {R.drawable.gajah, R.drawable.macan, R.drawable.beruang, R.drawable.jerpaah};

    String nama = "Hewan";
    String image = "imagehewan";
    String categ = "category";

    ListView lv;

    public listFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        lv = v.findViewById(R.id.contacaat);
        List<HashMap<String, String>> listContact = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < 4; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();

            hm.put(nama, Hewan[i]);
            hm.put(image, Integer.toString(imagehewan[i]));
            hm.put(categ,category[i]);

            listContact.add(hm);

        }

        String[] from = {nama, image, categ};
        int[] to = {R.id.tv_nama, R.id.gamimage,R.id.tv_entah};

        SimpleAdapter sider = new SimpleAdapter(getActivity(), listContact, R.layout.listviwlay, from, to);
        lv.setAdapter(sider);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(getActivity(), "jadi gajah adalah sebuah hewan yang dikategorikan mamalia dan gajah itu memiliki 2 gading", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getActivity(), "Dan macan adalah hewan karnivora yang sangat mematikan dan juga sangat cepat larinya dan dia juga bisa membunuh manusia", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getActivity(), "Dan Beruang adalah sebuah Hewan yang banyak di jumpai di kawasan eropa yang serinkali memangsa manusia dan tentu saja berunag juga karnivora", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getActivity(), "dan jerapah adalah hewan yang memiliki leher yang panjang seerti burung unta dan flaminggo dan jerapah juga hewan herbivora", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


        return v;

    }


}

