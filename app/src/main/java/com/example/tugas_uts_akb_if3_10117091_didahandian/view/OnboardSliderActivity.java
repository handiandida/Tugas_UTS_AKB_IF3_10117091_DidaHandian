package com.example.tugas_uts_akb_if3_10117091_didahandian.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.tugas_uts_akb_if3_10117091_didahandian.MainActivity;
import com.example.tugas_uts_akb_if3_10117091_didahandian.R;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

/** NIM : 10117091
 * Nama : Dida Handian
 * Kelas : IF-3
 * Tanggal : 11-05-2020
 **/

public class OnboardSliderActivity extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(new Step.Builder().setTitle("List Teman")
                .setContent("Menambahkan, Mengubah, dan Menghapus Profil Teman")
                .setBackgroundColor(Color.parseColor("#07faef")) // int background color
                .setDrawable(R.drawable.vp1) // int top drawable
                .setSummary("Dapat mencatat data profil teman")
                .build());
        addFragment(new Step.Builder().setTitle("Contact Personal")
                .setContent("Berisi tentang kontak pribadi")
                .setBackgroundColor(Color.parseColor("#07faef")) // int background color
                .setDrawable(R.drawable.vp2) // int top drawable
                .setSummary("Dapat melihat kontak pribadi")
                .build());
        addFragment(new Step.Builder().setTitle("Profile")
                .setContent("Menampilkan Profile")
                .setBackgroundColor(Color.parseColor("#07faef")) // int background color
                .setDrawable(R.drawable.vp3) // int top drawable
                .setSummary("Dapat menampilkan Profile")
                .build());
        setCancelText("Skip");

    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();
        Intent intent = new Intent(OnboardSliderActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}

