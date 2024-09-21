package com.yusufcanyildirim.superkahramanuygulamas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yusufcanyildirim.superkahramanuygulamas.databinding.ActivityTanitimAktivitesiBinding

class TanitimAktivitesi : AppCompatActivity() {

    private lateinit var binding: ActivityTanitimAktivitesiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanitimAktivitesiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapterdenGelenIntent = intent
        val secilenKahraman = adapterdenGelenIntent.getSerializableExtra("secilenKahraman") as SuperKahraman

        binding.imageView.setImageResource(secilenKahraman.gorsel)
        binding.isimTextView.text = secilenKahraman.isim
        binding.meslekTextView.text = secilenKahraman.meslek
    }
}
