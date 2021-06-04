/*
Tanggal pengerjaan : 1 Juni 2021
        NIM : 10118038
        Nama : Lingga Purnama Al Hamdi
        Kelas : IF-1
*/
package com.example.myselfapps.music;

import java.util.ArrayList;

public class Music_Data {
    private static String[] data_musik = {
            "UNION by OXT",
            "Silhouette by KANA-BOON",
            "Crossing Field by LiSA",
            "Nibun No Ichi by BACK-ON",
            "Colors by FLOW",
            "Kuchizuke Diamond by WEAVER",
            "Over Quartzer by Shuta Sueyoshi",
            "Be The One by PANDORA ft. Beverly",
            "RAGE OF DUST by SPYAIR",
            "IGNITE by Eir Aoi"
    };

    public static ArrayList<Music_Item> getListData() {
        ArrayList<Music_Item> list = new ArrayList<>();
        for (int position = 0; position <data_musik.length; position++) {
            Music_Item mi = new Music_Item();
            mi.setMusicList(data_musik[position]);
            list.add(mi);
        }
        return list;
    }
}
