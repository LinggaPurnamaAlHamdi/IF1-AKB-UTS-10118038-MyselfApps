/*
Tanggal pengerjaan : 1 Juni 2021
        NIM : 10118038
        Nama : Lingga Purnama Al Hamdi
        Kelas : IF-1
*/
package com.example.myselfapps.dailyactivity;

import java.util.ArrayList;

public class Daily_Data {
    private static String[] data_kegiatan = {
            "Bangun Tidur",
            "Mandi",
            "Sarapan",
            "Kuliah",
            "Main Game",
            "Nonton Film",
            "Shalat",
            "Makan Malam",
            "Tidur"
    };

    public static ArrayList<Daily> getListData() {
        ArrayList<Daily> list = new ArrayList<>();
        for (int position = 0; position < data_kegiatan.length; position++) {
            Daily daily = new Daily();
            daily.setKegiatan(data_kegiatan[position]);
            list.add(daily);
        }
        return list;
    }
}
