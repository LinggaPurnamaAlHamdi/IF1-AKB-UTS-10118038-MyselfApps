/*
Tanggal pengerjaan : 1 Juni 2021
        NIM : 10118038
        Nama : Lingga Purnama Al Hamdi
        Kelas : IF-1
*/
package com.example.myselfapps.dailyactivity;

import com.example.myselfapps.R;

import java.util.ArrayList;

public class Friends_Data {
    private static String[] data_nama = {
            "Acep Bambang Nurjaman",
            "Azis Komara",
            "Ikrar Anugrah Bastary",
            "Muhammad Farid Agung Maulana",
            "Muhyidin Yahya"
    };

    private static String[] data_username = {
            "@acep03",
            "@azira16",
            "@ixr13",
            "@agung25",
            "@muhyi45"
    };

    private static int[] data_img = {
            R.drawable.acep,
            R.drawable.azis,
            R.drawable.ikrar,
            R.drawable.agung,
            R.drawable.muhyi
    };

    public static ArrayList<Friends> getListData() {
        ArrayList<Friends> list = new ArrayList<>();
        for (int position = 0; position<data_nama.length; position++) {
            Friends friends = new Friends();
            friends.setNama(data_nama[position]);
            friends.setUsername(data_username[position]);
            friends.setFoto(data_img[position]);
            list.add(friends);
        }
        return list;
    }
}
